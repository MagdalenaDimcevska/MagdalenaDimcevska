package proekt_1;
import java.util.Scanner;
public class triagolnik {

	public static void main(String[] args) {
		double a,b,c;
		Scanner tastatura = new Scanner(System.in);
		System.out.println("vnesi ja prvata strana");
		a = tastatura.nextDouble();
		System.out.println("vnesi ja vtorata strana");
		b = tastatura.nextDouble();
		System.out.println("vnesi ja tretata strana");
		c = tastatura.nextDouble();
		if(a+c>b && a+b>c && b+c>a) {
			System.out.println("Se formira triagolnik");}
			else {
				System.out.println("Ne se formira triagolnik");
				System.exit(0);}
		if(c*c==a*a+b*b  || a*a==c*c+b*b  || b*b==c*c+a*a)
			System.out.println("triagolnikot e pravoagolen");
		else if ( c*c<a*a+b*b  || a*a<c*c+b*b  || b*b<c*c+a*a )
			System.out.println("triagolnikot e ostroagolen");
		else
			System.out.println("triagolnikot e tapoagolen");
	}

}
