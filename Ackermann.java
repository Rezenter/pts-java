import java.util.Scanner;

/*
На вход подаются 2 неотрицательных целых числа m и n.
Требуется реализовать функцию Аккермана и вывести на экран значение A(m, n).

http://ru.wikipedia.org/wiki/Функция_Аккермана

input:
2 2

output:
7
 */
public class Ackermann {

    private static Scanner sc;

	public static void main(String[] args) {
        sc = new Scanner(System.in);

        System.out.println(function(sc.nextInt(), sc.nextInt()));
    }

    private static int function(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else {
            if (n == 0) {
                return function(m - 1, 1);
            } else {
                return function(m - 1, function(m, n - 1));
            }
        }
    }
}