
public class MySortTest {

	public static void main(String[] args) {
		int[] a= {15, 30,27, 39, 28, 12};

		MySort t=new MySort();
		t.printAll(a);
		
	/*
		t.bubbleSort(a);
		t.printAll(a);

		
		t.mergeSort(a, 0, a.length-1);
		t.printAll(a);
		
		
		t.quickSort(a, 0, a.length-1);
		t.printAll(a);
		
		*/
		t.heapSort(a);
		t.printAll(a);
	   
	}

}
