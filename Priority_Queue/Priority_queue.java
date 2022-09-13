package DSA.Priority_Queue;

import java.util.ArrayList;

public class Priority_queue {
    private ArrayList<Integer> heap;

    Priority_queue() {
        heap = new ArrayList<>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int size() {
        return heap.size();
    }

    // Assume an Array List
    // 5 | 10 | 8 | 15 | 20 | 35 |
    int getMin() throws Priority_queue_Excception {
        if (isEmpty()) {
            // Throw an exception
            throw new Priority_queue_Excception();
        }
        return heap.get(0);
    }

    // 5 | 10 | 8 | 15 | 20 | 35 |
    void insert(int element) {
        heap.add(element);
        // element goes to the end array list
        // now Up heapify function will work..
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }

    }

    int removeMin() throws Priority_queue_Excception {
        if (isEmpty()) {
            throw new Priority_queue_Excception();
        }
        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 0;
        int minIndex = index;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        while (leftChildIndex < heap.size()) {

            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < minIndex) {
                minIndex = rightChildIndex;
            }
            if (minIndex == index) {
                break;
            } else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            }
        }
        return temp;
    }
}
