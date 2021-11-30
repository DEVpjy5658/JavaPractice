import java.util.Scanner;

public class PalChilDan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input two numbers to show the gugudan: ");
		String inputValue = sc.nextLine();
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		
		for(int i = 2 ; i <= first ; i++)
		{
			for(int j = 1 ; j <= second ; j++)
			{
				int result = i * j;
				System.out.println(result);
				
			}
			
			
		}

	}


}
