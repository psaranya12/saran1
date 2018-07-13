package sample;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		int n ;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n>=1){
			System.out.println("the given value is Positive");
		}
		else if(n==0){
			System.out.println("the given value is Zero");
		}
		else{
			System.out.println("the given value is Negative");
		}
		// TODO Auto-generated method stub

	}

}
