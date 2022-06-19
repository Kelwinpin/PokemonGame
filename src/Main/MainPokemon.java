package Main;
import Pokemon.Pokemon;
import Type.Type;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
public class MainPokemon {
	public static void menuPkn(){
		System.out.println("<1>Charizard");
		System.out.println("<2>Blastoise");
		System.out.println("<3>Snorlax");
		System.out.println("<4>Pikachu");
		System.out.println("<5>Dragonite");
		System.out.println("<6>Primape");
	}
	
	public static Type Types(String nameType){
		
		HashMap<String, Type> types = new HashMap<String, Type>();
		
		var typeFire = new Type("Fire", "Water");
		types.put(typeFire.getType(), typeFire);
		
		var typeFly = new Type("Fly", "Eletric");
		types.put(typeFly.getType(), typeFly);
		
		var typeFight = new Type("Fight", "Fly");
		types.put(typeFight.getType(), typeFight);

		var typeNormal = new Type("Normal", null);
		types.put(typeNormal.getType(), typeNormal);

		var typeWater = new Type("Water", "Eletric");
		types.put(typeWater.getType(), typeWater);

		var typeEletric = new Type("Eletric", "Rock");
		types.put(typeEletric.getType(), typeEletric);

		var typeDragon = new Type("Dragon", "Ice");
		types.put(typeDragon.getType(), typeDragon);
		
		if(types.containsKey(nameType)) {
			return types.get(nameType);
		}else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		var pokemon = new Pokemon(null, null, null);
		
		System.out.println("Selecione um pokemon:");
		
		menuPkn();
		
		int chosse = sc.nextInt();
		
		switch(chosse){
			case 1:
				pokemon = new Pokemon("Charizard", Types("Fire"), Types("Fly"));
				break;
			case 2:
				pokemon = new Pokemon("Blastoise", Types("Water"), null);
				break;
			case 3:
				pokemon = new Pokemon("Snorlax", Types("Normal"), null);
				break;
			case 4:
				pokemon = new Pokemon("Pikachu", Types("Eletric"), null);
				break;
			case 5:
				pokemon = new Pokemon("Dragonite", Types("Dragon"), null);
				break;
			case 6:
				pokemon = new Pokemon("Primape", Types("Fight"), null);
				break;
			default:
				System.out.println("Opção não existente !!!");
		}			
	
		System.out.println(pokemon.toString());
		
	}

}
