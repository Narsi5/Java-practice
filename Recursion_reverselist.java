public class Recursion_reverselist {
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
    Recursion_reverselist(){
        this.size = 0;
    }
    Node head ;
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

    public Node reverse(Node head){
        if(head == null|| head.next == null){
            return head;
        }
        Node newHead= reverse(head.next);
        head.next.next = head;
        head.next= null;
        return newHead;
    }

    public static void main(String[] args) {
        Recursion_reverselist list = new Recursion_reverselist();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.addLast("f");
        list.printList();
        list.head = list.reverse(list.head);
        list.printList();
    }

}
