import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        Iterator<Integer> iterator = intList.iterator();
        Integer vAlue = 0;
        while (iterator.hasNext()) {    //используем итератор
            vAlue = iterator.next();
            if (vAlue <= 0) {  //по логике 0 это четное число, но согласно ТЗ убираем 0 прямо здесь
                iterator.remove();  //убираем отрицательные числа
            } else if (vAlue % 2 != 0) {
                iterator.remove();  //убираем сразу нечетные числа
                }
        }
        Collections.sort(intList);  //остались четные - сортируем с пом-ю Collections

        for (Integer i : intList) {  //выводим результат
            System.out.println(i);
        }

    }
}