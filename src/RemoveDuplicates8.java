import java.util.*;
public class RemoveDuplicates8 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cat", "Bird", "Dog", "Crocodile"));
        //список животных, не людей
        HashSet<String> uniqueAnimals = new HashSet<>(animals);//хашсет не любит дубликаты, скипает их. он такой
        animals.clear();//тут просто уборкуделаем
        animals.addAll(uniqueAnimals);//тут все уникальны

        System.out.println(animals); // ") энималы
    }
}