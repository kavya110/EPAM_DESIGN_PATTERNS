package epam.patternbuilding;

public class HPBuilder 
{
	private int Price;
	private String name;
	
	public HPBuilder getPrice(int Price)
	{	
		this.Price=Price;
		return this;
	}
	public HPBuilder getName(String name)
	{	
		this.name=name;
		return this;
	}
	public headPhoneBuilder passer()
		{return new headPhoneBuilder(Price,name);}
	
}
