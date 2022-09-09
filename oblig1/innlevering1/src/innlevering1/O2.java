package innlevering1;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		for (int i = 1; i<=n ; i++) {
			System.out.print("Enter elev poeng");
			Scanner input =new Scanner(System.in);
			int c = parseInt(input.nextLine());
			
	 if ( c<=100 && c>=90 ) {
	System.out.println("poeng" +c+"=A ");
	 }
		
	 else if   ( c<90 && c>=80 ) {
System.out.println("poeng" +c+"=B");
		 }
	
	 else if  ( c<80 && c>=70 ) {
	System.out.println("poeng" +c+"=C");
		 }
		
	
	 else	 if  ( c<70 && c>=60 ) {
		System.out.println("poeng" +c+"=D");
		 }
		
	
	 else  if ( c<60 && c>=40 ) {
			System.out.println("poeng" +c+"=E");
		  }
		
	
	 else	if ( c<40 && c>=0 ) {
				System.out.println("poeng" +c+"=F");
		 }
	 else
		 System.out.println("worng ");
}
}
}


	
