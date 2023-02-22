import java.util.Iterator;
import java.util.LinkedList;

/*
Задача № 3.	Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
Используйте итератор.
 */

public class Sem_4_Hmw_Task3 {
    public static void main(String[] args){
        int length = 10;                                                              // Зададим длину списка.
        System.out.printf("Исходный список:  %s\n", creationLL(length));              // Вызовем метод формирования списка.
        System.out.printf("Сумма (Итератор): %d\n", sumIterator(creationLL(length))); // Вызовем метод подсчета суммы № 1.
        System.out.printf("Сумма (Цикл):     %d\n", sumCycle(creationLL(length)));    // Вызовем метод подсчета суммы № 2.
    }

    // МЕТОД ФОРМИРОВАНИЯ СПИСКА LinkedList
    private static LinkedList<Integer> creationLL(int length) {                     // Аргумент - длина списка.
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 0; i < length; i++) {                                          // Добавляем в список числа [0, 9].
            myLinkedList.add(i);
        }
        return myLinkedList;
    }

    // МЕТОД ВЫЧИСЛЕНИЯ СУММЫ ЭЛЕМЕНТОВ СПИСКА С ПОМОЩЬЮ ИТЕРАТОРА
    private static int sumIterator(LinkedList<Integer> linkedList) {                // Аргумент - исходный список.
        int sum = 0;
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {                                                // Используем итератор.
            sum += iterator.next();
        }
        return sum;                                                                 // Возвращаем сумму.
    }

    // МЕТОД ВЫЧИСЛЕНИЯ СУММЫ ЭЛЕМЕНТОВ СПИСКА С ПОМОЩЬЮ ЦИКЛА
    private static int sumCycle(LinkedList<Integer> linkedList) {                   // Аргумент - исходный список.
        int sum = 0;
        for (int j : linkedList){                                                   // Вызовем элементы списка с помощью
            sum += j;                                                               // foreach и найдем их сумму.
        }
        return sum;                                                                 // Возвращаем сумму.
    }
}
