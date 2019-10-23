interface car{
	int speed = 90;
	void distance();
}
interface bus{
	int distance= 1000;
	void speed();
}
class VehicleInterface implements car,bus{
	
		public void distance(){
			int distance = speed*100;
			System.out.println("Distance :"+distance);
		}
		public void speed(){
			int speed = distance/100;
			System.out.println("Speed :"+speed);
		}
		public static void main(String args[]){
			car c = new car();
			c.car();
			bus b = new bus();
			b.bus();
			
		}
}
