import java.util.*;
class A01{
        void input(){
	                Scanner s = new Scanner(System.in);
			                System.out.print(" your birth year : ");
					                int birth = s.nextInt();
							                int age = 2016 - birth + 1;
									                if(age>19)
														System.out.println("adult");
																else
																			System.out.println("child");
																			        }
																				        public static void main(String[] args){
																					                new A01().input();
																							        }
																								}
