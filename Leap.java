import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		System.out.println("Value for year?");
		int year = in.nextInt();
		
        boolean leapyear = (year%4 == 0 && year%100>0) || (year%400==0);

    System.out.println(year + " is a leap year " + leapyear);
    }
}
