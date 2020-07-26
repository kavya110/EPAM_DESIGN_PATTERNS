package epam.patternbuilding;



public class headphone 
{
	public static void main(String args[])
	{
		headPhoneBuilder HP = new HPBuilder().getPrice(3999).getName("Jays").passer();
		System.out.println( headPhoneBuilder.printer());
	}
}
