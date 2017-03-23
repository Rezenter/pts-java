package term03.integerCollections;

/**
 * ��������� ������ "���", �������� ����� �����.
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Deque.html)
 */
public interface IntegerDeque extends IntegerQueue {

    /**
     * �������� ������� � ������ ����.
     *
     * @param element �������
     * @return �������� �� �������
     */
    boolean offerFirst(long element);

    /**
     * ������� � ������� ������� �� ������ ����.
     *
     * @return �������� � ������ ����
     */
    long pollFirst();

    /**
     * ���������� ������� � ������ ����.
     *
     * @return �������� � ������ ����
     */
    long peekFirst();

    /**
     * �������� ������� � ����� ����.
     *
     * @param element �������
     * @return �������� �� �������
     */
    boolean offerLast(long element);

    /**
     * ������� � ������� ������� �� ����� ����.
     *
     * @return �������� � ����� ����
     */
    long pollLast();

    /**
     * ���������� ������� � ����� ����.
     *
     * @return �������� � ����� ����
     */
    long peekLast();
}