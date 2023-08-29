package lecrute10;

public class DogLauncher {
	 public static void main(String[] args){
	        Dog[] dogs = {new Dog("Elyse",3),new Dog("Sture",9),
	                new Dog("Artemesios",15)};

	        System.out.println(Maximizer.max(dogs));
	    }
}
