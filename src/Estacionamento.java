import java.util.ArrayList;

public class Estacionamento {
    private final int vagas;
    private double saldo;
    ArrayList<Tickets> tickets;


    public Estacionamento(int vagas) {
        this.vagas = 0;
        this.saldo = 0;
        this.tickets = new ArrayList<>();
    }
    //logica da emissão de tickets
    public Tickets gerarTicket() {
       if (tickets.isEmpty()) {
           Tickets ticket = new Tickets();
           tickets.add(ticket);
           return ticket;
       } else {
           System.out.println("Não há vagas disponiveis...");
           return null;
       }

    }
    //lógica do pagamento
    public int pagarTicket(Tickets ticket) {
        if (ticket != null && ticket.isStatus()) {
            ticket.pagarTicket();
            this.saldo += ticket.getValor();
            System.out.println("Ticket pago!!");
            System.out.println("Valor do ticket: R$" + ticket.getValor() );
            tickets.remove(ticket);
            System.out.println("Veiculo saiu do estacionamento...");
            return vagas;
        }else {
            System.out.println("Ticket pago ou inexistente...");
            return 0;
        }
    }
    public double verSaldo(){
        return saldo;
    }

    public Tickets ticketID(int id){
        for (Tickets ticket : tickets) {
            if (ticket.getId() == id) {
                return ticket;
            }
        }
        return null;
    }

}



