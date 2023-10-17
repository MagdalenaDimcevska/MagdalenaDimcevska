		package proekt_1;
		import java.util.Scanner;
		public class plostinaiperimetar {

			public static void main(String[] args) {
				double p,l;
				System.out.println("Programata presmetuva perimetar i plostina na pravoagolnik");
				Scanner tastatura = new Scanner(System.in);
				double a = tastatura.nextDouble();
				System.out.println("stranata e"+a+"cm");
				double b = tastatura.nextDouble();
				System.out.println("stranata e"+b+"cm");
				System.out.println();
				p=(a*b);
				System.out.println("plostinata e"+p);
				l=2*(a+b);
				System.out.println("perimetarot e"+l);

	}

}
