public class Conta {
	
	private double saldo;
	private Cliente cliente;
	private TipoConta tipoConta;
	
	public Conta(Cliente cliente, TipoConta tipoConta) {
		this.tipoConta = tipoConta;
		this.cliente = cliente;
		saldo = 0;
	}

	public boolean saca(double valorDoSaque){
		if(getSaldo() < valorDoSaque){
			return false;
		} else {
			saldo = saldo - valorDoSaque;
			return true;
		}
	}

	public void deposita(double valorDepositado){
		saldo = saldo + valorDepositado;
	}

    public double getSaldo() {
        return saldo;
    }
    
    public TipoConta getTipoConta() {
    	return this.tipoConta;
    }
  

}
