//import java.util.Scanner;
//
////https://leetcode.com/problems/middle-of-the-linked-list/?envType=study-plan&id=algorithm-i
//public class MiddleOfTheLinkedList {
//    class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//        public void insert(int data){
//            Node node = new Node(data);
//            node.next = head;
//            head = node;
//
//        }
//    }
//    public int sizeOfNode(Node head){
//        Node temp = head;
//        int count=0;
//        while(temp != null) {
//            ++count;
//            temp = temp.next;
//        }
//        return count;
//    }
//
//
//
//    public Node middleNode(Node head){
//
//        int count = sizeOfNode(head);
//    }
//    public static void main(String[] args) {
//        Node node = new Node();
//        Scanner sc = new Scanner(System.in);
//        for(int i=0; i<3; i++){
//            System.out.print("Enter data : ");
//            node.insert(sc.nextInt());
//        }
//    }
//}
