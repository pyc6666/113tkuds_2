
        int[] values = {40, 30, 15, 20, 10};
        for (int value : values) {
            minHeap.insert(value);
            System.out.println("插入 " + value + " 後: " + minHeap.heap);
        }
        