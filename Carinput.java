import java.util.Scanner;
import java.util.*;

public class Carinput implements Comparable<Carinput>
{
		String model;
		int year,price;
		//Constructor
	Carinput(String model, int year, int price){
		this.model = model;
		this.year = year;
		this.price = price;
			}
	// Used to sort car by price
    public int compareTo(Carinput c)
    {
    	return this.price - c.price;
    }
    
    // Getter methods for accessing private data
    public String getModel() { return model; }
    public int getYear()   {  return year; }
    public int getPrice()      {  return price;  }
 
  public static void main(String args[])
  {
	  
	  ArrayList<Carinput> list = new ArrayList<Carinput>();
		list.add(new Carinput("Chevy",2012,9000));
		list.add(new Carinput("Honda",2017,8000));
		list.add(new Carinput("Skoda",2011,3000));
		list.add(new Carinput("Hummer",2015,8000));
		list.add(new Carinput("BMW",2018,5000));

      Collections.sort(list);
      System.out.println("Cars after sorting : ");
      for (Carinput c1: list)
      {
          System.out.println(c1.getModel() + " " +
                             c1.getYear() + " " +
                             c1.getPrice());
	  
  }
      }
  }
		/*String model;
		int year;		
		Carinput[] c1 = new Carinput[5];
		c1[0] = new Carinput("Chevy",2012,1000);
		c1[1] = new Carinput("Honda",2017,2000);
		c1[2] = new Carinput("Skoda",2011,3000);
		c1[3] = new Carinput("Hummer",2015,4000);
		c1[4] = new Carinput("Mercedes",2018,5000);
		
	
		System.out.println("Models present in array list");
		
		System.out.println(c1.length);
		for(int i = 0;i<c1.length;i++) {
			System.out.println(i+". "+c1[i].model);
		}
		System.out.println("\nEnter which model details is required");
		Scanner reader = new Scanner(System.in);
		model = reader.next();
		int found = 0;
		for(int i = 0;i<c1.length;i++) {
			if(c1[i].model.equals(model)) {
				found++;
				System.out.println("Model: "+c1[i].model+"\n"+"Year: "+c1[i].year);
			}			
		}
		if(found == 0) {
			System.out.println("Entered model not in array");
		}
     int yearofmake;
     String carname,colour; 
     Scanner in = new Scanner(System.in); 
    
     System.out.println("Enter a carname you need if not in the list: ");
     carname = in.nextLine();
     System.out.println("Enter a colour: ");
     colour = in.nextLine();
     System.out.println("Enter the make year: ");
     yearofmake = in.nextInt();
   
     System.out.println("The customer needs: "+carname+" " +"of the colour" + " "+colour+ "with the year of make" + yearofmake);
  }
  reader.*/
//}