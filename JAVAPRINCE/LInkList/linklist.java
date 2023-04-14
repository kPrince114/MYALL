class first {
    Node head;
    private int size;

    first() {
        this.size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
        
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }

        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }

        currNode.next = null;
    }

    public int getSize() {
        return size;
    }

    // add middle in linklist;
    public void addrendom(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;
        // ya to ik hi node h.. ya first par insert karna h.. (add fisrt method )
        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }
    // print mid element of linklist;
    public void midprint(){
        Node first=head;
        Node second=first.next;
        if(head==null){
            return;
        }
        int mid=1;
        if(first.next==null){
            System.out.println("you have only one data and data is :- "+ first.data);
            return;
        }
        
        while(first.next!=null && second.next!=null){
            mid++;
            first=first.next;
            second=second.next;
        }
        Node first1=head;
        int i=1;
        while(first1.next!=null){
            i++;
            first1=first1.next;
           
            if(i==mid){
                System.out.println("your mid element is here :-  "+first1.data);
                break;
            }
        }
    }
    //Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
    public void DisplayIndexinRendom(String number){
        Node curr=head;
        if(curr==null){
            System.out.println("your linklist is emply");
            return;
        }
        if(curr.data==number){
            System.out.println("index is :- "+1);
            return;
        }
        int index=1;
        while(curr.next!=null){
            if(curr.data==number){
                System.out.println("incex is :- " + index);
                break;
            }
            curr=curr.next;
            
        }

        
    }



    public static void main(String[] args) {
        first list = new first();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");

        list.printList();

        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());

        list.removeFirst();
        list.printList();

        list.removeLast();
        //int i=list.getSize();
       
        
        list.addrendom(2, "prince");
        list.addFirst("this");
        list.printList();
        list.midprint();
        
        list.DisplayIndexinRendom("this");
    }
}