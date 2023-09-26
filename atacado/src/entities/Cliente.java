package entities;

public class Cliente {
	
	public String Nome;
	public int QntdPecas;
	public float ValorPecas;

	public Cliente(String Nome, int QntdPecas, float ValorPecas) {
		this.Nome = Nome;
		this.QntdPecas = QntdPecas;
		this.ValorPecas = ValorPecas;
	}

	public String getNome() {
		return Nome;
	}


	public int getQntdPecas() {
		return QntdPecas;
	}


	public float getValorPecas() {
		return ValorPecas;
	}


	

}
