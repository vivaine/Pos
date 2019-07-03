public class Calculos {

	public static void main(String[] args) {
		Soma teste = new Soma();
		double valor =  teste.resultado(10, 50);
		System.out.println("Soma = " + valor);
		
		Subtracao teste2 = new Subtracao();
		double valor2 = teste2.resultado(30, 3);
		System.out.println("Subtração = " + valor2);
		
		Multiplicacao teste3 = new Multiplicacao();
		double valor3 = teste3.resultado(30, 3);
		System.out.println("Multiplicação = " + valor3);
		
		Divisao teste4 = new Divisao();
		double valor4 = teste4.resultado(30, 0);
		System.out.println("Divisão = " +valor4);		

	}

}
