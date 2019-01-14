package metier;

public class Calculatrice {

	public static Double calculate(String num1, String num2, String operator) {
		Double result = null;
		Double num1Final = !(num1.equals("")&&num1.equals("null")) ? Double.valueOf(num1) : 0;
		Double num2Final = !(num2.equals("")&&num2.equals("null")) ? Double.valueOf(num2) : 0;
		switch (operator) {
		case "plus":
			result = num1Final + num2Final;
			
			break;

		case "moins":
			result = num1Final - num2Final;

			break;

		case "fois":
			result = num1Final * num2Final;

			break;

		case "divise":
			if (num2Final != 0) {
				result = num1Final / num2Final;
			}
			break;

		default:
			break;
		}
		return result;
	}

}
