public class FolhaPagamento {

    private Tributos tributos;
    public Funcionario funcionario;
    
    public FolhaPagamento (Funcionario funcionario) {
    	this.funcionario = funcionario;
    	this.tributos = new Tributos(funcionario.getTipoCargo().getLimiteSalarioInferior(), 
    		funcionario.getTipoCargo().getLimiteSalarioSuperior());
    }
 
    public double calculoSalarioBruto() {
        return funcionario.getHorasTrabalhada() * funcionario.getSalarioHora() + (50 * funcionario.getNumeroDependentes());
    }
    
    public double calculoDescontoInss() {
    	return tributos.calculoDescontoInss(calculoSalarioBruto());
    }

    public double calculoImpostoRenda() {
    	return tributos.calculoImpostoRenda(calculoSalarioBruto());
    }

    public double calculoSalarioLiquido() {
        return this.calculoSalarioBruto() - this.calculoDescontoInss() - this.calculoImpostoRenda();
    }    


}
