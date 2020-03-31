package entidades;

public enum Situacao {

    DESOCUPADO(1, "Desocupado"),
    OCUPADO(2,"Ocupado"),
    EM_REFORMA(3, "Em Reforma");


    private int valorSit;
    private String sit;

    private Situacao(int valorSit, String sit) {
        this.sit = sit;
        this.valorSit = valorSit;
    }

    public int getValorSit() {
        return valorSit;
    }

    public String getSit() {
        return sit;
    }



}