public class Desconto {
	
	private double desconto;
	
	public Desconto (double desconto) {
		this.desconto = desconto;
	}
	
	double calculaDesconto(double valor) {
		return valor - valor*desconto/100;
	}

}
