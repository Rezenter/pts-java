package term03.m09_d19;

/**
 * »нтерфейс линейной структуры данных, хран€щей целые числа.
 * <p/>
 * (см. http://docs.oracle.com/javase/6/docs/api/java/util/List.html)
 */
public interface IntegerList extends IntegerCollection {

    /**
     * ¬ернуть элемент, наход€щийс€ на указанной позиции.
     *
     * @param index номер позиции
     * @return искомый элемент
     */
    long get(int index);

    /**
     * ”становить элемент, наход€щийс€ на указанной позиции, равным указанному значению.
     *
     * @param index   номер позиции
     * @param element новое значение
     * @return предыдущее значение на указанной позиции
     */
    long set(int index, long element);

    /**
     * ƒобавить элемент на указанную позицию (со сдвигом).
     *
     * @param index   номер позиции
     * @param element новое значение
     * @throws Exception 
     */
    void add(int index, long element) throws Exception;

    /**
     * ”далить элемент, наход€щийс€ на указанной позиции (со сдвигом).
     *
     * @param index номер позиции
     * @return предыдущее значение на указанной позиции
     */
    long remove(int index);
}
