import java.util.*;
public class Find2Largest18 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Бетмен", "Аватар", "все об Лили чоу чоу", "Убить билла"));
//строка со спискооом
        movies.sort((a, b) -> b.length() - a.length());//смотрт длинну
        //самая длинная будет в первой и короткая последней, серединаэто середина
        System.out.println(movies.get(1));//на экранн
    }
}