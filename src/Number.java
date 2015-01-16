public class Number
{
	public static String getEnding(int number)
	{
		if (number >= 4 && number <= 20) return "th";

		int last_digit = number % 10;
		switch (last_digit) {
			case 0: return "th";
					break;
			case 1: return "st";
					break;
			case 2: return "nd";
					break;
			case 3: return "rd";
					break;
			default: return "th";
					 break;
		}
	}
}
