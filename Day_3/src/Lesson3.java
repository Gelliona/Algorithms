public class Lesson3 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.getFirst());
        System.out.println(myLinkedList.popLast());
        System.out.println(myLinkedList);

        //Игорь, есть вопрос. Метод contains почему-то работает у меня только с целыми числами и перестаёт работать,
        // если заполнить список десятичными числами и искать тоже десятичное число. Не могу найти, в чём ошибка.
        System.out.println(myLinkedList.contains(3));
    }

}
