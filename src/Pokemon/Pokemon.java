package Pokemon;
import Type.Type;

public class Pokemon extends Type{
	private String nome;
	private Type type;
	private Type type2;


	public Pokemon(String nome, Type type, Type type2) {
		super();
		this.nome = nome;
		this.type = type;
		this.type2 = type2;
	}


	@Override
	public String toString() {
		return "Pokemon [nome=" + nome + " type 1=" + type + "|" +(type2 != null ? "type 2=" + type2 : "") + "]";
	}


	
	
	
}
