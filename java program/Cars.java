public class car{
public String carname;
public String carcolor;
public String car_brand;
private String fuel_type;
private double mileage;
public Car(String car_color,String car_brand,String fuel_type,double mileage)
{
		this.car_color = car_color;
		this.car_brand = car_brand;
		this.fuel_type = fuel_type;
		this.mileage = mileage;
		System.out.println("the car is described as "+car_color+","+car_brand+","+fuel_type+","+mileage+" miles"); 
               }
	public void start(String car_brand){
		System.out.println(car_brand +" is starting");
	       }
	public void stop(String car_brand){
		System.out.println(car_brand +" is stoping");
	       }
	public void service(String car_brand){
		System.out.println(car_brand +" needs service");
	       }
	public static void main(String[] args){
                // object 1 is taken as car1
		Car car1 = new Car("White","Benz","Diesel",47.9);
		car1.start("Benz");
		car1.stop("Benz");
		car1.service("Benz");
		// object 2 is taken as car 2
		Car car2 = new Car("Red","Ferrari","Petrol",14.6);
		car2.start("Ferrari");
		car2.stop("Ferrari");
		car2.service("Ferrari");
                // object 3 is taken as car 3
	        Car car3 = new Car("Grey","Lamborghini","Gasoline",22);
                     car3.start("Lamborghini");
            	car3.stop("Lamborghini");
            	car3.service("Lamborghini");
              }
}

}