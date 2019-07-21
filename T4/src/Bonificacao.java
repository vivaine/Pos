public class Bonificacao {

    public double calculoBonus (Double valorSalario,  TipoCargo tipoCargo){
    	return valorSalario * tipoCargo.getPercentualBonificacao();
    }
}