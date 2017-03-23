package term03.integerCollections;

/**
 * ��������� ������ "�������", �������� ����� �����.
 * (http://docs.oracle.com/javase/6/docs/api/java/util/Queue.html)
 */
public interface IntegerQueue extends IntegerCollection {

    /**
     * �������� ������� � ����� �������.
     *
     * @param element �������
     * @return �������� �� �������
     */
    boolean offer(long element);

    /**
     * ������� � ������� ������� �� ������ �������.
     *
     * @return �������� � ������ �������
     */
    long poll();

    /**
     * ���������� ������� � ������ �������.
     *
     * @return �������� � ������ �������
     */
    long peek();
}