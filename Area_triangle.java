package Flowchart;
import java.util.*;
public class Area_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = ((a+b+c)/2);
		int ans  = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
		System.out.println(ans);
	}
}