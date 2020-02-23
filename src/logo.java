import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

public class logo
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int n = 0;
		
		System.out.print("Enter the width of the letter:");	
		s = br.readLine();

		try 
		{
			n = Integer.parseInt(s);
		}
			catch (NumberFormatException exc) {
			System.out.println("Not a number");
		}
		if (n % 2 != 1 || n > 10000  || n < 2) {
			System.out.println("The width must be an odd number between 2 and 10,000");
		}
		draw(n);
	}
	//A function which prints the dashes
	public static void dashes(int n)
	{
		int countDash = n;
		for (int i = 0; i < countDash; i++)
		{
			System.out.print('-');
		}
	}
	
	//A function which prints the asterisks
	public static void asterisks(int n)
	{
		int countAst = n;
		for (int i = 0; i < countAst; i++)
		{
			System.out.print('*');
		}
	}
	
	public static void draw(int n)
	{
		int i, j, k, l, countAst = n;
		int sideDashes, middleDashes, middleAst;
		//Calculate the number of dashes and asterisks on each line for the top half of the letters
		for (i = 0; i < (n + 1) / 2; i++)
		{
			sideDashes = n - i;
			middleDashes = n - (2 * i);
			countAst = n + (i * 2);
			//Repeat for the desired number of letters
			for (j = 0; j < 2; j++)
			{
				dashes(sideDashes);
				asterisks(countAst);
				dashes(middleDashes);
				asterisks(countAst);
				dashes(sideDashes);
			}
		System.out.println();
		}
		countAst = n;
		//Calculate dashes and asterisks for the lower half of the letters
		for (k = 0; k < (n + 1) / 2; k++)
		{
			sideDashes = (n / 2) - k;
			middleDashes = 1 + (2 * k);
			middleAst = ((n * 2) - 1) - (2 * k);
			
			for(l = 0; l < 2; l++)
			{
				dashes(sideDashes);
				asterisks(countAst);
				dashes(middleDashes);
				asterisks(middleAst);
				dashes(middleDashes);
				asterisks(countAst);
				dashes(sideDashes);
			}
			System.out.println();
		}

	}
}
