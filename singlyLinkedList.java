import java.util.*;

public class singlyLinkedList
{

    // 	public class SinglyLinkedList{
    private ListNode head;
    private static class ListNode{
        private int data;   //Generic type
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public ListNode insertInSortedList(ListNode newNode){
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp =  current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void display(ListNode head){
        ListNode current = head;
        // ListNode current = previous;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void display(){                  // for using display method without passing any argument
        ListNode current = head;
        // ListNode current = previous;
        while(current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        else{
            int count = 0;
            ListNode current = head;
            while(current != null){
                count++;
                current = current.next;
            }
            return count;
        }
    }

    public ListNode insertFirst(int a){
        ListNode newNode = new ListNode(a);
        ListNode current = head;
        newNode.next = current;
        head.next = newNode;

        return head;
    }

    public boolean search(ListNode head,int a){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if(current.data == a ){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head){
        if(head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            //  previous = current;

        }
        //  head = null;
        return previous;

    }

    public ListNode middle(){
        ListNode fastptr = head;
        ListNode slowptr = head;
        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;
        }
        return slowptr;
    }

    public ListNode endNodeValue(int n){
        if(head == null){
            return null;
        }
        if(n <= 0){
            throw new IllegalArgumentException("Invalid value: n = "+ n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count<n){
            if(refPtr == null){
                throw new IllegalArgumentException(n+ " is greater than number of nodes in list.");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr!= null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    public void removeDuplicate(){
        //  if(head == null){
        //      return null;
        //  }
        ListNode current = head;
        while(current!=  null && current.next != null){
            if (current.data == current.next.data){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }

    }

    public static void main(String[] args) {
//		System.out.println("Hello World");

        //     Main sll = new Main(); // object called sll
        //     sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(1);
        // ListNode fourth = new ListNode(8);
        // ListNode fifth = new ListNode(16);
        // sll.head.next = second;
        // second.next = third;
        // third.next = fourth;
        // fourth.next = fifth;
        // sll.display(sll.head);  // calling display method
        // System.out.println();
        // Scanner sc = new Scanner(System.in);

        singlyLinkedList sll = new singlyLinkedList();
        sll.insertFirst(4);
        sll.insertFirst(3);
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);
        sll.insertFirst(1);
        sll.display();


        // System.out.println();
        // System.out.println("Length is -- "+ sll.length());
        // System.out.println();
        // System.out.println("Enter integer to search in the List: ");
        // int a = sc.nextInt();
        // if(sll.search(sll.head,a)){
        //     System.out.println("Node found");
        // }
        // else{
        //     System.out.println("Node not found");
        // }

        // System.out.println();
        // System.out.println("Middle node: "+ sll.middle().data);

        // System.out.println();
        // ListNode headReverseList = sll.reverse(sll.head);
        // System.out.println("Reversed List: ");
        // sll.display(headReverseList);

        // System.out.println();
        // System.out.println("Enter node Value from the end to find its value: ");
        // int n = sc.nextInt();
        // ListNode x = sll.endNodeValue(n);
        // System.out.println("Node value of "+n+" node from end is "+x.data);

        // sll.removeDuplicate();
        // System.out.println();
        // System.out.println("List after removing duplicates from sorted list: ");
        // sll.display(sll.head);

        //System.out.println();
        //System.out.println("List after insertion in sorted order: ");
        //ListNode newNode = new ListNode(11);
        //sll.insertInSortedList(newNode);
        //sll.display(sll.head);



    }
}