package is.ru.stringcalculator;

public class Calculator{
	public static int add(String text){
		if (text.equals("")){
			return 0;
		}
		else{
			if (text.contains(",")){
				String numbers[] = text.split(",");
				int total = 0;
				for (String number : numbers){
					total+= Integer.parseInt(number);
				}
				return total;
			}
			return Integer.parseInt(text);
		}
	}
}
