package Practice;
/**
 * Remove duplicates from an unsorted linked list
 */

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class NodeBST {
	int data;
	NodeBST left;
	NodeBST right;

	NodeBST(int d) {
		data = d;
		left = null;
		right = null;
	}
}

public class RemoveDuplicatesFromUnsortedLinkedList {
	
	static NodeBST root = null;

	public static void main(String[] args) {
		Node head = new Node(20);
        head.next = new Node(12);
        head.next.next = new Node(11);
        head.next.next.next = new Node(11);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(11);
        head.next.next.next.next.next.next = new Node(10);

        System.out.println("Linked list before removing duplicates :");
        printList(head);

        removeDuplicates(head);
        System.out.println("");
        System.out.println("Linked list after removing duplicates :");
        printList(head);
    }

	private static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
	
	static Node iter = null;
	private static void removeDuplicates(Node head) {
		iter = head;
		if(head!=null) {
			while(head!=null) {
				addToBST(head.data);
				iter = head;
				head = head.next;
			}
		}
		
		displayBSTInOrder(root);
		
		
		//createBSTList(head);
	}

	private static void displayBSTInOrder(NodeBST root) {

		if(root!=null) {
			displayBSTInOrder(root.left);
			System.out.print(root.data + " ");
			displayBSTInOrder(root.right);
		}
		
	}

	private static void addToBST(int data) {
        if (root == null) {
            root = new NodeBST(data);
        } else {
            NodeBST temp = root;
            NodeBST prev = null;
            while (temp != null) {
                prev = temp;
                if (data < temp.data) {
                    temp = temp.left;
                } else if (data > temp.data) {
                    temp = temp.right;
                } else {
                    // Duplicate found, remove the node
                    iter.next = iter.next.next;
                    return;
                }
            }
            if (data < prev.data) {
                prev.left = new NodeBST(data);
            } else {
                prev.right = new NodeBST(data);
            }
        }
    }

	private static void createBSTList(Node head) {
		NodeBST root = null;
		NodeBST temp = null;
		if(head!=null) {
        	root = new NodeBST(head.data);
        	head = head.next;
        	temp = root;
        }
		while(head!=null) {
			NodeBST prev = null;
			while(temp!=null && temp.data!=head.data) {
				prev = temp;
                if(temp.data>head.data) {
                    temp = temp.left;
                } else if(temp.data<head.data){
                    temp = temp.right;
                } else {
                	break;
                }
			}
			if(temp!=null && temp.data==head.data) {
				head = head.next;
				temp = root;
				continue;
			}
			if(prev.data>head.data) {
				prev.left = new NodeBST(head.data);
			} else if(prev.data<head.data) {
				prev.right = new NodeBST(head.data);
			}
			head = head.next;
			temp = root;
			
		}
		System.out.println("\nPrinting unique elements in sorted order");
		printInorder(root);
            
	}

	private static void printInorder(NodeBST root) {
		if(root!=null) {
			printInorder(root.left);
			System.out.print(root.data+" ");
			printInorder(root.right);
		}
		
	}

	private static void sortTheList(Node head) {

		if(head!=null) {
			
		}
		
	}
		

}
