import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Class to compare car by name
class CarByName implements Comparator<Carinput>
{
    public int compare(Carinput c1, Carinput c2)
    {
        return c1.getModel().compareTo(c2.getModel());
    }

public static void main(String[] args)
{
	 ArrayList<Carinput> list = new ArrayList<Carinput>();
		list.add(new Carinput("Chevy",2012,9000));
		list.add(new Carinput("Honda",2017,8000));
		list.add(new Carinput("Skoda",2011,3000));
		list.add(new Carinput("Hummer",2015,8000));
		list.add(new Carinput("BMW",2018,5000));
	 
	 
	 
System.out.println("Sorted by name");
CarByName carmodel = new CarByName();
Collections.sort(list, new CarByName());
for (Carinput c: list)
    System.out.println(c.getModel() + " " +
                       c.getYear() + " " +
                       c.getPrice());

}}