package dog;

public class Dog {

		public int weightInPounds;
		public static String binomen = "Canis familiaris";

		/** One integer constructor for dogs. */
		public Dog(int w) {
			weightInPounds = w;
		}

		public void makeNoise() {
			if (weightInPounds < 10) {
				System.out.println("yip!");
			} else if (weightInPounds < 30) {
				System.out.println("bark.");
			} else {
				System.out.println("woooof!");
			}
		}

		public static Dog maxDog(Dog d1,Dog d2) {
			if (d1.weightInPounds > d2.weightInPounds) {
				return d1;
			}
			return d2;
		}	


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog(15);
		Dog d2 = new Dog(100);
		Dog bigger = Dog.maxDog(d1, d2);
		//bigger.makeNoise();                   
		
		//Dog bigger = d1.maxDog(d2);
		bigger.makeNoise();
		
		
	}

}
