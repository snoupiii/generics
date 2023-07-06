import java.util.ArrayList;
import java.util.List;

public class Generic23 {
    public static void main(String[] args) {
        /// JAVA 5 ////
        List animals  = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat"); //0
        animals.add("dog"); //1
        animals.add("frog"); //2
        animals.add(ourAnimal);
        String animal = (String) animals.get(1);
        System.out.println("It is a " +animal);
        /// появление Generics ///
        List <String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(2);
        System.out.println("It is a " + animal2);



        /// Java7 ///

        List<String> animals3 = new ArrayList<>();

        // можно не указывать справа String //




    }
}
