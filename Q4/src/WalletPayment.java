public class WalletPayment extends PaymentMode{

	private String walletNumber;

	public WalletPayment(String walletNumber,String type) {
		super(type);
		this.walletNumber = walletNumber;
	}

	public String getWalletNumber() {
		return walletNumber;
	}

	public void setWalletNumber(String walletNumber) {
		this.walletNumber = walletNumber;
	}

	@Override
	public Double makePayment(Booking booking) {
		double result=booking.getAmount()+(double)(booking.getAmount()*0.05);
		return result;
	}
	
    //fill the code
    
}
