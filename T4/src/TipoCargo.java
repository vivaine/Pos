public enum TipoCargo {
    ADMINISTRATIVO(0.4, 500, 1000),
    ACADEMICO(0.2, 300, 500),
    OUTROS(0.5, 0, 0);
	
	private double percentualBonificacao;
	private double limiteSalarioInferior;
	private double limiteSalarioSuperior;
	
	TipoCargo(double percentualBonificacao, double limiteSalarioInferior, double limiteSalarioSuperior) {
		this.percentualBonificacao = percentualBonificacao;
		this.limiteSalarioInferior = limiteSalarioInferior;
		this.limiteSalarioSuperior = limiteSalarioSuperior;
	}
	
	public double getPercentualBonificacao() {
		return percentualBonificacao;
	}
	
	public double getLimiteSalarioInferior() {
		return limiteSalarioInferior;
	}
	
	public double getLimiteSalarioSuperior() {
		return limiteSalarioSuperior;
	}
}