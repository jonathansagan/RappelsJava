package projet1;

import java.util.Scanner;

public class boucleWhile {

	public static void main(String[] args) {
		String prenom;
		char reponse = 'O';
		Scanner sc = new Scanner(System.in);
		while (reponse == 'O') {
			System.out.println("Donnez un pr�nom : ");
			prenom = sc.nextLine();
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");

			reponse = ' '; // Sans �a, nous n'entrerions pas dans la deuxi�me boucle

			while (reponse != 'O' && reponse != 'N') /*Tant que la r�ponse n'est pas O ou N,
			 on repose la question */
														 
			{
				// On demande si la personne veut faire un autre essai
				System.out.println("Voulez-vous r�essayer ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}
		}
		System.out.println("Au revoir�");
		// fin de la boucleop
	}

}
