public class Tickets {
    private static int ticketCounter = 0;
    private int valor;
    private int id;
    private boolean status;

    public Tickets() {
        this.valor = 5;
        this.id = ++ticketCounter;
        this.status = false;
    }
    public int getId() {
        return id;
    }

    public int getValor() {
        return valor;
    }

    public boolean isStatus() {
        return status;
    }
     public void pagarTicket(){
        this.status = true;
     }
}
