package is.ru.stringcalculator;

import java.util.Arrays;
import java.util.ArrayList;

public class Calculator{
	public static int add(String text){
		if (text.contains("-")){
			String numbers[] = getSplit(text);
			ArrayList<String> list = new ArrayList<String>();
			for (int i = 0; i < numbers.length; i++){
				if (numbers[i].contains("-")){
					list.add(numbers[i]);
				}
			}
			String[] negativeNumbers = new String[list.size()];
			list.toArray(negativeNumbers);
			throw new IllegalArgumentException("Negatives are not allowed: " + (Arrays.toString(negativeNumbers)));
		}
		if (text.equals("")){
			return 0;
		}
		else{
			if (text.contains(",") || text.contains("\n")){
				String numbers[] = getSplit(text);
				int total = 0;
				for (String number : numbers){
					if (!(StringToInt(number) > 1000)){
						total+= StringToInt(number);
					}
				}
				return total;
			}
			return StringToInt(text);
		}
	}

	private static int StringToInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] getSplit(String number){
		return number.split(",|\\\n");
	}
}
