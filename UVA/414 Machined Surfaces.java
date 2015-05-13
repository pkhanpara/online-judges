import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) throws FileNotFoundException  // entry point from OS
	{
		Scanner sc = new Scanner(System.in); 
		//Scanner sc = new Scanner(new FileInputStream("input")); 
		int n= Integer.parseInt(sc.nextLine());
		do 
		{
			String [] array = new String[n];
			int [] count = new int[n];

			for(int i=0; i<n;i++)
			{
				array[i] = sc.nextLine();
				count[i] = countX(array[i]);
				//System.out.println(array[i]+" "+count[i]);
			}
			int max = getMax(count);
			int result =0;
			for(int t = 0; t< count.length; t++)
				result = result + max - count[t];
			System.out.println(result); 
			n= Integer.parseInt(sc.nextLine());
		}while(n!=0);
		sc.close();
	}
	private static int getMax(int[] count) {
		int max = 0;
		for(int t : count)
			if(t>max)
				max = t;
		return max;
	}
	static int countX(String a)
	{
		int count = 0;
		for(char c : a.toCharArray())
			if(c=='X')
				count++;
		return count;
	}
}
