package term03.integerCollections;

import term03.m09_d19.IntegerCollection;

/**
 * ��������� ������ "����", �������� ����� �����.
 */
public interface IntegerStack extends IntegerCollection {

    /**
     * �������� ������� �� ������� �����.
     *
     * @param element �������
     * @return �������� �� �������
     */
    boolean push(long element);

    /**
     * ����� � ������� ������� � ������� �����.
     *
     * @return �������� �� �������
     */
    long pop();

    /**
     * ���������� ������� �� ������� �����.
     *
     * @return �������� �� �������
     */
    long peek();
}