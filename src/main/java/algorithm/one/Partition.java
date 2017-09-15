package algorithm.one;

/**
 * 链表划分
 * 排序链表按一个值x划分两部分，小于x在左边，另外的在右边节点顺序按原有顺序
 */
public class Partition {

    public static void main(String[] args){
        Node pHead = Node.createLink(10);
        Node leftLinked = new Node(0);
        Node rightLinked = new Node(0);
        Node left = leftLinked;
        Node right = rightLinked;
        Node pNode = pHead.getNext();
        Node.printLinked(pHead.getNext());
        int pivotKye = 5;
        while (pNode != null){
            if(pNode.getValue() < pivotKye){
                left.setNext(pNode);
                left = pNode;
            }else{
                right.setNext(pNode);
                right = pNode;
            }
            pNode = pNode.getNext();
        }
        left.setNext(rightLinked.getNext());
        pHead.setNext(leftLinked.getNext());
        Node.printLinked(pHead.getNext());
    }
}
