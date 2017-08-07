import java.util.Scanner;

public class GenderTitles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String title;
		
		System.out.print("First name: ");
		String first = keyboard.next();
		System.out.print("Last name: ");
		String last = keyboard.next();
		System.out.print("Gender (M/F/N): ");
		String gender = keyboard.next();
		System.out.print("Age: ");
		int age = keyboard.nextInt();
		System.out.print("Are you married, " + first + "? (y/n):");
		String married = keyboard.next();
				
		if (age < 20) {
			title = first;
		} else {
			if (gender.equals("F")) {
				if (married.equals("Y") || married.equals("y")) {
					title = "Mrs.";
				} else {
					title = "Ms.";
				}
			} else if (gender.equals("M")) {
				if (married.equals("Y") || married.equals("y")) {
					title = "Mr.";
				} else {
					title = "Mr.";
				}
			} else {
				title = "Mx.";
			}
		}
		
		System.out.println("\n" + title + " " + last);
	}
}