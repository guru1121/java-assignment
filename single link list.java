class Main {
    public static void main(String[] args) {
        MyCustomList myList = new MyCustomList();

        myList.add(5);
        myList.print();

        myList.add(1);
        myList.print();

        myList.add(0);
        myList.print();

        myList.delete(5);
        myList.print();

        myList.delete(1);

        myList.delete(0);
        myList.print();
        myList.delete(5);

    }
}

class MyCustomList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            // list is empty
            head = newNode;

        } else {
            // list is not empty
            Node temp = head;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            // now head is the last node in the current list
            temp.nextNode = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.nextNode;
        }
        System.out.println(" ");
    }

    public void delete(int data) {
        if (head == null) {
            // list is empty
            System.out.println("list is empty, can't delete anything");
            return;
        }
        if (head.data == data) {
            // first node has data to be deleted;
            head = head.nextNode;
            System.out.println("Deleted" + " " + data);
            return;
        }
        Node temp = head;
        while (temp.nextNode != null) {
            if (temp.nextNode.data == data) {

                temp.nextNode = temp.nextNode.nextNode;
                System.out.println("Deleted" + data);
                return;
            } else {
                temp = temp.nextNode;
            }
        }
        System.out.println(data + "doesn't exist");
    }
}

class Node {
    public int data;
    public Node nextNode;

    // parameterized constructor;
    public Node(int data) {
        this.data = data;
    }
}