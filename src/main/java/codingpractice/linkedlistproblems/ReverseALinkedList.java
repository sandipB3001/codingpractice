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
		
		LinkedListDemo reverseLinkedList = reverseLinkedList(linkedListDemo);
		linkedListOperations.showLinkedListValues(reverseLinkedList);
	}
	
	public static LinkedListDemo reverseLinkedList(LinkedListDemo head) {

		LinkedListDemo pointerNode = head;
		LinkedListDemo ref = null;
		LinkedListDemo ref1 = null;
		while(null!=pointerNode) {
			
			ref = pointerNode.getNextNode();
			pointerNode.setNextNode(ref1);
			
			ref1 = pointerNode;
			pointerNode = ref;

		}
		head = ref1;
		return head;
	}

}

//Time complexity: O(n) and Space Complexity: Not sure
// i/p: 1	2	3	4	5----pointerNode
// o/p: 5	4	3	2	1----newLinkedListDemo