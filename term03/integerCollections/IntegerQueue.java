package term03.integerCollections;

/**
 * Структура данных "очередь", хранящая целые числа.
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Queue.html)
 */
public interface IntegerQueue extends IntegerCollection {

    /**
     * Положить элемент в конец очереди.
     *
     * @param element элемент
     * @return добавлен ли элемент
     */
    boolean offer(long element);

    /**
     * Удалить и вернуть элемент из начала очереди.
     *
     * @return значение в начале очереди
     */
    long poll();

    /**
     * Посмотреть элемент в начале очереди.
     *
     * @return значение в начале очереди
     */
    long peek();
}