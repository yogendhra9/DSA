package LinkedList.singly;

public class Linked_list {
        private Node head;
        private Node tail;
        private int size;
        public Linked_list()
        {
            this.size=0;
        }
        public void insert_first(int val)
        {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if(tail == null)
            {
                tail = head;
            }
            size++;
        }
        public void insert_last(int val)
        {

            if(tail == null)
            {
                insert_first(val);
            }
            else {
                Node node = new Node(val);
                tail.next = node;
               tail = node;
                size++;
            }
        }
        public void insertion_at_index(int index,int val)
        {
            if(index == 0)
            {
                insert_first(val);
            }
            if(index == size)
            {
                insert_last(val);
            }
            else {
                Node before = head;
                Node after = head.next;
                Node node = new Node(val);
                int pos = 1;
                while(pos!=index)
                {
                   before  = before.next;
                   after = after.next;
                    pos=pos+1;
                }
                before.next = node;
                node.next = after;
                size++;
                // another approach would be like passing the before.next value in the constructor of the newly created node.
                // Node node  = new Node(val,before.next);
            }

        }
        public void insert_without_tail(int val)
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            Node node = new Node(val);
            temp.next = node;

        }
        public void delete_first()
        {
            if(size ==1)
            {
                head = head.next;
                tail = tail.next;
            }
            head = head.next;
            size--;
        }
        public void  delete_last()
        {
              if(size<=1)
              {
                  delete_first();
              }
              Node second_last = get(size-2);
              tail = second_last;
              second_last.next = null;
        }
        public int delete_at_index(int index)
        {
            Node prev = get(index-1);
            int val = prev.next.value;
            prev.next = prev.next.next;
            return val;
        }
        public Node get(int index)
        {
            Node node = head;
            int pos =0;
            while(pos!=index)
            {
                node = node.next;
                pos++;
            }
            return node;
        }
        public Node find(int value)
        {
            Node temp = head;
            while(temp!=null) {
                if (temp.value == value)
                    return temp;
                temp =temp.next;
            }
            return null;

        }

    public void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");

    }


        private class Node
        {
            private int value;
            private Node next;
            public Node(int value)
            {
                this.value = value;
            }
            public Node(int value, Node next)
            {
                this.value = value;
                this.next = next;
            }
        }
    }


