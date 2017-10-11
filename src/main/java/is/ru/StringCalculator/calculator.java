package is.ru.StringCalculator;

public class calculator	
{
	public static int add(String text) {
		if(text == ""){
			return 0;
		}
		else{
			if(text.contains(",")) {
				return total(text);
			}
			else{
			 	return Integer.parseInt(text);
			}   
		}
	}
	private static int total(String text){
		String[] numbers = text.split(",");
		int sum = 0;
		for (String number : numbers) {
			sum = sum + Integer.parseInt(number);
		}
		return sum;
	}
}