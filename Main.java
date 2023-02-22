/*
Задача № 2.	Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Main {
    public static void main(String[] args){
        Sem_4_Hmw_Task2 myQueue = new Sem_4_Hmw_Task2();
        int length = 10;                                                      // Зададим длину списка.
        int addElement = 55;                                                  // Введем элемент, который нужно добавить.
        System.out.printf("\nИсходный список:                     %s\n",
                myQueue.creationLL(length));
        System.out.printf("Элемент " + addElement + " добавлен в конец очереди: ");           // Вызов метода enqueue.
        System.out.println(myQueue.enqueue(myQueue.creationLL(length), addElement));

        System.out.printf("Первый элемент исходной очереди:      %s\n",                       // Вызов метода first.
                myQueue.first(myQueue.creationLL(length)));

        int deleteElement = 0;                                                                // Удалим элемент 0.
        System.out.printf("Элемент " + deleteElement + " удален из очереди:         ");       // Вызов метода dequeue.
        System.out.println(myQueue.dequeue(myQueue.creationLL(length), deleteElement));

        System.out.printf("Первый элемент измененной очереди:    %s\n",                       // Вызов метода first.
                myQueue.first(myQueue.dequeue(myQueue.creationLL(length), deleteElement)));
    }
}
