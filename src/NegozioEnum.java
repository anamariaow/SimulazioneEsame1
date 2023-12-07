public enum NegozioEnum {
    MEDIAWORLD("Mediaworld", new String[] {"Milano", "Torino", "Imola"}),
    UNIEURO("Unieuro",new String[] {"Firenze", "Livorno", "Viterbo"} ),
    TRONY("Trony", new String[] {"Genova", "Napoli", "Campobasso"});
    private String nomeNegozio;
    private String[] luoghi;

    NegozioEnum(String nomeNegozio, String[] luoghi) {
        this.nomeNegozio = nomeNegozio;
        this.luoghi = luoghi;
    }

    public String getNomeNegozio() {
        return nomeNegozio;
    }

    public String[] getLuoghi() {
        return luoghi;
    }
}
