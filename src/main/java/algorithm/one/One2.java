package algorithm.one;

/**
 * 链表翻转
 */
public class One2 {
    public static void main (String [] args){
        Node pHead = Node.createLink(10);
        Node.printLinked(pHead);
        reverse(pHead, 4, 8);
        Node.printLinked(pHead);
    }

    public static void reverse(Node pHead1, int from, int to){
        Node pCur = pHead1.getNext();
        Node pHead = pHead1;
        int i;
        for (i = 0; i < from - 1; i++){
            pHead = pCur;
            pCur = pCur.getNext();
        }

        Node pre = pCur;
        pCur = pCur.getNext();
        Node pNext;
        for (; i < to -1; i++){
            pNext = pCur.getNext();
            pCur.setNext(pHead.getNext());
            pHead.setNext(pCur);
            pre.setNext(pNext); // pHead1 pHead pre pCur 指向同一节点 pNext添加到后面
            pCur = pNext;
        }
    }
}
