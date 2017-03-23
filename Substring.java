import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String text = sc.nextLine();
		String pattern = sc.nextLine();

		System.out.printf(FORMAT_STRING, text,
				startsWith(text, pattern) ? START_POSITIVE_FORM
						: START_NEGATIVE_FORM, pattern);
		System.out.printf(FORMAT_STRING, text,
				endsWith(text, pattern) ? END_POSITIVE_FORM
						: ENDS_NEGATIVE_FORM, pattern);
	}

	final private static String FORMAT_STRING = "String \"%s\" %s with the string \"%s\".\n";
	final private static String START_POSITIVE_FORM = "starts";
	final private static String START_NEGATIVE_FORM = "doesn't start";
	final private static String END_POSITIVE_FORM = "ends";
	final private static String ENDS_NEGATIVE_FORM = "doesn't end";
	private static Scanner sc;

	private static boolean startsWith(String s, String prefix) {
		if (prefix.length() > s.length()) {
			return false;
		} else {
			for (int i = 0; i < prefix.length(); i++) {
				if (prefix.charAt(i) != s.charAt(i)) {
					return false;
				}
			}
			return true;
		}
	}

	private static boolean endsWith(String s, String suffix) {
		if (suffix.length() > s.length()) {
			return false;
		} else {
			for (int i = suffix.length()-1; i >= 0; ) {
				if (suffix.charAt(i) != s.charAt(s.length()-1)) {
					return false;
				}
			i--;
			}
			return true;
		}
	}
}
