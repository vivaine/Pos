public enum TipoConta {
CONJUNTA(5, 3),
CORRENTE(2.0, 2.5),
EMPRESARIAL (4, 3.8),
ESTUDANTE(7, 8);
	
	private Desconto desconto;
	private Juros juros;
	
	
	TipoConta(double valorDesconto, double valorJuros) {
		desconto = new Desconto(valorDesconto);
		juros = new Juros(valorJuros);
	}
	
	public Desconto getDesconto() {
		return desconto;
	}
	
	public Juros getJuros() {
		return juros;
	}
	

}
