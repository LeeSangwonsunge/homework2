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
		String hakjum = "F";
		if(avg>=90)
			hakjum = "A";
		else if(avg<90 && avg>=80)
			hakjum = "B";
		else if(avg<80 && avg>=70)
			hakjum = "C";
		else if(avg<70 && avg>=60)
			hakjum = "D";
		System.out.println("학점은"+ hakjum +"입니다");
		}
	public static void main(String[] args){
		new A06().input();
	}
}		
