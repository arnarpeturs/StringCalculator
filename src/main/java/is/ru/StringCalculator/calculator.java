package is.ru.StringCalculator;
import java.util.*;
import java.util.Arrays;
import java.util.List;

public class calculator	
{
	public static int add(String text) {
		if(text.contains(",")) {
			return total(text);
		}
		else{
		 	return getInt(text);
		}   
	}
	private static int total(String text){
		String[] numbers = text.split("[\\,\n]");
		List<String> negativeNumbers = new ArrayList<String>();
		int sum = 0;
		boolean negative = false;
		for (String number : numbers) {
			if(getInt(number) < 0){
				negative = true;
				negativeNumbers.add(number);
			}
			if(negative == false){
				sum = sum + getInt(number);	
			}
		}
		if(negative == false){
			return sum;	
		}
		else{
			negativeMessage(negativeNumbers);
		}
		return 0;
	}

	private static int getInt(String text){
		if(text == ""){
			return 0;
		}
		else{
			return Integer.parseInt(text);
		}
	}
	private static void negativeMessage(List<String> negativeNumbers){
		StringBuilder errorMessage = new StringBuilder("Negatives not allowed: ");
		for(String number : negativeNumbers){
			errorMessage.append(number + ",");
		}
		errorMessage.setLength(errorMessage.length()-1);
		throw new RuntimeException(errorMessage.toString());
	}
}