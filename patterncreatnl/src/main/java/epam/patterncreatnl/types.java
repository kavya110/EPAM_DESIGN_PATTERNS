package epam.patterncreatnl;

public class types 
{
	public static headphones getInstance(String test)
	{
		if(test=="Bass")
			return new bassAndBudget();
		else if(test=="classy")
			return new classicAndPro();
		else
			return new newAndEncouraging();
	
	}
}
