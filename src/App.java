import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vagas;
        System.out.println("Digite a quantidade de vagas: ");
        vagas = input.nextInt();

        while(true) {

            Estacionamento estacionamento = new Estacionamento(vagas);
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
                    Tickets tickets = estacionamento.gerarTicket();
                    if(tickets != null){
                        System.out.println("Ticket emitido...");
                        System.out.println(tickets.getId());
                    }
                    break;
                case 2:
                    System.out.println("Qual ticket você deseja pagar?");
                    int ticketID = input.nextInt();
                    Tickets ticketPagar = estacionamento.ticketID(ticketID);
                    if(ticketPagar != null){
                        System.out.println("Ticket pago...");
                        estacionamento.pagarTicket(ticketPagar);
                        System.out.println("Ticket pago com sucesso!");
                    }

                case 3:
                    System.out.println("R$" + estacionamento.verSaldo());
            }
        }
    }
}
