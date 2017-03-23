package term03.m09_d19;

import java.security.NoSuchAlgorithmException;

/**
 * Интерфейс абстрактной структуры данных, хранящей целые числа.
 * <p/>
 * (см. http://docs.oracle.com/javase/6/docs/api/java/util/Collection.html)
 */
public interface IntegerCollection {

    /**
     * Количество элементов, хранимых в коллекции.
     *
     * @return количество элементов
     */
    int size();

    /**
     * Проверка коллекции на пустоту.
     *
     * @return пуста ли коллекция
     */
    boolean isEmpty();

    /**
     * Очистить коллекцию.
     */
    void clear();

    /**
     * Добавить указанный элемент в коллекцию.
     *
     * @param element добавляемый объект
     * @return добавлен ли объект
     */
    boolean add(long element);

    /**
     * Удалить одно вхождение указанного элемента из коллекции, если такое существует.
     *
     * @param element удаляемый объект
     * @return удален ли объект
     * @throws NoSuchAlgorithmException 
     */
    boolean remove(long element) throws NoSuchAlgorithmException;

    /**
     * Проверить, содержит ли коллекция указанный элемент.
     *
     * @param element элемент
     * @return содержит ли коллекция элемент
     * @throws NoSuchAlgorithmException 
     */
    boolean contains(long element) throws NoSuchAlgorithmException;
}
