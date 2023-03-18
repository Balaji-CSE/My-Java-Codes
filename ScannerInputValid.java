import java.util.*;
public class ScannerInputValid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int input = 0;
		while(true) 
		{
			if(sc.hasNextInt()) 
			{
				input = sc.nextInt();
				break;
			}
			
			else 
			{
				System.out.println("Please Enter Valid Integer Now");
				sc.next();
			}  
		}
	System.out.println("Your Number " + input);
	sc.close();
	}

}
