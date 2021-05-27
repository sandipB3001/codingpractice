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

// i/p : "I love coding"
//o/p :
//	c->1
//	d->1
//	e->1
//	v->1
//	g->1
//	i->2
//	l->1
//	n->1
//	o->2

//Time complexity: O(n) and Space Complexity: O(n)