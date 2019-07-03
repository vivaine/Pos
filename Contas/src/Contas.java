
public class Contas {
	
	public static void main(String[] args) {
		Cliente cliente = new ClientePessoaFisica("Joana Ribeiro");
		Conta conta = new Conta(cliente, TipoConta.CONJUNTA);
		conta.deposita(1000.0);
	    System.out.println("Saldo bruto = " + conta.getSaldo());
	    System.out.println("Saldo líquido = " + conta.getTipoConta().getJuros().calculaJuros(conta.getTipoConta().getDesconto().calculaDesconto(conta.getSaldo())));
		}

}
