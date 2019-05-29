import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Long customerId;
        String firstName, lastName, gender, email, phoneNumber, address, otherCustomerDetails;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Customer customer[] = new Customer[2];
        int i;
        for (i = 1; i <= 2; i++) {
            System.out.println("Customer" + i + " :");
            System.out.println("customer id: ");
            customerId = Long.parseLong(br.readLine());
            System.out.println("first name: ");
            firstName = br.readLine();
            System.out.println("last name: ");
            lastName = br.readLine();
            System.out.println("gender: ");
            gender = br.readLine();
            System.out.println("email: ");
            email = br.readLine();
            System.out.println("phone number: ");
            phoneNumber = br.readLine();
            System.out.println("address: ");
            address = br.readLine();
            Customer c=new Customer(customerId, firstName, lastName, gender, email, phoneNumber, address);
            customer[i-1]=c;
            //fill the code
        }
        System.out.println();
        //fill the code
        for (int j = 0; j < customer.length; j++) {
			System.out.println("Customer "+(j+1));
			System.out.println(customer[j]);
			if(j!=customer.length-1)
			System.out.println();
		}
        if(customer[0].equals(customer[1])){ 
        	System.out.println("Customer 1 is same as Customer 2");
        }else{
        	System.out.println("Customer 1 and Customer 2 are different");
        }
    }

}
