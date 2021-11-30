
public class Gugudan {
	public static void main(String[] args)
	{
		int[] result = new int[9];
		for(int i = 2; i <= result.length ; i++)
		{
			for(int j = 0 ; j < result.length ; j++)
			{
				result[j] = i * (j + 1);
				System.out.println(result[j]);
			}
			
		}
		
		
	}

}
