import java.util.LinkedList;
/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
Постараться не обращаться к листу по индексам.
 */

public class Sem_4_Hmw_Task1 {
    public static void main(String[] args){
        int length = 10;                                                              // Зададим длину списка.
        System.out.printf("Исходный список:    %s\n", creationLL(length));            // Вызовем метод формирования списка.
        System.out.printf("Развернутый список: %s\n", reverseLL(creationLL(length))); // Вызовем метод разворота списка.
    }

    // МЕТОД ФОРМИРОВАНИЯ СПИСКА LinkedList
    private static LinkedList<Integer> creationLL(int length) {                       // Аргумент - длина списка.
        LinkedList<Integer> myLinkList = new LinkedList<>();
        for (int i = 0; i < length; i++) {                                            // Добавляем в список числа [0, 9].
            myLinkList.add(i);
        }
        return myLinkList;
    }

    // МЕТОД РАЗВОРОТА СПИСКА
    private static LinkedList<Integer> reverseLL(LinkedList<Integer> myLList) {       // Аргумент - исходный список.
        LinkedList<Integer> reversedLL = new LinkedList<>();
        while (myLList.size() > 0 ) {                                   // В рамках итерации извлекаем последний элемент
            reversedLL.add(myLList.pollLast());                         // исходного списка и записываем его на место
        }                                                               // первого элемента нового.
        return reversedLL;                                              // Возвращаем новый список.
    }
}
