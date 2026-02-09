import java.util.*;
public class RotateElements16 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(Arrays.asList(
                "ПН", "ВТ", "СР", "ЧТ", "ПТ"
        ));

        Collections.rotate(days, 2);//ДВигает их на местно нужное  ну тут на 2

        System.out.println(days);
    }
}