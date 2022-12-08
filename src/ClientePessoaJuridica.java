public class ClientePessoaJuridica extends Cliente {
	private String cnpj;
	private int qtdFiliais;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getQtdFiliais() {
		return qtdFiliais;
	}

	public void setQtdFiliais(int qtdFiliais) {
		this.qtdFiliais = qtdFiliais;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome cliente: " + getNome() + "\nCNPJ: " + getCnpj() + "\nEmail: " + getEmail()+ "\nData de nascimento: " + getDataNasc() + "\nQuantidade de filiais: " + getQtdFiliais() + "\n";
	}
}
