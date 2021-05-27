package codingpractice.linkedlistproblems;

import codingpractice.linkedlistproblems.model.LinkedListDemo;
import codingpractice.linkedlistproblems.operations.LinkedListOperations;

public class AddElementsOfTwoLinkedLists {

	public static void main(String[] args) {
		LinkedListDemo linkedListOne = new LinkedListDemo();
		LinkedListDemo linkedListTwo = new LinkedListDemo();

		LinkedListOperations linkedListOperations = new LinkedListOperations();

		linkedListOperations.addValue(linkedListOne, 1);
		linkedListOperations.addValue(linkedListOne, 2);
		linkedListOperations.addValue(linkedListOne, 3);
		linkedListOperations.addValue(linkedListOne, 4);
		linkedListOperations.addValue(linkedListOne, 5);
		linkedListOperations.addValue(linkedListOne, 6);



		linkedListOperations.addValue(linkedListTwo, 1);
		linkedListOperations.addValue(linkedListTwo, 2);
		linkedListOperations.addValue(linkedListTwo, 3);


		linkedListOperations.showLinkedListValues(linkedListOne);
		linkedListOperations.showLinkedListValues(linkedListTwo);

		LinkedListDemo reversedListOne = reverseALinkedList(linkedListOne);
		LinkedListDemo reversedListTwo = reverseALinkedList(linkedListTwo);


		LinkedListDemo addTwoLinkedLists = addTwoLinkedLists(reversedListOne, reversedListTwo);
		linkedListOperations.showLinkedListValues(reverseALinkedList(addTwoLinkedLists));
	}

	public static LinkedListDemo addTwoLinkedLists(LinkedListDemo listOne, LinkedListDemo listTwo) {
		int rem = 0;
		LinkedListDemo head = null;
		LinkedListDemo ref = null;
		while(listOne!=null && listTwo!=null) {
			int addedNum = (Integer)listOne.getValue() + (Integer)listTwo.getValue()+rem;
			LinkedListDemo tempNode = new LinkedListDemo();

			if(addedNum >= 10) {
				tempNode.setValue(addedNum % 10);
				rem = addedNum / 10; 
			}
			else {
				tempNode.setValue(addedNum);
				rem = 0;
			}

			if(null==head) {
				head = tempNode;
				ref = head;
			}
			else {
				ref.setNextNode(tempNode);
				ref=tempNode;
			}
			ref = tempNode;
			listOne = listOne.getNextNode();
			listTwo = listTwo.getNextNode();
		}
		
		if(null!= listOne && null == listTwo) {
			while(null!=listOne) {
				int addedNum = rem + (Integer)listOne.getValue();
				LinkedListDemo tempNode = new LinkedListDemo();

				if(addedNum >= 10) {
					tempNode.setValue(addedNum % 10);
					rem = addedNum / 10; 
				}
				else {
					tempNode.setValue(addedNum);
					rem = 0;
				}

				ref.setNextNode(tempNode);
				ref=tempNode;

				ref = tempNode;
				listOne = listOne.getNextNode();
			}

		}
		else if(null== listOne && null != listTwo) {
			while(null!=listTwo) {
				int addedNum = rem + (Integer)listTwo.getValue();
				LinkedListDemo tempNode = new LinkedListDemo();

				if(addedNum >= 10) {
					tempNode.setValue(addedNum % 10);
					rem = addedNum / 10; 
				}
				else {
					tempNode.setValue(addedNum);
					rem = 0;
				}

				ref.setNextNode(tempNode);
				ref=tempNode;

				ref = tempNode;
				listTwo = listTwo.getNextNode();
			}

		}
		if(rem!=0) {
			LinkedListDemo tempNode = new LinkedListDemo();
			tempNode.setValue(rem);
			ref.setNextNode(tempNode);
		}
		return head;
	}
	public static LinkedListDemo reverseALinkedList(LinkedListDemo head) {
		LinkedListDemo tempNode = head;
		LinkedListDemo temp1 = null;
		LinkedListDemo temp2 = null;
		while(null!=tempNode) {
			temp1 = tempNode.getNextNode();
			tempNode.setNextNode(temp2);
			temp2=tempNode;
			tempNode = temp1;
		}
		return temp2;
	}
}

//i/p: 1->2->3->4->5->6, 1->2->3	
//o/p: 1->2->3->5->7->9	

// Time complexity: O(n) and Space Complexity: Not sure