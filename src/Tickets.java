public class Tickets {
    private int valor;
    private int id;
    private boolean status;

    public Tickets(){
        this.valor = 5;
        this.status = false;
    }
    public int getValor() {
        return valor;
    }
    public void setValor() {
        this.valor = valor;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus() {
        this.status = true;
    }
}
