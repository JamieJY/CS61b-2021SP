import java.util.Comparator;
public class DogLauncher {
    public static void main(String[] args){
        Dog[] dogs = {new Dog("Elyse",3),new Dog("Sture",9),
                new Dog("Artemesios",15)};

        System.out.println(Maximizer.max(dogs));
        Dog d = (Dog) Maximizer.max(dogs);
        d.bark();

        Comparator nc = Dog.getNameCoparator();
        if(nc.compare(d1,d3)>0){
            d1.bark();
        }else{
            d3.bark();
        }
    }
}
