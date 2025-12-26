//what is a heap
//how to create a heap
//how does a heap work
//iterate,insert, delete
public class maxHeap {
    Integer[] heapArray;
    Integer capacity;
    Integer currentSize;

    public maxHeap(Integer capacity){ //1 based array
        this.capacity = capacity;
        heapArray = new Integer[capacity];
        currentSize = 1;
    }

    public void insert(Integer key){
        if(currentSize == capacity) return; // full
        heapArray[currentSize] = key;
        for(int i = (int)Math.floor(currentSize/2); i >= 1;  i--){
            maxHeapify(heapArray, i, currentSize);
        }
        currentSize++;
    }

    public void maxHeapify(Integer[] array, Integer p, Integer n){
        Integer left = 2*p;
        Integer right = 2*p +1;
        Integer smallest = p;

        if(left < n && array[left] < array[p]){
            smallest = left;
        }
        if(right < n && array[right] < array[p]){
            smallest = right;
        }
        if(smallest!=p){
            swap(array, p, smallest);
            maxHeapify(array, smallest, n);
        }
    }
    public void swap(Integer[] array, Integer a, Integer b){
        Integer temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
