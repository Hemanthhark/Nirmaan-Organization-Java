package day1;

public class Operators {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 33;
		int d = 44;
		int value = 10;
		int value2 = 12;
		System.out.println("Arithmetic Operations:");
		System.out.println("Addition: " +(a+b));
		System.out.println("Subtraction: " +(a-b));
		System.out.println("Multiplication: " +(a*b));
		System.out.println("Division: " +(a/b));
		System.out.println("Modules: " +(a%b));
		System.out.println();
		
		System.out.println("Relational Operations: ");
		System.out.println(a+" > "+b +" : "+(a>b));
		System.out.println(a+" < "+b +" : "+(a<b));
		System.out.println(a+" >= "+b +" : "+(a>=b));
		System.out.println(a+" <= "+b +" : "+(a<=b));
		System.out.println(a+" == "+b +" : "+(a==b));
		System.out.println(a+" != "+b +" : "+(a!=b));
		System.out.println();
		
		System.out.println("Logical Operations: ");
		System.out.println(a+" > "+b +" AND "+c+" < "+d +" : "+ ((a>b)&&(c>d)));
		System.out.println(a+" < "+b +" OR "+c+" > "+d +" : "+((a<b)||(c>d)));
		System.out.println();
		
		System.out.println("Assignment Operations: ");
		System.out.println("Initial value: "+value);
		System.out.println("After += :" + (value+=12));
		System.out.println("After -= :" + (value-=12));
		System.out.println("After *= :" + (value*=12));
		System.out.println("After /= :" + (value/=12));
		System.out.println("After %= :" + (value%=2));
		System.out.println();
		
		System.out.println("Unary Operations: ");
		System.out.println("Initial value: "+value2);
		System.out.println("After increment: "+(++value2));
		System.out.println("After decrement: "+(--value2));
		System.out.println();
		
		System.out.println("Conditional Operations: ");
		String isTrue = (12%2==0)?"Even":"odd";
		System.out.println("12 is "+isTrue);
		
		
	}
}
