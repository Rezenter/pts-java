package term03.integerCollections;

/**
 * ��������� ����������� ��������� ������, �������� ����� �����.
 * <p/>
 * (��. http://docs.oracle.com/javase/6/docs/api/java/util/Collection.html)
 */
public interface IntegerCollection {

    /**
     * ���������� ���������, �������� � ���������.
     *
     * @return ���������� ���������
     */
    int size();

    /**
     * �������� ��������� �� �������.
     *
     * @return ����� �� ���������
     */
    boolean isEmpty();

    /**
     * �������� ���������.
     */
    void clear();

    /**
     * �������� ��������� ������� � ���������.
     *
     * @param element ����������� ������
     * @return �������� �� ������
     */
    boolean add(long element);

    /**
     * ������� ���� ��������� ���������� �������� �� ���������, ���� ����� ����������.
     *
     * @param element ��������� ������
     * @return ������ �� ������
     */
    boolean remove(long element);

    /**
     * ���������, �������� �� ��������� ��������� �������.
     *
     * @param element �������
     * @return �������� �� ��������� �������
     */
    boolean contains(long element);
}
