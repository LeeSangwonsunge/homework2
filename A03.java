import java.util.*;
class A03{
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print(" days : ");
		int days = s.nextInt();
		int seconds = days*24*60*60;
		int m_count = seconds/1000000;
		System.out.println("Seconds is" + seconds);
		System.out.println("m_count is" + m_count);
	}
	public static void main(String[] args){
		new A03().input();
	}
}
