import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoublyLinkedList {
    private  ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode {
        private int data;
        private ListNode previous;
        private ListNode next;
        public  ListNode(int data){
            this.data = data;
        }
    }
    public  DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty() {
        return length == 0; // or head == null
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }
    public void insertEnd(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void display(){
        if(head == null){
            return;
        }
        ListNode current = head;
        // ListNode current = previous;
        System.out.print("null");
        System.out.print("<--");
        while(current != null){
            System.out.print(current.data + "<-->");
            current = current.next;
        }
        System.out.print("null");
    }

    public void displayBackward(){
        if(head == null){
            return;
        }
        ListNode current = tail;
        System.out.print("null");
        System.out.print("<--");
        while(current != null){
            System.out.print(current.data + "<-->");
            current = current.previous;
        }
        System.out.print("null");
    }
    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail){
            head = null;
        }
        else{
            tail.previous.next = null;  //tail.previous.next
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int i,n,c;
        System.out.print("Enter number of values to insert: ");
        c = sc.nextInt();
        for (int j = 0; j < c; j++) {
            System.out.print("Enter 0 to insert at starting and 1 to insert at end: ");
            i = sc.nextInt();
            if (i==0){
                System.out.print("Enter value to insert at start: ");
                n = sc.nextInt();
                dll.insertFirst(n);
            }
            else if(i==1){
                System.out.print("Enter value to insert at end: ");
                n = sc.nextInt();
                dll.insertEnd(n);
            }
        }

        System.out.println();

        System.out.println("Entered list is: ");
        dll.display();
        System.out.println();
        System.out.println("Entered list from backward is: ");
        dll.displayBackward();

        dll.deleteFirst();
        System.out.println();
        System.out.println("Entered list after deleting first element is: ");
        dll.display();

        dll.deleteLast();
        System.out.println();
        System.out.println("Entered list after deleting last element is: ");
        dll.display();
//        dll.displayForward();
    }
}
