import java.util.Date;

public class CreditCardPayment extends PaymentMode{

	private String creditcardNumber;
	private String holderName;
	private String cardNumber;
	private Date dateOfExpiry;
	
	public CreditCardPayment(String creditcardNumber, String holderName, String cardNumber,
			Date dateOfExpiry,String type) {
		super(type);
		this.creditcardNumber = creditcardNumber;
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(String creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	@Override
	public Double makePayment(Booking booking) {
		double result=booking.getAmount()+(double)(booking.getAmount()*0.02);
		return result;
	}
	
	
	
    //fill the code
    
}
