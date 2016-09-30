import java.util.*;
class A06{
        void input(){
		String name;
		Scanner s = new Scanner(System.in);
		System.out.print(" 이름 : ");
		name = s.next();
		System.out.print(" 국어점수 입력 : ");
		int korea = s.nextInt();
		System.out.print(" 수학점수 입력 : ");
		int math = s.nextInt();
		System.out.print(" 영어점수 입력 : ");
		int english = s.nextInt();
		int total = korea + math + english;
		int avg = total/3;
		System.out.println("평균은"+avg+"이고");
		if(avg>=90)
			System.out.println("학점은 A 입니다");
		else if(avg<90 && avg>=80)
			System.out.println("학점은 B 입니다");
		else if(avg<80 && avg>=70)
			System.out.println("학점은 C 입니다");
		else if(avg<70 && avg>=60)
			System.out.println("학점은 D 입니다");
		else if(avg<60)
			System.out.println("학점은 F 입니다");
		}
	public static void main(String[] args){
		new A06().input();
	}
}		
