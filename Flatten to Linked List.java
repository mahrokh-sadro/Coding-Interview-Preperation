 static void flattenList(Node node) {
        Node cur = node;

        while (cur != null) {
            if (cur.child != null) {
                Node next = cur.next;

                // Recursively flatten child list
                flattenList(cur.child);

                // Insert child between cur and next
                cur.next = cur.child;
                cur.child = null;

                // Find the end of the child list
                Node temp = cur.next;
                while (temp.next != null) temp = temp.next;

                // Connect end of child to next
                temp.next = next;
            }
            cur = cur.next;
        }
    }

//time complexity
//o(n)
//space complexity
//o(n)