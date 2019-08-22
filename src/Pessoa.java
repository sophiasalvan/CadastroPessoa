
public class Pessoa {
	private Integer id;
	private String idade;
	private String nome;
	private String sexo;
	
	public Pessoa() {
		super();
	}

	public Pessoa(Integer id, String idade, String nome, String sexo) {
		super();
		this.id = id;
		this.idade = idade;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
