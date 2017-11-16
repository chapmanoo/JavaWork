
public class Examples {

	public static void main(String[] args) {
		System.out.println(findLastWord("doggoesbark"));

		System.out.println(doubleUp("AAbb"));
		
		System.out.println(findContentsOfSandwich("breadjambread"));
		System.out.println(findContentsOfSandwich("xxbreadyy"));
		System.out.println(findContentsOfSandwich("xxbreadtoastbreadyy"));
		
		//System.out.println(evenlySpaced(4,6,2));
		//System.out.println(evenlySpaced(2,4,6));
		//System.out.println(evenlySpaced(4,6,3));
		
		//System.out.println(rebuildString("Chocolate", 1));
		
		diamond(5, '@');
	}
	
	 static int simpleArraySum(int n, int[] ar) {
	        // Complete this function
	        int returnInt;
	        for(int i = 0; i < ar.length; i++)
	        {
	            returnInt += i;
	        }
	       // return returnint;
	    
	 }
	
	public static String diamond(int size, char character) {
		String temp = "";
		if (size == 0)
		{
			return "";
		}
		
		temp += character;
		System.out.println(temp);
		
		return temp + diamond(size - 1, character);
	}

	// example parameters
	// doggoesbark -> bark

	public static String findLastWord(String input) {
		int goesIndex = input.indexOf("goes") + 4;
		String subString = input.substring(goesIndex, input.length());
		return subString;
	}

	// task 1
	// doubleChar("The") -> TThhee

	public static String doubleUp(String origin) {
		String doubled = "";
		for (int i = 0; i < origin.length(); i++) {
			doubled += origin.charAt(i);
			doubled += origin.charAt(i);
		}

		return doubled;
	}
	
	//task 2
	//getSandwich("breadjambread") -> "jam"
	
	public static String findContentsOfSandwich(String input) {
		int breadIndex = input.indexOf("bread") + 5;
		String subString = input.substring(breadIndex, input.length());
		
		//boolean check if "bread" occurs again
		//if so
		//breadIndex = subString.indexOf("bread");
		//else
		if (subString.contains("bread"))
		{
			breadIndex = subString.indexOf("bread");
		} else {
			return "";
		}
		
		subString = subString.substring(0, breadIndex );
		
		return subString;
	}
	
	
    static String timeConversion(String s) {
        // Complete this function
        int hours;
        int mins;
        int secs;
        String temp1 = "";
        String temp2 = "";
        String temp3 = "";
        String timeArray[] = s.split(":");
        String amPM = timeArray[2].substring(2, 4);
        
        hours = Integer.parseInt(timeArray[0]);
    if (hours < 10)
    {
        temp1 = "0" + hours;
    } else {
        temp1 = hours;
	
	//task 3
	//evenlySpaced(4,6,2) -> true
	
	/*public static boolean evenlySpaced(int num1, int num2, int num3){
		/*if(Math.abs(num1 - num2) == Math.abs(num1 - num3) ) {
		return true;
		} else {
			return false;
		}
		
		int[] numbers = new int[3];
		
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		int spacer = Math.abs(num1-num2);
		for(int i : numbers)
		{
			if (numbers[i] == numbers.length) {
				if (Math.abs(numbers[i] - numbers[0]) == spacer)
				{
					return true;
				}
			}
			if (Math.abs(numbers[i] - numbers[i+1]) == spacer)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}*/
	
	//task 4
	//nTwice("Hello", 2) -> "Helo"
	
	public static String rebuildString(String origin, int counter) {
		String toReturn = "";
		String startBuilder = "";
		String endBuilder = "";
		for (int i = 0; i < counter; i++) 
		{
			startBuilder += origin.charAt(i);
		}
		toReturn += startBuilder;
		for (int i = origin.length(); i < origin.charAt(origin.length() - counter); i--)
				{
					endBuilder += origin.charAt(i);
				}
		
		char endChar = origin.charAt(origin.length() - 1);
		for(int i = 1; i <= counter; i++)
		{
			toReturn += origin.charAt(i);
		}
		toReturn += endBuilder;
		
		return toReturn;
	}
}