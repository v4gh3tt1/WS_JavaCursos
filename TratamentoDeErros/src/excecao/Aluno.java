package excecao;

public class Aluno {
	
	private String nome;
	private String endereco;
	private double notaMedia;
	
	
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
	
	public double getNotaMedia() {
		return notaMedia;
	}
	
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String endereco, double notaMedia) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", endereco=" + endereco + ", notaMedia=" + notaMedia + "]";
	}
	
	/*public static void imprimeNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}*/
	

}
