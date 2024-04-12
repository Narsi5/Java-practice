import java.util.*;
public class LL {

//    class Node{
//        String data;
//        Node next;
//
//        Node(String data){
//            this.data = data;
//            this.next = null;
//            size++;
//        }
//    }
//    private int size;
//    LL(){
//        this.size = 0;
//    }
//    Node head = null;
//    public void addFirst(String data){
//        Node nn = new Node(data);
//        if(head == null){
//            head = nn;
//            return;
//        }
//        nn.next = head;
//        head = nn;
//    }
//    public void addLast(String data){
//        Node nn = new Node(data);
//        if(head == null){
//            head = nn;
//            return;
//        }
//        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = nn;
//    }
//    public void deleteFirst(){
//        if(head == null) {
//            System.out.println("The list is empty");
//            return;
//        }
//        size--;
//        head = head.next;
//
//    }
//    public void deleteLast(){
//        Node curr = head;
//        Node prev = null;
//        if(head == null){
//            System.out.println("list is empty");
//            return;
//        }
//        while(curr.next!=null){
//            prev = curr;
//            curr = curr.next;
//        }
//        prev.next = null;
//        size--;
//    }
//    public  void printList(){
//        Node temp = head;
//        while(temp!= null){
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        System.out.println(list);
        System.out.println(list.size());
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+"-> ");
        }
        System.out.println("NULL");
    }
}
