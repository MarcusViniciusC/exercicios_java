package magos;

public abstract class Mago {
	private int poder;
	private String nome;
	public int getPoder() {
		return poder;
	}
	public void setPoder(int poder) {
		this.poder = poder;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String recarregarMagia() {
		return "recarregando magia";
	}
	
	public String curar() {
		return "curando ferimentos";
	}
}
