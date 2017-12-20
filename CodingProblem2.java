import java.util.*;

/*
Cracking the Code Interview
Problem 2.1
Description:
Write code to remove duplicates from an unsorted linked list.
(How would you solve this problem if a temporary buffer is not allowed)
*/

public class CodingProblem2
{
  static Node head;
	public static void main(String [] args)
	{
        head = new Node(1);
        appendNewNode(2);
        appendNewNode(3);
        appendNewNode(2);
        appendNewNode(5);
        appendNewNode(3);
        //appendNewNode(7);

        printAllNode();

        deleteDuplicate();
        System.out.println("After calling deleteDuplicate");
        printAllNode();
	}

    static void deleteDuplicate() {
        /*
        1-2-3-2-5
        1. [loop] grab each node and compare it to the rest
        */
        Node temp = head;
        while(temp.next.next != null) {
            Node temp1 = temp.next;
            Node previous = temp;
            Node nextNode = temp;
            int tempData = temp.data;

            while(temp1.next != null) {
                if(tempData == temp1.data) {
                    if(nextNode != null){
                        System.out.println("deleteDuplicate() - Test1");
                        previous.next = nextNode;
                    } else {
                        System.out.println("deleteDuplicate() - Test2");
                        previous.next = null;
                    }

                }
                previous = temp1;
                temp1 = temp1.next;
                nextNode = temp1.next;
            }

            //move to the next node
            temp = temp.next;
        }
    }

    static void printAllNode() {
        //System.out.println("printAllNode");
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static void appendNewNode(int newData) {
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(newData);
        temp.next = newNode;
        //System.out.println("temp.data: " + temp.data);
    }

    static class Node {
        Node next;
        int data;
        public Node(int d) {
            data = d;
            next = null;
        }
    }

}
