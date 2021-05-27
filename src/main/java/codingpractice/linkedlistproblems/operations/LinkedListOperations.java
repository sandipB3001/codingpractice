package codingpractice.linkedlistproblems.operations;

import codingpractice.linkedlistproblems.model.LinkedListDemo;

public class LinkedListOperations {

	public void addValue(LinkedListDemo linkedListDemo, Object value) {
		
		if(null==linkedListDemo.getValue()) {
			linkedListDemo.setValue(value);
		}
		else {
			LinkedListDemo newNode = new LinkedListDemo();
			newNode.setValue(value);
			LinkedListDemo temp = linkedListDemo;
			while(null!=temp.getNextNode()) {
				temp=temp.getNextNode();								
			}
			temp.setNextNode(newNode);
		}
	}
	
	public void showLinkedListValues(LinkedListDemo linkedListDemo) {
		
		while(null!=linkedListDemo) {
			System.out.print(linkedListDemo.getValue()+"\t");
			linkedListDemo = linkedListDemo.getNextNode();
		}
	}
}
