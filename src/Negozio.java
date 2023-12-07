import java.util.Arrays;

public class Negozio {
    private Televisore[] televisori;
    private NegozioEnum negozioVar;

    public Negozio(Televisore[] televisori, NegozioEnum negozioVar) {
        this.televisori = televisori;
        this.negozioVar = negozioVar;
    }

    public Televisore[] getTelevisori() {
        return televisori;
    }

    public void setTelevisori(Televisore[] televisori) {
        this.televisori = televisori;
    }

    public NegozioEnum getNegozioVar() {
        return negozioVar;
    }

    public void setNegozioVar(NegozioEnum negozioVar) {
        this.negozioVar = negozioVar;
    }

    public void stampaTelevisori() {
        for (Televisore televisore : televisori) {
            televisore.stampaDettagli();
        }
    }


    @Override
    public String toString() {
        return "Negozio{" +
                "televisori=" + Arrays.toString(televisori) +
                '}';
    }
}
