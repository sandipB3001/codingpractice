package codingpractice.linkedlistproblems;

import codingpractice.linkedlistproblems.model.LinkedListDemo;
import codingpractice.linkedlistproblems.operations.LinkedListOperations;

public class ReverseALinkedList {

	public static void main(String[] args) {
		LinkedListDemo linkedListDemo = new LinkedListDemo();
		LinkedListOperations linkedListOperations = new LinkedListOperations();
		
		linkedListOperations.addValue(linkedListDemo, 1);
		linkedListOperations.addValue(linkedListDemo, 2);
		linkedListOperations.addValue(linkedListDemo, 3);
		linkedListOperations.addValue(linkedListDemo, 4);
		linkedListOperations.addValue(linkedListDemo, 5);
		
		linkedListOperations.showLinkedListValues(linkedListDemo);
		System.out.println();
		LinkedListDemo reverseLinkedList = reverseLinkedList(linkedListDemo);
		linkedListOperations.showLinkedListValues(reverseLinkedList);
	}
	
	public static LinkedListDemo reverseLinkedList(LinkedListDemo linkedListDemo) {
		LinkedListDemo newLinkedListDemo = new LinkedListDemo();
		newLinkedListDemo.setValue(linkedListDemo.getValue());
		newLinkedListDemo.setNextNode(null);
		
		LinkedListDemo pointerNode = linkedListDemo.getNextNode();
		while(null!=pointerNode) {
			LinkedListDemo temp = new LinkedListDemo();
			temp.setValue(pointerNode.getValue());
			temp.setNextNode(newLinkedListDemo);
			newLinkedListDemo = temp;
			
			pointerNode = pointerNode.getNextNode();
		}
		
		return newLinkedListDemo;
	}

}

//Time complexity: O(n) and Space Complexity: Not sure
// i/p: 1	2	3	4	5
// o/p: 5	4	3	2	1