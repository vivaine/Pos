public class BonificacaoVO {

    private String nome;
    private Double valorBonus;

    public BonificacaoVO (final String nome, final Double valorBonus) {
        this.nome = nome;
        this.valorBonus = valorBonus;
    }

    public String getNome () {
        return nome;
    }

    public Double getValorBonus () {
        return valorBonus;
    }

}