// EZEMA ERNEST IKECHUKWU
// VUG/SEN/24/11480
//  BinaryConverter
public class BinaryConverter {

    // Node class
    static class ListNode {
        int val;
        ListNode next;

        // Default constructor
        ListNode() {
        }

        // Constructor with a value
        ListNode(int val) {
            this.val = val;
        }

        // Constructor with a value and next node
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Method to convert binary to decimal
    public int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {

        BinaryConverter solution = new BinaryConverter();

        // Creating the linked list representing 101
        ListNode head = new ListNode(
            1,
            new ListNode(
                0,
                new ListNode(1)
            )
        );

        int result = solution.getDecimalValue(head);

        System.out.println("Decimal value: " + result);
    }
}