package algorithm.one;

/**
 * 链表相加
 */
public class One01 {

    public static void main(String[] args){
        //链表初始化
        Node pHead1 = Node.createLink(6);
        Node.printLinked(pHead1);
        Node pHead2 = Node.createLink(10);
        Node.printLinked(pHead2);
        Node.printLinked(add(pHead1, pHead2));
    }

    public static Node add(Node pHead1, Node pHead2){
        Node sum = new Node(0);
        Node pTail = sum;
        Node p1 = pHead1.getNext();
        Node p2 = pHead2.getNext();
        Node cur;
        int value;
        int carry = 0;
        //链表相加
        while (p1 != null && p2 != null){
            value = p1.getValue() + p2.getValue() + carry;
            carry = value / 10;
            value %= 10;
            //追加到链表尾部
            cur = new Node(value);
            pTail.setNext(cur);
            pTail = cur;
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        //处理较长的链
        Node p = p1 != null ? p1 : p2;
        while (p != null){
            value = p.getValue() + carry;
            carry = value / 10;
            value %= 10;
            cur = new Node(value);
            pTail.setNext(cur);
            pTail = cur;
            p = p.getNext();
        }
        //处理进位
        if(carry > 0){
            pTail.setNext(new Node(carry));
        }

        return sum;
    }

}
