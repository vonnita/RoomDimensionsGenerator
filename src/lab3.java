import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
Scanner scan1 = new Scanner(System.in);
System.out.println("Learn your squares & cubes!");
System.out.println("Enter an integer:");
 userInput = scan1.nextInt();
 scan1.nextLine();
 
 for (int i = 1; i <= userInput; i++) {
int square = i*i;
int cube = i*i*i;
System.out.println(i+" "+ square+" " +cube);

}
	}

}
