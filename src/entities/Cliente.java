package entities;

public class Cliente {
	
	protected String nomeCompleto;	
	protected int enderecoCEP;
	protected int enderecoNumero;
	protected String enderecoReferencia;
	
	public Cliente() {		
	}	

	public Cliente(String nomeCompleto, int enderecoCEP, int enderecoNumero, String enderecoReferencia) {
		this.nomeCompleto = nomeCompleto;
		this.enderecoCEP = enderecoCEP;
		this.enderecoNumero = enderecoNumero;
		this.enderecoReferencia = enderecoReferencia;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getEnderecoCEP() {
		return enderecoCEP;
	}

	public void setEnderecoCEP(int enderecoCEP) {
		this.enderecoCEP = enderecoCEP;
	}

	public int getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(int enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoReferencia() {
		return enderecoReferencia;
	}

	public void setEnderecoReferencia(String enderecoReferencia) {
		this.enderecoReferencia = enderecoReferencia;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCompleto=" + nomeCompleto + ", enderecoCEP=" + enderecoCEP + ", enderecoNumero="
				+ enderecoNumero + ", enderecoReferencia=" + enderecoReferencia + "]";
	}	
}
	