import java.util.Arrays;

public abstract class Televisore {
    private String colore;
    private int dimensioni;
    private Applicazioni[] applicazioni; //forse meglio array list
    private int canaliDisponibili;

    public Televisore(String colore, int dimensioni, Applicazioni[] applicazioni, int canaliDisponibili) {
        this.colore = colore;
        this.dimensioni = dimensioni;
        this.applicazioni = applicazioni;
        this.canaliDisponibili = canaliDisponibili;
    }

    public String getColore() {
        return colore;
    }

    public String getDimensioni() {
        return dimensioni + "\"";
    }

    public Applicazioni[] getApplicazioni() {
        return applicazioni;
    }

    public int getCanaliDisponibili() {
        return canaliDisponibili;
    }


    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }

    public void setApplicazioni(Applicazioni[] applicazioni) {
        this.applicazioni = applicazioni;
    }

    public void setCanaliDisponibili(int canaliDisponibili) {
        this.canaliDisponibili = canaliDisponibili;
    }

    public abstract void sceltaApplicazione();
    public void stampaDettagli() {
        System.out.println("Colore: " + colore + '\n' + "Dimensioni: " + dimensioni + '\n' + "Applicazioni: " + Arrays.toString(applicazioni) + '\n' + "Canali disponibili: " + canaliDisponibili);
    }

    @Override
    public String toString() {
        return "Televisore{" +
                ", colore='" + colore + '\'' +
                ", dimensioni=" + dimensioni +
                ", applicazioni=" + Arrays.toString(applicazioni) +
                ", canaliDisponibili=" + canaliDisponibili +
                '}';
    }
}

