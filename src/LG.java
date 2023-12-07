public class LG extends Televisore {
    boolean connessioneWifi;
    public LG (String colore, int dimensioni, Applicazioni[] applicazioni, int canaliDisponibili, boolean connessioneWifi) {
        super(colore, dimensioni, applicazioni, canaliDisponibili);
        this.connessioneWifi = connessioneWifi;
    }

    public boolean isConnessioneWifi() {
        return connessioneWifi;
    }

    public void setConnessioneWifi(boolean connessioneWifi) {
        this.connessioneWifi = connessioneWifi;
    }

    @Override
    public void sceltaApplicazione() {
    }
    @Override
    public void stampaDettagli() {
        System.out.println("\nMarca LG: \n");
        super.stampaDettagli();
        System.out.println("Connessione wifi: " + connessioneWifi);
    }

}
