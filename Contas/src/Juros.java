
public class Juros {
	
	private double taxa;
	
	public Juros (double taxa) {
		this.taxa = taxa;
	}
	
	public double calculaJuros(double valor) {
		return valor + valor*taxa/100;
	}

}
