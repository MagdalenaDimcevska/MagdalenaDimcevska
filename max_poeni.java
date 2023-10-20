package proekt_1;
import java.util.Scanner;
public class max_poeni {

	public static void main(String[] args) {
		double max=0,b=0,p=0;
		System.out.println("Programata presmetuva max poeni koj studentot moze da dobie na test");
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Vnesete  go max broj na poeni");
		max=tastatura.nextDouble();
		System.out.println("Vnesete go brojot na poeni sto gi dobil studentot");
		b=tastatura.nextDouble();
		p=b/max*100;
	if(b>max) {
		System.out.println("Studentot go pominal studentot no za zal tolku poeni ne moze da dobie");
		System.exit(0);}
		p=b/max*100;{
		if(p<51){
		System.out.println("Studentot padnal");}
		else if (p>=51 && p<=60){
			System.out.println("Studentot dobil 6");}
		else if(p>=61 && p<=70){
		System.out.println("Studentot dobil 7");}
		else if (p>=71 && p<=80){
		System.out.println("Studentit dobil 8");}
		else if (p>=81 && p<=90){
		System.out.println("Studentit dobil 9");}
		else if (p>=91 && p<=100){
		System.out.println("Studentit dobil 10");}
}
}
}