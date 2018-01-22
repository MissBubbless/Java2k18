import java.util.Random;
import java.util.Scanner;
public class Car {

	final String model;
	int year,max_speed,gear;
	float speed;
	boolean head_lights, tail_lights,left_indicator,right_indicator,ac_on,start,brake;;
	
	
	Car(String model, int year, int max_speed){
		this.model = model;
		this.year = year;
		if(max_speed<100)
			max_speed = 100;
		this.max_speed = max_speed;
		this.head_lights = false;
		this.tail_lights = false;
		this.left_indicator = false;
		this.right_indicator = false;
		this.head_lights = false;
		this.ac_on = false;
	}
	
	void start(){
		start = true;
		brake = false;
		System.out.println("Car Started\n");
		
	}
	
	void brake(){
		start = false;
		brake = true;
		head_lights= false;
		tail_lights = false;
		left_indicator = false;
		right_indicator = false;
		ac_on = false;
		head_lights = false;
		System.out.println("Car braked\n");
		
	}

	
	void current_speed(){
		if(start == true){
		Random rand = new Random(); 
		speed = rand.nextInt(max_speed);
		System.out.println("Current speed: " + speed+"MPH\n");
		}
		else{
			System.out.println("Car STATE : OFF\nCurrent speed : 0 MPG\n");
		}
		
	}

	void head_lights_ON_OFF(){
		if(head_lights == false)
		{
			head_lights = true;
			System.out.println("Head_lights ON\n");
		}
		else{
			head_lights = false;
			System.out.println("Head_lights OFF\n");
		}
		
	}
	
	void apply_brake(){
		if(start == true){
			speed-=10;
			tail_lights = true;
			if(speed<0)
				speed = 0;
			if(speed > 0){
				System.out.println("Brake applied. Current_speed: "+speed+"MPH");
				System.out.println("Tail lights ON\n");
			}
			else{
				System.out.println("Vehicle brakeped. Current_speed: "+speed+"MPH");
				System.out.println("Tail lights ON\n");
			}
			
			tail_lights = false;
		}
	}
	
	
	
	
	void ac_on_off(){
		if(ac_on == false){
			ac_on = true;
			System.out.println("Ac ON\n");
		}
		else{
			ac_on = false;
			System.out.println("Ac OFF\n");
		}
		
	}
	

	
	
	void turn_right(){
		
		right_indicator = true;
		System.out.println("Right indicator ON\n");
		right_indicator = false;
	}
	
	void turn_left(){
		left_indicator = true;
		System.out.println("Left indicator ON\n");
		left_indicator = false;
	}
	
	void car_state(){
		System.out.println("Model:"+model);
		System.out.println("Year:"+year);
		System.out.println("Max_speed:" + max_speed +"MPH");
		System.out.println("Current_speed:"+speed);
		if(head_lights==true)
			System.out.println("Head Lights ON"  );
		else
			System.out.println("Head Lights OFF");
		
		if(left_indicator==true)
			System.out.println("Left indicator ON"  );
		else
			System.out.println("Left_indicator OFF");
		
		if(right_indicator==true)
			System.out.println("Right indicator ON"  );
		else
			System.out.println("Right indicator OFF");
		
		if(ac_on==true)
			System.out.println("AC ON\n");
		else
			System.out.println("AC OFF\n");
		
	}
	
	public static void main(String[] args){
		
		String model;
		int year;
		
		Car[] c1 = new Car[5];
		c1[0] = new Car("Chevy",2012,120);
		c1[1] = new Car("Honda",2017,60);
		c1[2] = new Car("Skoda",2011,70);
		c1[3] = new Car("Hummer",2015,100);
		c1[4] = new Car("Mercedes",2018,220);
		
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
				System.out.println("Model: "+c1[i].model+"\n"+"Year: "+c1[i].year+"\nMax speed: "+c1[i].max_speed);
			}
			
		}
		if(found == 0) {
			System.out.println("Entered model not in array");
		}

		
	}
	
}