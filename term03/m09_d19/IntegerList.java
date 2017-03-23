package term03.m09_d19;

/**
 * ��������� �������� ��������� ������, �������� ����� �����.
 * <p/>
 * (��. http://docs.oracle.com/javase/6/docs/api/java/util/List.html)
 */
public interface IntegerList extends IntegerCollection {

    /**
     * ������� �������, ����������� �� ��������� �������.
     *
     * @param index ����� �������
     * @return ������� �������
     */
    long get(int index);

    /**
     * ���������� �������, ����������� �� ��������� �������, ������ ���������� ��������.
     *
     * @param index   ����� �������
     * @param element ����� ��������
     * @return ���������� �������� �� ��������� �������
     */
    long set(int index, long element);

    /**
     * �������� ������� �� ��������� ������� (�� �������).
     *
     * @param index   ����� �������
     * @param element ����� ��������
     * @throws Exception 
     */
    void add(int index, long element) throws Exception;

    /**
     * ������� �������, ����������� �� ��������� ������� (�� �������).
     *
     * @param index ����� �������
     * @return ���������� �������� �� ��������� �������
     */
    long remove(int index);
}
