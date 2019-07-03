public class ClientePessoaFisica extends Cliente {
	
	private String profissao;
	
	public ClientePessoaFisica(String nome) {
		super(nome);
	}
	
	public String getProfissao() {
		return profissao;
	}
	
	public void setProfissao(String valor) {
		profissao = valor;
	}

}
