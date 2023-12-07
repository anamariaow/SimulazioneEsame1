import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Applicazioni[] applicazioniArray = {new Applicazioni("Netflix"), new Applicazioni("YouTube")};
        //Applicazioni[] applicazioniArray = new Applicazioni[2];
        //applicazioniArray[0] = new Applicazioni("Netflix");
        //applicazioniArray[1] = new Applicazioni("YouTube");
        Televisore LG = new LG("bianco", 22, applicazioniArray, 30, true);
        Televisore Sony = new Sony("nero", 32, applicazioniArray, 50, 'A');


        Negozio negozio1 = new Negozio(new Televisore[]{LG, Sony}, NegozioEnum.MEDIAWORLD);
        Negozio negozio2 = new Negozio(new Televisore[]{LG}, NegozioEnum.UNIEURO);
        Negozio negozio3 = new Negozio(new Televisore[]{Sony}, NegozioEnum.TRONY);

        System.out.println(negozio1.toString());
        negozio1.stampaTelevisori();
        System.out.println(negozio1.getNegozioVar().getNomeNegozio() + Arrays.toString(negozio1.getNegozioVar().getLuoghi()));


        LG.stampaDettagli();
        Sony.stampaDettagli();


    }
}