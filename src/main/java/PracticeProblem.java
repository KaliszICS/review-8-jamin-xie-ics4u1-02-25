public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word) {
		word = word.toLowerCase();
		if (word.endsWith("ey")) {
			return "eys";
		} else if (word.endsWith("y")) {
			return "ies";
		} else if (word.endsWith("ife")) {
			return "ives";
		}
		return "s";
	}

	public static int min(int num, int num2, int num3) {
		int smallest = num;
		if (num2 <= smallest) {
			smallest = num2;
		} if (num3 <= smallest) {
			smallest = num3;
		}
		return smallest;
	}

	public static boolean isLeapYear(int num) {
		if ((num % 4 == 0) && (num % 100 != 0) || (num % 400 == 0)) {
			return true;
		}
		return false;
	}
}
