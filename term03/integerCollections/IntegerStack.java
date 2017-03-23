package term03.integerCollections;

import term03.m09_d19.IntegerCollection;

/**
 * Структура данных "стек", хранящая целые числа.
 */
public interface IntegerStack extends IntegerCollection {

    /**
     * Положить элемент на вершину стека.
     *
     * @param element элемент
     * @return добавлен ли элемент
     */
    boolean push(long element);

    /**
     * Снять и вернуть элемент с вершины стека.
     *
     * @return значение на вершине
     */
    long pop();

    /**
     * Посмотреть элемент на вершине стека.
     *
     * @return значение на вершине
     */
    long peek();
}