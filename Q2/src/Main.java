import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) throws IOException {
         
        ArrayList<Car> carList = new ArrayList<Car>();        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
          String menu = "Menu: \n1) Add a Car\n" +"2) Find a Car\n" +"3) Find CarList\n" +"4) Exit";
          System.out.println(menu);
          Car c=new Car();
           //fill the code
          int option = Integer.parseInt(br.readLine());
           if(option == 1) {
    	        //fill the code
        	   Car c1=c.addCar(br);
        	   carList.add(c1);
		    }
		    if(option == 2) {
		        System.out.println("Licence Number");
		        //fill the code
		        String licNo=br.readLine();
		        if(c.findCar(licNo, carList)!=null)
		        	System.out.println(c.findCar(licNo, carList));
		        else
		        	System.out.println("Licence Number not present");
		    }
		    if(option == 3) {
		        System.out.println("Model");
		        //fill the code
		        String model =br.readLine();
		        ArrayList<Car> li=c.findCarList(model, carList);
		        if(li==null){
		        	System.out.println("Car "+model+" not found");
		        }else{
			        for(Car value:li){
			        	System.out.println(value);
			        }
		        }
		    }
		    if(option == 4) {
		        //fill the code
		    	break;
		    }
           
        }
    }
}
