package algorithm.one;

/**
 * 排序链表去重
 */
public class Duplicate {

    public static void main(String[] args){
        int[] items = new int[]{2, 3, 3, 5, 7, 8, 8, 8, 9, 9, 10, 10};
        Node pHead = Node.createLink(items);
        Node.printLinked(pHead);
        //Duplicate.duplicate1(pHead);
        Duplicate.duplicate2(pHead);
        Node.printLinked(pHead);
    }

    //去重
    public static void duplicate1(Node pHead){
        Node pNode = pHead.getNext();
        Node pCurrent;
        while (pNode != null){
            pCurrent = pNode.getNext();
            if(pCurrent != null && (pCurrent.getValue() == pNode.getValue())){
                pNode.setNext(pCurrent.getNext());
            }else{
                pNode = pCurrent;
            }
        }
    }

    //重复的全部删除
    public static void duplicate2(Node pHead){
        Node pPer = pHead;
        Node pCur = pPer.getNext();
        Node pNext;

        while (pCur != null){
            pNext = pCur.getNext();
            boolean pDup = false;
            //循环和下一位比较
            while (pNext != null && (pNext.getValue() == pCur.getValue())){
                pPer.setNext(pNext);//删除pCur节点
                pCur = pNext;//指向下一节点
                pNext = pCur.getNext();
                pDup = true;
            }
            if(pDup){
                pPer.setNext(pNext);//与原value相等删除
            }else{
                pPer = pCur;
            }
            pCur = pNext;
        }
    }
}
