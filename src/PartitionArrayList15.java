//tired
import java.util.*;
public class PartitionArrayList15 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//список цыфыыр
        ArrayList<Integer> even = new ArrayList<>();//ля четных
        ArrayList<Integer> odd = new ArrayList<>();//для нечетных

        for (int n : nums) {//по списку Намсээ проходит форИч цикл
            if (n % 2 == 0) {//без отстатка деление.на2
                even.add(n);//если четное то в список кладем
            } else {
                odd.add(n);// ну или в од
            }
        }

        System.out.println("Even numbers: " + even);//чтен
        System.out.println("Odd numbers: " + odd);//нечетн
    }
}