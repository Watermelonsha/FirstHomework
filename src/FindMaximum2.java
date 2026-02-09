//я пишу комменатрии, ну просто думаю это доказывает что ыйа сама это все понимаю
//оа
import java.util.*;
    public class FindMaximum2 {
        public static void main(String[] args) {
            ArrayList<String> movies = new ArrayList<>(Arrays.asList(
                    "Бойцовский клуб", "Бэтмээн", "Айрон мэн", "Время")); //тут мы создали какбы список
//названия супемагефильмов
            String longest = movies.get(0);//тут с индекса ЗиРо начинаем

            for (String movie : movies) { //туь форИч цикл
                if (movie.length() > longest.length()) { //ут сравнивается самый лонг и тот что выбралибб
                    longest = movie; //а тут типа с условием все ок
                }
            }

            System.out.println(longest);
        }
    }
