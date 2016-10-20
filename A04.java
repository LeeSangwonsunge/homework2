import java.util.*;
class A04{
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print(" Korea : ");
		int korea = s.nextInt();
		System.out.print(" English : ");
		int english = s.nextInt();
		System.out.print(" Math : ");
		int math = s.nextInt();
		int total = korea+english+math;
		int avg = total/3;
		System.out.println("total is" + total);
		System.out.println("avg is" + avg);
		if((korea>english)&&(korea > math))
			System.out.println("Korea is best");
		else if((english>korea)&&(english > math))
			System.out.println("English is best");
		else if((math>korea)&&(math>english))
			System.out.println("Math is best");
	}
	public static void main(String[] args){
		new A04().input();
	}
}
