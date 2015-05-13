import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class MostProfitable
{
	public String bestItem(int[] costs, int[] prices, int[] sales, String[] items)
	{
		Integer[] profits = new Integer[costs.length];
		for(int i=0; i<costs.length;i++)
		{
			profits[i] = (prices[i]-costs[i])*sales[i];
		}
		List<Integer> plist = Arrays.asList(profits);
		int maxp = Collections.max(plist);
		int maxi=0;
		if(maxp<=0)
			return "";
		else
		{
			for(int i = 0; i<profits.length;i++)
			{
				if(maxp == profits[i])
				{	
					maxi = i;
					break;
				}
			}
			return items[maxi];
		}
	}
	
	
}
//Powered by [KawigiEdit] 2.0!
