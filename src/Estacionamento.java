import java.util.ArrayList;

public class Estacionamento {
    private int vagas;
    private double saldo;
    private ArrayList<Tickets> tickets;

    public Estacionamento(int vagas) {
        this.vagas = vagas; // Corrigido para usar o parâmetro fornecido
        this.saldo = 0;
        this.tickets = new ArrayList<>();
    }

    // Lógica para emissão de tickets
    public Tickets gerarTicket() {
        if (tickets.size() < vagas) { // Verifica se há vagas disponíveis
            Tickets ticket = new Tickets();
            tickets.add(ticket);
            return ticket;
        } else {
            System.out.println("Não há vagas disponíveis...");
            return null;
        }
    }

    // Lógica para pagamento do ticket
    public boolean pagarTicket(Tickets ticket) {
        if (ticket != null && ticket.isStatus()) {
            ticket.pagarTicket();
            this.saldo += ticket.getValor();
            System.out.println("Ticket pago!!");
            System.out.println("Valor do ticket: R$" + ticket.getValor());
            tickets.remove(ticket); // Remove o ticket pago dos tickets ativos
            System.out.println("Veículo saiu do estacionamento...");
            return true;
        } else {
            System.out.println("Ticket já pago ou inexistente...");
            return false;
        }
    }

    // Verificar o saldo total
    public double verSaldo() {
        return saldo;
    }



    public Tickets buscarTicketID(int id) {
        for (Tickets ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }
}
