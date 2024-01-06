package Flowchart;
import java.util.*;


public class digit_evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int m =n%10;
		int p = n/10;
			if(m%2==0) {
				System.out.println("Even");
				
			}
			else
				System.out.println(p);
			
		
	}

}
