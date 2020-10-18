package chapterTwo;

public class SumLists {

    private Node head;

    public SumLists()
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

    public Node addLists(Node l1, Node l2)
    {
        if(l1 == null) { return l2; }
        if(l2 == null) { return l1; }

        Node head = new Node(0);
        Node answer = head;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0)
        {
            if(l1 != null)
            {
                carry += l1.data;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                carry += l2.data;
                l2 = l2.next;
            }

            answer.next = new Node(carry % 10);
            answer = answer.next;
            carry = carry/10;
        }

        return head.next;

    }

    public static void main(String[] args)
    {
        SumLists sls1 = new SumLists();
        SumLists sls2 = new SumLists();
        sls1.insertNode(7);
        sls1.insertNode(1);
        sls1.insertNode(6);
        sls2.insertNode(5);
        sls2.insertNode(9);
        sls2.insertNode(2);
        sls2.insertNode(4);
        sls2.insertNode(6);
        Node answerHead = sls1.addLists(sls1.head, sls2.head);
        sls1.display(answerHead);

    }
}
