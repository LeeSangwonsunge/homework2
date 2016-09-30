
import java.util.*;
class A05{
        void input(){
	                Scanner s = new Scanner(System.in);
			                System.out.print(" your birth year : ");
					                int birth = s.nextInt();
							                int age = 2016 - birth + 1;
									                if(age<7)
														System.out.println("Yua");
																else if(age>6 and age<13)
																			System.out.println("Child");
																					else if(age>12 and age<20)
																								System.out.println("Jun Adult");
																										else if(age>19 and age<30)
																													System.out.println("Adult");
																															else if(age>29 and age<60)
																																		System.out.println("JungNyun");
																																				else
																																							System.out.println("NoNyun");
																																							        }
																																								        public static void main(String[] args){
																																									                new A05().input();
																																											        }
																																												}
