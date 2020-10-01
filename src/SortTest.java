
public class SortTest {
     public static void main(String[] args) {
    	 int[]a= {29,10,14,37,13};
    	 
    	 Sort s=new Sort();
    	 s.printArray(a);
    	 /*
    	 s.selectionSort(a);
    	 s.printArray(a);
    	 */
    	 
    	 s.mergeSort(a, 0, a.length-1);
    	 s.printArray(a);
     }
}
