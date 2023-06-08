public class MyLinkedList<T> {

    private Node head;


    private class Node <T>{
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(T value) {
        Node<T> lastNode = findLast();
        if (lastNode == null) {
            head = new Node(value);
        } else {
            lastNode.next = new Node(value);
        }
    }

    public T getFirst() {
        return get(0);
    }
    public T get(int index){
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException(index);
        }
        Node<T> currentNode = head;
        int currentIndex = 0;
        while (currentNode != null) {
            if (currentIndex == index){
                return currentNode.value;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public T popFirst() {
        return pop(0);
    }

    public T pop(int index) {
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        } else if (index < 0) {
            throw new IndexOutOfBoundsException(index);
        }

        if(index == 0) {
            T pop = (T) head.value;
            head = head.next;
            return pop;
        }

        Node<T> currentNode = head;
        int currentIndex = 1;
        while (currentNode.next != null) {
            if (currentIndex == index){
                T pop = currentNode.next.value;
                currentNode.next = currentNode.next.next;
                return pop;
            }
            currentNode = currentNode.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException(index);
    }

    public T popLast() {
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        }

        Node<T> currentNode = head;
        while (currentNode.next.next != null) {
           currentNode = currentNode.next;
        }
        currentNode.next = null;
        return currentNode.value;
    }

    private Node<T> findLast() {
        if (head == null) {
            return null;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node<T> currentNode = head;
        int listSize = 1;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            listSize++;
        }
        return listSize;
    }

    public boolean contains(T value) {
        if (head == null) {
            throw new IllegalStateException("Список пустой");
        }
        Node<T> currentNode = head;
        boolean flag = false;
        while (currentNode != null) {
            if (currentNode.value == value){
                flag = true;
            }
            currentNode = currentNode.next;
        }
        return flag;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[ ");
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            result.append(currentNode.value).append(" -> ");
            currentNode = currentNode.next;
        }
        result.append(currentNode.value).append(" ]");
        return result.toString();
    }
}

