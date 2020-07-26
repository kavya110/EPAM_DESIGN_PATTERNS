package epam.patternbuilding;

public class headPhoneBuilder 
{	
	static int Price;
	static String name;
	public headPhoneBuilder(int Price,String name)
	{
		super();
		this.Price=Price;
		this.name=name;
	}
	public static String printer ()
	{
		return "Headphone is "+name+"Price is :"+Price;
	}

}
