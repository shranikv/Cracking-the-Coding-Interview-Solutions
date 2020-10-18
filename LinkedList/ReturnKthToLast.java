package chapterTwo;

public class ReturnKthToLast {

    private Node head;

    public ReturnKthToLast()
    {
        head = null;
    }

    public static class Node {
        Node next;
        int data;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void insertNode(int data)
    {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void display(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static class IndexOfNode {
        public int index = 0;
    }

    public Node returnKth(Node head, int k)
    {
        IndexOfNode indexObject = new IndexOfNode();
        return returnKth(head, k, indexObject);
    }

    public Node returnKth(Node head, int k, IndexOfNode indexOfNode)
    {
        if(head == null)
        {
            return null;
        }
        Node node = returnKth(head.next, k, indexOfNode);
        indexOfNode.index = indexOfNode.index + 1;
        if(indexOfNode.index == k)
        {
            return head;
        }
        return node;
    }

    public Node getKthIterative(Node head, int k)
    {
        Node p1 = head;
        Node p2 = head;

        for(int i = 0; i < k; i++)
        {
            if(p2 == null)
            {
                return null;
            }
            p2 = p2.next;
        }
        while(p2 != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args)
    {
        ReturnKthToLast rk = new ReturnKthToLast();
        rk.insertNode(1);
        rk.insertNode(2);
        rk.insertNode(3);
        rk.insertNode(2);
        rk.insertNode(5);
        rk.insertNode(6);
        System.out.println(rk.returnKth(rk.head, 3).data);
        System.out.println(rk.getKthIterative(rk.head, 3).data);
    }
}
