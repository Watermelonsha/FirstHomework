import java.util.*;
public class SmallestElement13 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Arabesque", "больше чем творчество", "she wolf"));
        //список песен которые я слушаю
        String shortest = songs.get(0);//c начала дава думает что арабескээ это корткое пока короче не найдет

        for (String song : songs) {//смотрит каждуб песню
            if (song.length() < shortest.length()) {//смотрит нету ли меньше
                shortest = song;//тут сейвит самую шорт
            }
        }

        System.out.println("Самый маленькй^  "+shortest);
    }
}