import java.util.*;
public class NestedttArrayList20 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> departments = new ArrayList<>();//списк департамэнт

        ArrayList<String> it = new ArrayList<>(Arrays.asList("джон", "Чика"));//айтишники
        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Мэлисса", "Адыгене"));//эйчары

        departments.add(it);//спсок айти
        departments.add(hr);//список эйч ар

        for (ArrayList<String> dept : departments) {//форич смотрит всех
            System.out.println(dept);//тут конкретно айти или эйчар показываетт
        }
    }
}