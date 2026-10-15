package LinkedList;

class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

public class LC_707_DesignLinkedList {
    node head;
    node tail;

    public LC_707_DesignLinkedList() {

    }

    public int get(int index) {
        if (index < 0 || index > 1000) return -1;

        node temp = head;
        int i = 0;

        while (temp != null) {
            if (i == index) return temp.val;
            temp = temp.next;
            i++;
        }

        return -1;
    }

    public void addAtHead(int val) {
        node temp = new node(val);

        if (head == null) {
            head = tail = temp;
            return;
        }

        temp.next = head;
        head = temp;
    }

    public void addAtTail(int val) {
        node temp = new node(val);

        if (head == null) {
            head = tail = temp;
            return;
        }

        tail.next = temp;
        tail = temp;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        node curr = head;
        int i = 0;

        while (curr != null) {
            if (i == index - 1) {
                node temp = new node(val);
                temp.next = curr.next;
                curr.next = temp;

                if (temp.next == null) {
                    tail = temp;
                }

                return;
            }

            curr = curr.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || head == null) return;

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            return;
        }

        node temp = head;
        int i = 0;

        while (temp != null) {
            if (i == index - 1) {
                if (temp.next == null) return;

                if (temp.next == tail) {
                    tail = temp;
                }

                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
            i++;
        }
    }
}