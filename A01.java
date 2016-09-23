import java.util.*;

class A01 
	{
	int age=0;
	public static void main(String[] s){

		new A01().start();
		}

		void start(){
			Scanner s = new Scanner(System.in);
			System.out.print("your birth_year ");
			int birth = s.nextInt();
			this.age = 2016 - birth + 1;
			print();
		}

		void print(){
			if(this.age < 20)
				System.out.println("children");
			else
				System.out.println("adult");
		}
}
