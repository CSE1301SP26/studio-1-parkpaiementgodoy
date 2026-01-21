package studio1;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		System.out.println("Value for n1?");
		int n1 = in.nextInt();
		System.out.println("Value for n2?");
		int n2 = in.nextInt();
		
        System.out.println("The first of two integers to be averaged"+(n1+n2)/2);
System.out.println ("average of" + n1 + "and " +n2 +  "is" + (n1+n2)/2.0);
}
}