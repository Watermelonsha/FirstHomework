//да коментарии
import java.util.*;
public class RemoveElements4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList( //тут создается шеренга из фруктов
                "Watermelon", "Banana", "Orange", "Grapes"));

        fruits.removeIf(fruit -> fruit.equals("Grapes")); //убирает винограды

        System.out.println("Винограда тут нету "+fruits);
    }
}
