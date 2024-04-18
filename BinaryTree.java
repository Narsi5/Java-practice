import java.util.*;
public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;

        }
    }

    static class BT{
        static int index = -1;
        public static Node build(int nodes[]) {
            index++;
            if(nodes[index]==-1){
                return null;
            }
            Node nn = new Node(nodes[index]);
            nn.left = build(nodes);
            nn.right = build(nodes);

            return nn;

        }
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        System.out.print(root.data + " ");
        postorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");

    }
    public static void levelorder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else {
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNodes(Node root){
        if (root == null){
            return 0;
        }
        int leftnodes = countNodes(root.left);
        int rightnodes = countNodes(root.right);
        return leftnodes+rightnodes+1;
    }
    public static int sumofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftnodesum = sumofNodes(root.left);
        int rightnodesum = sumofNodes(root.right);
        return leftnodesum+rightnodesum+root.data;
    }
    public static int heightofTree(Node root){
        if(root == null){
            return 0;
        }
        int leftheight = heightofTree(root.left);
        int rightheight = heightofTree(root.right);
        int myheight = Math.max(leftheight,rightheight)+1;
        return myheight;
    }
    public static int diameter(Node root){
        //O(N^2)
        if(root == null){
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightofTree(root.left)+ heightofTree(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht,right.ht)+1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.diam + right.diam +1;
        int mydiam = Math.max(Math.max(diam1,diam2),diam3);

        TreeInfo myInfo = new TreeInfo(myHeight,mydiam);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree = new BT();
        Node root = tree.build(nodes);
        System.out.println(root.data);

        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);
        System.out.println(countNodes(root));
        System.out.println(sumofNodes(root));
        System.out.println(heightofTree(root));
        System.out.println(diameter(root));
        System.out.println(diameter2(root));
    }
}
