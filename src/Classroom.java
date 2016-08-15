import java.util.Scanner;

public class Classroom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Scan1= new Scanner(System.in);

double length;
double width;
double area;
double perimeter;
System.out.println("Welcome to Grand Circus Room Detail Generator!");

System.out.println("Enter Length:");
length =Scan1.nextInt();
Scan1.nextLine();

System.out.println("Enter Width:");
width =Scan1.nextInt();
Scan1.nextLine();

area = width *length;
perimeter = 2*(length+ width);



System.out.println("area:" + area);
System.out.println("perimeter" + perimeter);

	}

}
