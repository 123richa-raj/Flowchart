package Flowchart;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =9;
		int b = 8;
		int c = a++ - b++ - b-- + a++;
		System.out.println(c);
		int x = 6;
		int y = 5;
		int z = x++ + ++x - --b + ++b;
		System.out.println(z);
	}

}
