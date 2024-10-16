import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vagas = 0;

        // Loop para garantir que o usuário digite um número válido para as vagas
        while (true) {
            try {
                System.out.println("Digite a quantidade de vagas: ");
                vagas = input.nextInt();
                break; // Sai do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido...");
                input.next(); // Limpa a entrada inválida para tentar novamente
            }
        }

        // Criando a instância do estacionamento fora do loop para manter os dados
        Estacionamento estacionamento = new Estacionamento(vagas);

        // Loop para o menu do estacionamento
        while (true) {
            try {
                System.out.println("""
                        -----------------------
                            Estacionamento
                        -----------------------
                        [1] emitir ticket
                        [2] pagar ticket
                        [3] saldo
                        [4] sair
                        -----------------------
                                Oct, 2024
                        -----------------------
                        """);
                int escolha = input.nextInt();

                switch (escolha) {
                    case 1:
                        Tickets ticket = estacionamento.gerarTicket();
                        if (ticket != null) {
                            System.out.println("Ticket emitido...");
                            System.out.println("ID do Ticket: " + ticket.getId());
                        }
                        break;

                    case 2:
                        System.out.println("Qual ticket você deseja pagar? (Digite o ID)");
                        try {
                            int ticketID = input.nextInt();
                            Tickets ticketPagar = estacionamento.buscarTicketID(ticketID);

                            if (ticketPagar != null) {
                                System.out.println("Ticket encontrado...");

                                boolean sucesso = estacionamento.pagarTicket(ticketPagar);
                                if (sucesso) {
                                    System.out.println("Ticket pago com sucesso!");
                                } else {
                                    System.out.println("Erro ao processar o pagamento do ticket.");
                                }
                            } else {
                                System.out.println("Ticket não encontrado.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("ID inválido. Digite um número inteiro.");
                            input.next(); // Limpa a entrada inválida para tentar novamente
                        }
                        break;

                    case 3:
                        System.out.println("Saldo atual: R$ " + estacionamento.verSaldo());
                        break;

                    case 4:
                        System.out.println("Saindo do sistema...");
                        input.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número.");
                input.next(); // Limpa a entrada inválida para tentar novamente
            }
        }
    }
}
