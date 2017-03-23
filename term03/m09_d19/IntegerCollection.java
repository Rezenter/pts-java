package term03.m09_d19;

import java.security.NoSuchAlgorithmException;

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
     * @throws NoSuchAlgorithmException 
     */
    boolean remove(long element) throws NoSuchAlgorithmException;

    /**
     * ���������, �������� �� ��������� ��������� �������.
     *
     * @param element �������
     * @return �������� �� ��������� �������
     * @throws NoSuchAlgorithmException 
     */
    boolean contains(long element) throws NoSuchAlgorithmException;
}
