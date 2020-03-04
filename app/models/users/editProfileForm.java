package models.users;


public class editProfileForm
{
	//Member Variables
	private String address;
	private int cardNumber;
	//Constructors
	 //Default
	public editProfileForm()
	{}
	 //Overloaded
	public editProfileForm(String address,int cardNumber)
	{
		this.address= address;
		this.cardNumber = cardNumber;
	}
	//Getters
	public String getAddress()
	{
	 return address;
	}
	public int getCardNumber()
	{
	 return cardNumber;
	}
	//Setters
	public void setAddress(String address)
	{
	 this.address = address;
	}
	public void setCardNumber(int cardNumber)
	{
	 this.cardNumber = cardNumber;
	}
}
