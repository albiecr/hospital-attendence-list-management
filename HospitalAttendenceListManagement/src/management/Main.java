package management;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		HospitalList ListofPatient = new HospitalList();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out
					.println("\n ==== Main Menu ===\n1. Add patient \n2. Call next patient \n3. Show lists \n4. Exit");
			System.err.println("\n\nEscolha uma opção:\n");
			int option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
			case 1:
				System.out.println("Patient name: ");
				String name = scanner.nextLine();
				System.out.println("Attendence type (NORMAL/PREFERENTIAL)");
				String type = scanner.nextLine().toUpperCase();

				try {
					typeAttendence MedicalTypeAttendence = typeAttendence.valueOf(type);
					patient x = new patient(name, MedicalTypeAttendence);
					ListofPatient.AddPatient(x);
					System.out.println("Patient added!");
				} catch (IllegalArgumentException e) {
					System.err.println("Invalid type!");
				}
				break;

			case 2:
				patient nextPatient = ListofPatient.callNext();
				if (nextPatient != null) {
					System.out.println("Calling: " + nextPatient.getName());
				} else {
					System.out.println("There's no patient on the list!");
				}
				break;
				
			case 3:
				ListofPatient.showLists();
				break;
				
			case 4:
				System.out.println("Closing...");
				scanner.close();
				return;
			default:
				System.err.println("Invalid option!");
			}

		}
	}
}