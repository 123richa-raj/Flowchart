package Flowchart;
import java.util.*;

public class Area_triangle_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s = ((a+b+c)/2);
		double ans  =  Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
		System.out.println(ans);
	}
}