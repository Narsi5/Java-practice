public class ReverseLinkedList {
    //iterative

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    private int size;
    ReverseLinkedList(){
        this.size = 0;
    }
    Node head = null;
    public void addFirst(String data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;
    }
    public void addLast(String data){
        Node nn = new Node(data);
        if(head == null){
            head = nn;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = nn;
    }
    public void deleteFirst(){
        if(head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;

    }
    public void deleteLast(){
        Node curr = head;
        Node prev = null;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        size--;
    }
    public  void printList(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void reverselist(){
        if(head == null|| head.next == null){
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            Node front = curr.next;
            curr.next = prev;
            //updation
            prev = curr;
            curr = front;
        }
        head.next = null;
        head = prev;


    }

    public static void main(String[] args){
        ReverseLinkedList list = new ReverseLinkedList();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("e");
        list.printList();
        list.reverselist();
       list.printList();
    }

}
