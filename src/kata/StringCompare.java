public class StringCompare {

    public static int compare(String compareIt, String toCompare){
	
		int result = 0;
		if (compareIt == null || toCompare == null || compareIt.length() != toCompare.length())
			return -1;
		for (int i = 0 ; i < compareIt.length(); i++){
			if (compareIt.charAt(i) == toCompare.charAt(i))		
				result++;
		}

		return result;
	}
}
