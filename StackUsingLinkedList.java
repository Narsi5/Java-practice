public class StackUsingLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode head;
    public void push(int val){
        ListNode nn = new ListNode(val);

        if(head == null){
            head = nn;
            return;
        }
        nn.next = head;
        head = nn;

    }
    public int pop(){
        int data = head.val;
        if(head == null){
            System.out.println("Stack underflow");
        }
        head = head.next;
        return data;
    }
    public int peek(){
        return head.val;
    }
    public void printStack(){
        ListNode temp = head;
        while(temp != null){

            System.out.println("|"+temp.val+"|");

            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLinkedList Stack = new StackUsingLinkedList();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.printStack();
        Stack.pop();
        System.out.println();
        Stack.printStack();
    }
}
