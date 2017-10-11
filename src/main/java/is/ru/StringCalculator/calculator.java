package is.ru.StringCalculator;

public class calculator	
{
	public static int add(String text) {
		int sum = 0;
		if(text == ""){
			return sum;
		}
		else{
			if(text.contains(",")) {
				String[] numbers = text.split(",");
				for (String number : numbers) {
					sum = sum + Integer.parseInt(number);
				}
			}
			else{
			 	return Integer.parseInt(text);
			}
		}
		return sum;   
	}
}