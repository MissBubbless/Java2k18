import java.util.*;

public class CarByYear implements Comparator<Carinput>{

	 public int compare(Carinput c1,Carinput c2)
	    {
	    	return c1.year-c2.year;
	    	  }

public static void main(String[] args)
{
	 ArrayList<Carinput> list = new ArrayList<Carinput>();
		list.add(new Carinput("Chevy",2012,9000));
		list.add(new Carinput("Honda",2017,8000));
		list.add(new Carinput("Skoda",2011,3000));
		list.add(new Carinput("Hummer",2015,8000));
		list.add(new Carinput("BMW",2018,5000));
System.out.println("Sorted by year");
CarByYear seeyear = new CarByYear();
Collections.sort(list, seeyear);
for (Carinput c: list)
    System.out.println(c.getModel() + " " +
                       c.getYear() + " " +
                       c.getPrice());

}}