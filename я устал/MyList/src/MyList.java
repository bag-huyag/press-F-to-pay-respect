import java.util.Random;

public class MyList {

// убрать ласт, оставить хед
    private Node head;

    private class Node
    {
        private  int val;
        private Node next;
        private Node (int v, Node n)
        {
            val=v;
            next=n;
        }
    }

    public MyList ()
    {
        head=null;
    }
    public void  add(int val)
    {
       if (head == null){
           head = new Node(val, null);
       }
       else{
           Node now = head;
           while (now.next != null){
               now = now.next;
           }
           now.next = new Node(val, null);
       }

    }
    public void init(int d)
    {
        Random obj = new Random();
        int i, k;
        for(i=0; i<d; i++)
        {
            k=obj.nextInt()%27;
            add(k);
        }
    }
    public void del(Node k)
    {   Node d;
        d=k.next;
        k.next=d.next;
    }

    public void perevorot(){
        if (head == null) return;
        Node cur = head;
        Node now;
        if (head.next != null) now = head.next;
        else return;
        cur.next = null;


        while (now != null) {
            Node backup = now.next;
            now.next = cur;
            cur = now;
            now = backup;
        }

        head = cur;
    }

    public void Pair()
    {
        Node p=head;
        while (p!=null)
        {
            find(p);
            p=p.next;
        }
    }
    public void find(Node p)
    {
        Node n=p.next, t=p;
        while (n!=null)
        {
            if (p.val==n.val)
            {
                del(t);
                n=n.next;
            }
            else
            {
                n=n.next;
                t=t.next;
            }
        }
    }
    public void print()
    {
        Node h=head;
        while (h!=null)
        {
            System.out.print(h.val+"  ");
            h=h.next;
        }
        System.out.println();
    }

    public int length(){
        int n = 0 ;
        Node now = head;
        while (now != null){
            now = now.next;
            n++;
        }
        return n;
    }
}
