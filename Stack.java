public class Stack<E>
{
    public Node head, tail;

    public Stack() //constructor method
    {
        head = null;
        tail = null;
    }

    //method to count the size of the stack
    public int size()
    {
        int stackSize = 0; //integer to keep count of stack size
        Node counter = head; //Node to loop through the stack
        while(counter != null) //while loop to loop through the entire stack
        {
            counter = counter.next; //moves counter one element through the stack
            stackSize++; //increments stackSize by one ever single time counter moves forward
        }
        return stackSize; //returns stackSize after incrementing for each element in the stack
    }

    //method to push an element onto the stack
    public void push(E element)
    {
        if(tail == null) //empty stack case
        {
            head = tail = new Node(element);
        }
        else
        {
            tail.next = new Node(element); //link new node as last node
            tail = tail.next; //make tail pointer point to last node
        }
    }

    //method to remove the top element of the stack
    public void pop()
    {
        if(size() == 1) //one element stack case
        {
            head = tail = null;
        }
        else
        {
            Node current = head; //set node current to the head
            for(int i = 0; i < size() - 2; i++) //traverse the stack until current is at the second to last node
            {
                current = current.next; //moves current through the stack
            }
            tail = current; //set tail to be current
            tail.next = null; //set the tails pointer to be null, deleting top element of the stack
        }
    }

    //returns the data at the top of the stack
    public E top()
    {
        return tail.data;
    }

    //returns true if the stack is empty, false otherwise
    public boolean isEmpty()
    {
        return size() == 0;
    }

    //prints content of the stack
    public void printStack()
    {
        Node temp; //creates Node temp
        temp = head; //sets temp to head
        while (temp != null) //loops through the entire stack until it reaches the ends
        {
            System.out.print(temp.data + "   "); //prints the data at that node
            temp = temp.next; //advances temp one node through the list
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private E data; //data field
        private Node next; //link field

        public Node(E item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}
