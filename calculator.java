package day7;

public class calculator {
	
	int Fnum;
	int Snum;
	
	
	void add() {
		System.out.println("Addition :"+(Fnum+Snum));
	}
		void sub() {
			System.out.println("sub :"+(Fnum-Snum));
	}
			void multi() {
				System.out.println("multi :"+(Fnum*Snum));
		}
				void division() {
					System.out.println("division :"+(Fnum/Snum));
				}
					void modules() {
						System.out.println("modules :"+(Fnum%Snum));
					
		
	}
					public static void main(String[] args) {
						calculator input = new calculator();
						calculator input2 = new calculator();
						calculator multi = new calculator();
						calculator input3 = new calculator();
						calculator modules = new calculator();
						input.Fnum=40;
						input.Snum=20;
						
						
						input.add();
						input.sub();
						input.multi();
						input.division();
						input.modules();
						
					}

}
