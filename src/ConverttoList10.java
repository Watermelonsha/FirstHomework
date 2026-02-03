//десятое задание наконец
import java.util.*;
public class ConverttoList10 {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4}; //тут масив Integer а не int потому что обжекты

        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));//массив в строчКуу

        System.out.println(numberList);//тут выводит наэкран наш с вами
    }
}
