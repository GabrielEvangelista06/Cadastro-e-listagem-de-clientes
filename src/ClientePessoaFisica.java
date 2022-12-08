public class ClientePessoaFisica extends Cliente {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpfCliente) {
		this.cpf = cpfCliente;
	}

	@Override
	public String toString() {
		return "Nome cliente: " + getNome() + "\nCPF: " + getCpf() + "\nEmail: " + getEmail() + "\nData de nascimento: " + getDataNasc() + "\n";
	}

}
