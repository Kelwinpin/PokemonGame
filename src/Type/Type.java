package Type;
import java.util.ArrayList;
public class Type {
	public static Type Pokemon;
	private String type, weakness;
	
	public Type() {
		// TODO Auto-generated constructor stub
	}
	
	public Type(String type, String weakness) {
		super();
		this.type = type;
		this.weakness = weakness;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeakness() {
		return weakness;
	}

	public void setWeakness(String weakness) {
		this.weakness = weakness;
	}

	@Override
	public String toString() {
		return "[type=" + type + ", weakness=" + weakness + "]";
	}
	
	
	
}
