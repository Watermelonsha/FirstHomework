//я буду писать комменатрии, ну просто думаю это доказывает что ыйа сама это все понимаю
//арбуз
import java.util.*;

public class CountOccurrences3 {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(Arrays.asList( //список создаемч тобынадо
                "Суши", "Читос", "Сушки", "Кимчи", "Суши")); //едаа

        int count = 0; //тут счет начинается с Зиро
        for (String food : foods) { //nen jy ghj[jlится по списку еда
            if (food.equals("Суши")) { //тут он смотрит есть ли суши тут
                count++; //тут правда или нет
            }
        }

        System.out.println("Сколько еды повторялось:  "+count);
    }
}
