package projet1;

import java.util.Scanner;

public class boucleWhile {

	public static void main(String[] args) {
		// d�claration d'une variable vide
		String prenom;
		// On initialise celle-ci � O pour oui
		char reponse = 'O';
		// Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
		Scanner sc = new Scanner(System.in);
		// Tant que la r�ponse donn�e est �gale � oui�
		while (reponse == 'O') {
			// On affiche une instruction
			System.out.println("Donnez un pr�nom : ");
			// On r�cup�re le pr�nom saisi
			prenom = sc.nextLine();
			// On affiche notre phrase avec le pr�nom
			System.out.println("Bonjour " + prenom + ", comment vas-tu ?");
			// On demande si la personne veut faire un autre essai
			System.out.println("Voulez-vous r�essayer ? (O/N)");
			// On r�cup�re la r�ponse de l'utilisateur
			reponse = sc.nextLine().charAt(0);
		}

		System.out.println("Au revoir�");
		// Fin de la boucle
	}

}
