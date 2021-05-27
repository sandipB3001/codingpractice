package codingpractice.stringproblems;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfOccurrences {

	public static void main(String[] args) {
		String str = "I love coding";
		str = str.toLowerCase();
		str = str.replaceAll("\\s+", "");
		Map<Character,Integer> chars = new HashMap<>();
		for(int i=0; i<str.length();i++) {
			if(chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
			}
			else
				chars.put(str.charAt(i), 1);
		}
		for(Map.Entry<Character, Integer> mapEntry: chars.entrySet()) {
			System.out.println(mapEntry.getKey() + "->" + mapEntry.getValue());
		}
	}

}
