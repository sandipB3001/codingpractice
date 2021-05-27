package codingpractice.linkedlistproblems;

import codingpractice.linkedlistproblems.model.LinkedListDemo;
import codingpractice.linkedlistproblems.operations.LinkedListOperations;

public class AddElementsOfTwoLinkedLists {

	public static void main(String[] args) {
		LinkedListDemo linkedListOne = new LinkedListDemo();
		LinkedListDemo linkedListTwo = new LinkedListDemo();
		
		LinkedListOperations linkedListOperations = new LinkedListOperations();

		linkedListOperations.addValue(linkedListOne, 9);
		linkedListOperations.addValue(linkedListOne, 9);
		linkedListOperations.addValue(linkedListOne, 9);
		linkedListOperations.addValue(linkedListOne, 9);
		
		
		
		linkedListOperations.addValue(linkedListTwo, 9);
		linkedListOperations.addValue(linkedListTwo, 9);
		linkedListOperations.addValue(linkedListTwo, 9);
		

		linkedListOperations.showLinkedListValues(linkedListOne);
		linkedListOperations.showLinkedListValues(linkedListTwo);
		
		int firstNumber = generateNumberFromLinkedList(linkedListOne);
		int secondNumber = generateNumberFromLinkedList(linkedListTwo);
		
		
		LinkedListDemo generateLinkedListFromNumber = generateLinkedListFromNumber(firstNumber+secondNumber);
		
		linkedListOperations.showLinkedListValues(generateLinkedListFromNumber);
	}
	
	public static int generateNumberFromLinkedList(LinkedListDemo linkedListDemo) {
		int tempNumber = (Integer)linkedListDemo.getValue();
		LinkedListDemo tempNode = linkedListDemo.getNextNode();
		while(null!=tempNode) {
			tempNumber = (tempNumber * 10) + (Integer)tempNode.getValue();
			tempNode = tempNode.getNextNode();
		}
		return tempNumber;
	}

	public static LinkedListDemo generateLinkedListFromNumber(int num) {
		LinkedListDemo headNode = new LinkedListDemo();
		LinkedListDemo temp = null;
		LinkedListDemo nextNode = null;
		while(num>=10) {
			int value = num % 10;
			num/=10;
			temp = new LinkedListDemo();
			temp.setValue(value);
			
			if(null != nextNode) {
				temp.setNextNode(nextNode);
			}
			nextNode = temp;
		}
		
		headNode.setValue(num);
		headNode.setNextNode(temp);
		
		return headNode;
	}
}

//i/p: 1->3->2->3,2->5->4
//o/p: 1->5->7->7

// i/p: 1->2->3->4->5,1->2->3->4
// o/p: 1->3->5->7->9

//i/p: 9->9->9->9, 9->9->9
//o/p: 1->0->9->9->8


// Time complexity: O(n) and Space Complexity: Not sure