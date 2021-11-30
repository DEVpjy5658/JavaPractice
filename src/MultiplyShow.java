import java.util.Scanner;

public class MultiplyShow {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Input a number you want to see multiply: ");
//		int input = sc.nextInt();
//		int[] number = new int[input];
//		for(int i = 0 ; i < number.length ; i++)
//		{
//			number[i] = input * (i + 1);
//			System.out.println(number[i]);
//		}
		Scanner scanner = new Scanner(System.in);
        
        int input = scanner.nextInt();
        
        int[] result = new int[input];
        
		for (int i = 2; i <= result.length; i++) {
			
			for(int j = 0; j < result.length; j++) {
				
		            result[j] = i * (j+1);
		        
		        System.out.println(result[j]);
			}
		
		}
	}
		

}
