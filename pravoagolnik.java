package magdalena;
import java.util.Scanner;
public class pravoagolnik {
public static void main (String[]args) {
	double povrsina,perimetar;
	Scanner tastatura = new Scanner(System.in);
	System.out.println("programata presmetuva perimetar i povrsina na pravoagolnik");
	System.out.println("vnesete dolzina na edna stranat");
	double a= tastatura.nextDouble();
	System.out.println(a);
	System.out.println("vnesete dolzina na druga strana");
	double b= tastatura.nextDouble();
	System.out.println(b);
	perimetar=2*(a+b);
	povrsina=(a)*(b);
	System.out.println();
	System.out.println("perimetarot e"+perimetar);
	System.out.println("povrsinata e"+povrsina);
}
}
