package algorithm.one;

import java.util.Random;

/**
 * 链表
 */
public class Node {

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }

    public static Node createLink(int length){
        //链表初始化
        Node pHead = new Node(0);
        Random random = new Random();
        //头插
        for(int i = 0; i < length; i++){
            Node pNext = new Node(Math.abs(random.nextInt() % 10));
            pNext.setNext(pHead.getNext());
            pHead.setNext(pNext);
        }
        return pHead;
    }

    public static void printLinked(Node pHead){
        while (pHead != null){
            System.out.print(pHead.getValue() + " -> ");
            pHead = pHead.getNext();
        }
        System.out.println("\r\n");
    }

    public static void destroy(Node pHead){
        Node next;
        while (pHead.getNext() != null){
            next = pHead.getNext();
            pHead = null;
            pHead = next;
        }
    }
}
