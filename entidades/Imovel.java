package entidades;

public class Imovel {

	protected String nome;
	protected String endereco;
	protected double area;
	protected double valor;
	
	public Imovel() {
		
	}
	
	public Imovel(String nome, String endereco, double area, double valor) {
		this.nome = nome;
		this.endereco = endereco;
		this.area = area;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double mostrarValorVenda() {
		return getValor();
	}
	
	
	@Override
	public String toString() {
		return "Imovel Proprietario=" + getNome()
				+ ", Endereco=" + getEndereco()
				+ ", Area=" + getArea()
				+ ", Valor=" + getValor();
	}
	
	
	
}
