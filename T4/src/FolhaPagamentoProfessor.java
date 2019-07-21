public class FolhaPagamentoProfessor extends FolhaPagamento implements Bonus{

	private Bonificacao bonificacao;
	
    public FolhaPagamentoProfessor (Funcionario funcionario) {
    	super(funcionario);
    	bonificacao = new Bonificacao();
    }
    
    public double calculoBonus () {
    	return bonificacao.calculoBonus(calculoSalarioLiquido() , funcionario.getTipoCargo());
    }

}