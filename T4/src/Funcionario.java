public class Funcionario {
	
    private String nome;
    private int horasTrabalhada;
    private Double salarioHora;
    private int numeroDependentes;
    private TipoCargo tipoCargo;	

    public Funcionario(String nome, TipoCargo tipoCargo) {
    	this.nome = nome;
    	this.tipoCargo = tipoCargo;
    }
    
    public String getNome () {
        return nome;
    }

    public int getHorasTrabalhada () {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada (final int horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }

    public Double getSalarioHora () {
        return salarioHora;
    }

    public void setSalarioHora (final Double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getNumeroDependentes () {
        return numeroDependentes;
    }

    public void setNumeroDependentes (final int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public TipoCargo getTipoCargo () {
        return tipoCargo;
    }
 
}
