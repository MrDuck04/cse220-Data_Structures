public class maxHeap {
    Integer[] heapArray;
    Integer capacity;
    Integer currentSize;

    public maxHeap(Integer capacity){ //1 based array
        this.capacity = capacity;
        heapArray = new Integer[capacity + 1];
        currentSize = 1;
    }

    public void insert(Integer key){
        if(currentSize > capacity) return; // full
        heapArray[currentSize] = key;
        bubbleUp(currentSize);
        currentSize++;
    }

    public void bubbleUp(Integer i){
        while(i > 1){
            Integer parent = i / 2;
            if(heapArray[i] != null && heapArray[parent] != null && heapArray[i] > heapArray[parent]){
                swap(heapArray, i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    public void maxHeapify(Integer[] array, Integer p, Integer n){
        Integer left = 2*p;
        Integer right = 2*p +1;
        Integer largest = p;

        if(left <= n && array[left] != null && array[largest] != null && array[left] > array[largest]){
            largest = left;
        }
        if(right <= n && array[right] != null && array[largest] != null && array[right] > array[largest]){
            largest = right;
        }
        if(largest != p){
            swap(array, p, largest);
            maxHeapify(array, largest, n);
        }
    }
    public void swap(Integer[] array, Integer a, Integer b){
        Integer temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
