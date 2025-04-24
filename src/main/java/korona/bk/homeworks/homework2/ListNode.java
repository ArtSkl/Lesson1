package korona.bk.homeworks.homework2;

/**
 * Реализовать класс с названием ListNode, который позволяет реализовать логику односвязного списка целых чисел.
 * Внутри класса должно содержаться целочисленное значение текущего элемента списка и ссылка на следующий элемент
 * списка.
 * Создать новую ноду можно пустую, или с указанием целочисленного значения в ноде, или с указанием целочисленного
 * значения в ноде + ссылка наследующую ноду.
 * В мейн классе заиспользовать этот класс ListNode - создать связный список из 5 элементов и вывести его в консоль.
 **/

public class ListNode {
    private int currentValue;
    private ListNode next;

    public ListNode(int currentValue) {
        this.currentValue = currentValue;
    }

    public void add(int newValue) {
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(newValue);
    }

    public void printList(){
        ListNode current = this;
        while (current.next != null) {
            System.out.println(current.currentValue);
            current = current.next;
                        }
        System.out.println(current.currentValue);

    }
}
