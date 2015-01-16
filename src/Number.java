public class Number
{
	public static String getEnding(int number)
	{
		String ending;

		if (number >= 4 && number <= 20) ending = "th";

		int last_digit = number % 10;
		switch (last_digit) {
			case 0: ending = "th";
					break;
			case 1: ending = "st";
					break;
			case 2: ending = "nd";
					break;
			case 3: ending = "rd";
					break;
			default: ending = "th";
					 break;
		}

		return ending;
	}
}
