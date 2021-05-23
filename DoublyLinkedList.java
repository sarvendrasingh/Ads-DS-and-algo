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
        ListNode current = head;
        // ListNode current = previous;
        while(current != null){
            System.out.print(current.data + "<-->");
            current = current.next;
        }
        System.out.print("null");
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
//        dll.displayForward();
    }
}
