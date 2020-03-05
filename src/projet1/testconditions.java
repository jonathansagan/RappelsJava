package projet1;
// switch
public class testconditions {

	public static void main(String[] args) {
		int note = 10; //On imagine que la note maximale est 20

		switch (note)
		{
		  case 0:
		    System.out.println("Ouch !");
		    break;// si un cas correspond, permet de sortir de la condidtion switch
		  case 10:
		    System.out.println("Vous avez juste la moyenne.");
		    break;
		  case 20:
		    System.out.println("Parfait !");
		    break;
		  default:
		    System.out.println("Il faut davantage travailler.");
		}

	}

}
