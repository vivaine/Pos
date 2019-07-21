public class Tributos {
	
	private double limiteInferiorSalario;
	private double limiteSuperiorSalario;
	

	public Tributos(double limiteInferiorSalario, double limiteSuperiorSalario) {
		this.limiteInferiorSalario = limiteInferiorSalario;
		this.limiteSuperiorSalario = limiteSuperiorSalario;
	}
	
	public double calculoDescontoInss(double salarioBruto) {
        if(salarioBruto > limiteSuperiorSalario ) {
            return salarioBruto * 9/100;
        }
        else {
            return salarioBruto * 8.5/100;
        }		
	}
	
    public double calculoImpostoRenda(double salarioBruto) {
        if(salarioBruto <= limiteInferiorSalario ) {
            return 0;
        }
        else if(salarioBruto > limiteSuperiorSalario) {
            return salarioBruto * 7/100;
        }

        else {
            return salarioBruto * 5/100;
        }
    }	
	
}
