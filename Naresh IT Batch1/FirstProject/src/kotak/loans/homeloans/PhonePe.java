package kotak.loans.homeloans;

public class PhonePe 
{

	public static void main(String[] args) 
	{
		Kotak k = new Kotak();
		/*System.out.println(k.mainbalance);
		k.mainbalance=500;
		System.out.println(k.mainbalance);*/
		
		
		System.out.println("Through PhonePe : "+k.getMainbalance());
		k.setMainbalance(500);
		System.out.println("Through PhonePe updated balance:"+ k.getMainbalance());
	}

}
