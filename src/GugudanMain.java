import java.util.Scanner;

public class GugudanMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number you want to know: ");
		int dan = sc.nextInt();
		for(int i = 2 ; i <= dan ; i++)
		{
			int[] result = Gugudan1.calculate(i);
			Gugudan1.print(result);
		}


	}

}
