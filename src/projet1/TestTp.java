package projet1;

import java.util.Scanner;

public class TestTp {

	public static void main(String[] args) {
		double temperature = 0;
		String reponse = "oui";
		int mode = 1;
		Scanner sc = new Scanner(System.in);

		while (reponse == "oui") {
			System.out.println("Quelle conversion souhaitez-vous effectuer? " + "\n 1 : Celsius vers Farhenheit"
					+ "\n 2 : Farhenheit vers Celsius");
			mode = 1;
			mode = sc.nextInt();

			if (mode == 1) {
				System.out.println("Renseignez une température");
				temperature = sc.nextDouble();
				System.out.println(temperature + "°C correspond à " + (((temperature - 32) * 5) / 9) + "°F");
			}

			else {
				System.out.println("Renseignez une température");
				temperature = sc.nextDouble();
				System.out.println(temperature + "°F correspond à " + (((9 / 5) * temperature) + 32) + "°C");

			}
			System.out.println("Voulez-vous continuer? (oui/non)");
			reponse = sc.nextLine();

		}

		System.out.println("Au revoir!");
	}

}
