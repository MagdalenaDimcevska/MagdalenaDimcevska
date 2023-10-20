package proekt_1;
import java.util.Scanner;
public class suma1 {
	public static void main(String[] args) {
		double a,b,c,d,e;
		int s1=0,s2=0;
		Scanner tastatura=new Scanner(System.in);
		System.out.println("vnesi go prviot broj");
		a = tastatura.nextDouble();
		System.out.println("vnesi go vtoriot broj");
		b = tastatura.nextDouble();
		System.out.println("vnesi go tretiot broj");
		c = tastatura.nextDouble();
		System.out.println("vnesi go cetvrtiot broj");
		d = tastatura.nextDouble();
		System.out.println("vnesi go petiot broj");
		e = tastatura.nextDouble();
		if(a%2==0) 
			s1+=a;
		else {
			s2+=a;
		}
	if(b%2==0) {
		s1+=b;}
	else {
		s2+=b;
	}
	if(c%2==0) {
		s1+=c;}
	else {
		s2+=c;
	}if(d%2==0) {
		s1+=d;}
	else {
		s2+=d;
	}if(e%2==0) {
		s1+=e;}
	else {
		s2+=e;
	}
	System.out.println("Sumata na parnite e"+s1);
	System.out.println("Sumata na neparnite e"+s2);
	}

}
