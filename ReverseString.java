package day6;

public class ReverseString {
	public static void main(String[] args) {
		String name="Hemanth";
		String re= "";
		for (int i=6;i>=0;i--) {
			re += name.charAt(i);

//			System.out.print(name.charAt(i));
		}
		System.out.println(re.toUpperCase());
	}

}
