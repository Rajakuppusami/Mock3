import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter license number:");
        String licenseNumber = br.readLine();
        
        System.out.println("Menu:\n" +
                "1) Validate licence Number\n" +
                "2) Check Driver Experience");
        System.out.println("Enter choice: ");
        Integer choice = Integer.parseInt(br.readLine());
        
        switch(choice) {
            case 1:
                if(validateLicenseNumber(licenseNumber)) {
                    System.out.println("License number is valid");
                } else {
                    System.out.println("License number is not valid");
                }
                break;
            case 2:
                if(isExperiencedDriver(licenseNumber)) {
                    System.out.println("Experienced Driver");
                } else {
                    System.out.println("Not Experienced Driver");
                }
                break;
            default:
                System.out.println("Invalid option");
                
        }
        
    }
    public static Boolean validateLicenseNumber(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        //fill code here
        if(licenceNumber.length()==15 && licenceNumber.matches("[A-Z]{2}[0-9]{13}")){
        	String state=licenceNumber.substring(0, 2);
        	int branch=Integer.parseInt(licenceNumber.substring(2,4));
        	int year = Integer.parseInt(licenceNumber.substring(4,8));
        	String rem = licenceNumber.substring(8);
        	//System.out.println(state+" "+branch+" "+year+" "+rem);
        	if(state.matches("[A-Z]{2}") && (branch>=10 && branch<=50)  && (year>=2005 && year<=2016) && rem.matches("[1-9]{7}") ){
        		//System.out.println("sgfs");
        		//&& (branch>=10 && branch<=50) && (year>=2015 && year<=2016) && rem.matches("[1-9]{7}")
        		return true;
        	}
        }
        return false;
    }
    
    public static Boolean isExperiencedDriver(String licenceNumber) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = sdf.parse("28-11-2017");
        if(licenceNumber.length()==15 && licenceNumber.matches("[A-Z]{2}[0-9]{13}")){
        	int year = Integer.parseInt(licenceNumber.substring(4,8));
        	int diff = 2017-year;
        	if(diff>=5){
        		return true;
        	}
        }
        //fill code here
        return false;
    }
}

