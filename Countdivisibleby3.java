package day5;

public class Countdivisibleby3 {
	public static void main(String[] args) {
		int count =0;
		for(int i=1;i<=30;i++) {
			if(i%3==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Count :" +count);
	}

}
