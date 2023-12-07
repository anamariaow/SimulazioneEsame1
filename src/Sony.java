public class Sony extends Televisore {
    char modello;

    public Sony(String colore, int dimensioni, Applicazioni[] applicazioni, int canaliDisponibili, char modello) {
        super(colore, dimensioni, applicazioni, canaliDisponibili);
        this.modello = modello;
    }

    public char getModello() {
        return modello;
    }

    public void setModello(char modello) {
        this.modello = modello;
    }

    @Override
    public void sceltaApplicazione() {
    }
    @Override
    public void stampaDettagli() {
        System.out.println("\nMarca Sony: \n");
        super.stampaDettagli();
        System.out.println("Modello: " + modello);
    }
}
