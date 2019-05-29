public abstract class PaymentMode {
    
    //fill the code
	private String type;

	public PaymentMode(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
    public abstract Double makePayment(Booking booking);
}
