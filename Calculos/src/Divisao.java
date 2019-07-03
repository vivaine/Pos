
public class Divisao implements Calculo {

	@Override
	public double resultado(double valor1, double valor2) {
		// TODO Auto-generated method stub
		if (valor2 != 0) 
			return valor1 / valor2;
			else
				return 0;
	}

}
