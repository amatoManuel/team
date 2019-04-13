package Es;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Team  team = new Team();
		String name, surname, role;
		int shirtNumber = 0;
		int choice = 0;

		do{
			System.out.println("-------------TEAM-------------");
			System.out.println("1-Inserisci giocatore");
			System.out.println("2-Cerca giocatore per nome");
			System.out.println("3-Cerca giocatore per cognome");
			System.out.println("4-Cerca giocatore per ruolo");
			System.out.println("5-Stampa squadra");
			System.out.println("0-Esci");

			choice = input.nextInt();

			switch (choice){
				case 1:
					System.out.println("Inserisci nome");
					name = input.next();
					System.out.println("Inserisci cognome");
					surname = input.next();
					System.out.println("Inserisci numero di maglia");
					shirtNumber = input.nextInt();
					System.out.println("Inserisci ruolo");
					role = input.next();
					team.addNewPlayer(name, surname, shirtNumber, role);
					break;

				case 2:
					System.out.println("Inserisci nome");
					name = input.next();
					System.out.println(team.searchPlayerByName(name));
					break;
				case 3:
					System.out.println("Inserisci cognome");
					surname = input.next();
					System.out.println(team.searchPlayerBySurname(surname));
					break;
				case 4:
					System.out.println("Inserisci role");
					role = input.next();
					System.out.println(team.searchPlayerByRole(role));
					break;
				case 5:
					System.out.println(team);
			}
		}while(choice != 0);

	}

}
