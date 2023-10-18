package proekt_1;

import java.util.Scanner;

public class kruznica {
		public static void main(String[] args) {
			double p,l;
			System.out.println("Programata presmetuva perimetar i plostina na kruznica");
			Scanner tastatura = new Scanner(System.in);
			System.out.println("radium e");
			double r = tastatura.nextDouble();
			System.out.println(r+"cm");
			System.out.println("pi e");
			double pi = tastatura.nextDouble();
			System.out.println(pi+"cm");
			System.out.println();
			p=r*r*pi;
			System.out.println("plostinata e"+p);
			l=2*r*pi;
			System.out.println("perimetarot e"+l);
	}

}
