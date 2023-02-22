import java.util.LinkedList;
import java.util.Queue;

/*
Задача № 2.	Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Sem_4_Hmw_Task2 {

    // МЕТОД ФОРМИРОВАНИЯ СПИСКА LinkedList
    LinkedList<Integer> creationLL(int length) {                     // Аргумент - длина списка.
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        for (int i = 0; i < length; i++) {                           // Добавляем в список числа [0, length-1].
            myLinkedList.add(i);
        }
        return myLinkedList;
    }

    // РЕАЛИЗАЦИЯ МЕТОДА enqueue() - добавляет элемент в конец очереди.
    Queue<Integer> enqueue(LinkedList<Integer> addLL, int num) {
        addLL.add(num);
        return addLL;
    }

    // РЕАЛИЗАЦИЯ МЕТОДА dequeue() - возвращает первый элемент из очереди и удаляет его.
    LinkedList<Integer> dequeue(LinkedList<Integer> delLL, int number) {
        delLL.remove(number);
        return delLL;
    }

    // РЕАЛИЗАЦИЯ МЕТОДА first() - возвращает первый элемент из очереди, не удаляя его.
    Integer first(LinkedList<Integer> getLL) {
        int getNumber;
        getNumber = getLL.get(0);
        return getNumber;
    }
}
