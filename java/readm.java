import java.util.Scanner;

public class readm {

	public static void main(String[] args) {
		
		
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter four integer value: ");
		   int a = sc.nextInt();
		   int b = sc.nextInt();
		   int c = sc.nextInt();
		   int d = sc.nextInt(); 
		   
		   int big = a;
		      if(b>big)
		      big = b;
		      if(c>big)
		      big = c;
		      if(d>big)
		      big = d;
		   
		  System.out.println(" bigest integer value is: "+big);

		

	}

}
