import java.util.*;

class A01 {
	public static void main(String[] s){

		new A01().start();
		}

		void start(){
			Scanner s = new Scanner(System.in);
			System.out.print("태어난 년도를 입력하세요");
			int birth = s.nextInt;
			this.age = 2016 - birth + 1;
			print();
		}

		void print(){
			if(this.age < 20)
				System.out.println("미성년자 입니다.");
			else
				System.out.println("미성년자가 아닙니다.");
		}
}
