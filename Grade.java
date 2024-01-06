package Flowchart;
import java.util.*;


public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=75) {
			System.out.println("A");
		}
		else if(65<=n && n>=75) {
			System.out.println("B");
		}
		else if(55<=n && n>=65) {
			System.out.println("C");
		}
		else if(45<=n && n>=55) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
