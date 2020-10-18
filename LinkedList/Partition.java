package chapterTwo;

public class Partition {

    private Node head;

    public Partition()
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

    public Node partition(Node node, int value)
    {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd = null;

        while (node != null)
        {
            Node temp = node.next;
            node.next = null;
            if(node.data < value)
            {
                if(beforeStart == null)
                {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                }
                else
                {
                    beforeEnd.next = node;
                    beforeEnd = node;
                }
            }
            else
            {
                if(afterStart == null)
                {
                    afterStart = node;
                    afterEnd = afterStart;
                }
                else
                {
                    afterEnd.next = node;
                    afterEnd = node;
                }
            }
            node = temp;
        }

        if(beforeStart == null)
        {
            return afterStart;
        }

        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static void main(String[] args)
    {
        Partition pat = new Partition();
        pat.insertNode(3);
        pat.insertNode(5);
        pat.insertNode(8);
        pat.insertNode(5);
        pat.insertNode(10);
        pat.insertNode(2);
        pat.insertNode(1);
        Node newHead = pat.partition(pat.head, 5);
        pat.display(newHead);
    }
}
