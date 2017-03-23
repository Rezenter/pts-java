package term03.integerCollections;

/**
 * Структура данных "дек", хранящая целые числа.
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Deque.html)
 */
public interface IntegerDeque extends IntegerQueue {

    /**
     * Положить элемент в начало дека.
     *
     * @param element элемент
     * @return добавлен ли элемент
     */
    boolean offerFirst(long element);

    /**
     * Удалить и вернуть элемент из начала дека.
     *
     * @return значение в начале дека
     */
    long pollFirst();

    /**
     * Посмотреть элемент в начале дека.
     *
     * @return значение в начале дека
     */
    long peekFirst();

    /**
     * Положить элемент в конец дека.
     *
     * @param element элемент
     * @return добавлен ли элемент
     */
    boolean offerLast(long element);

    /**
     * Удалить и вернуть элемент из конца дека.
     *
     * @return значение в конце дека
     */
    long pollLast();

    /**
     * Посмотреть элемент в конце дека.
     *
     * @return значение в конце дека
     */
    long peekLast();
}