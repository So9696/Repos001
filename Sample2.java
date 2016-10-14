package javafiles;

import java.util.Scanner;

public class Sample2 {

	 int mood;
	 String moodString; 
	
public String getMoodNumber(int mood) {
		
		 switch (mood) {
		 case 1:
			 moodString = "You are feeling Excellent today!!";
			 break;
		 case 2:
			 moodString = "You are feeling Verry Good today!!";
			 break;
		 case 3:
			 moodString = "You are feeling Good today!!";
			 break;
		 case 4:
			 moodString = "You are feeling Normal today";
			 break;
		 case 5:
			 moodString = "You are feeling Bad today!!";
			 break;
		 default:
			 moodString = "Wrong choice of number!!";
		                 }
		 return moodString;

			
	                                   }

		
		
public static void main(String[] args) {
		
		Sample2 s = new Sample2();
		Scanner sc = new Scanner(System.in);

		System.out.println("Rate your mood out of 5?");
		int a = sc.nextInt();
		s.getMoodNumber(a);
        String st=s.moodString;
        System.out.println(st);
		sc.close();
		System.exit(0);

		
 }

}


