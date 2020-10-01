
public class MySort implements ISort {
	
	@Override
	public void bubbleSort(int[] a) {
		for (int i = a.length-1; i > 0; i--) { // i가 하나 줄어들고 나머지 배열로 정렬함.
			for (int j = 0; j < i; j++) { //j는 수 비교하는 인덱스, 옆에 배열 수와 비교하여 j가 j+1보다 크면 스왑해줌.
				if (a[j] > a[j + 1]) {   //인접한 수 비교, j번째 수가 j 다음번째 수보다 크면j와 j+1번째 수 스왑해준다.
					swap(a, j, j + 1);
				}
			}
		}
	}

	
	@Override
	public void mergeSort(int[] a, int p, int r) {

		if (p < r) {           //p가 r보다 작으면
			int middle = (p + r) / 2; // 미들값 지정.
			mergeSort(a, p, middle);// 전반부 정렬-재귀사용
			mergeSort(a, middle + 1, r); // 후반부 정렬-재귀사용
			merge(a, p, middle, r); // 합병 정렬

		}
	}

	public void merge(int[] a, int p, int middle, int r) {
		int i = p; //전반부 정렬의 인덱스
		int j = middle + 1;// 후반부 정렬 인덱스
		int k = p;// 새로 만든 배열 첫번째 인덱스
		int[] sorted = new int[a.length]; // 원래 있던 배열과 같은 크기에 새 배열 sorted 생성.

		while ((i <= middle) && (j <= r)) { // i가 middle 보다 작거나 같고, j가r보다 작거나 같을 때
			if (a[i] < a[j]) {        //i번째 수가 j 인덱스가 가리키는 수보다 작을 때 
				sorted[k] = a[i];         // 새 배열sorted에 k인덱스 자리에 정렬됨. 
				k++;                      //삽입되므로 k인덱스, 비교하는 i인덱스 둘 다 증가.
				i++;
			} else {
				sorted[k] = a[j];          //j인덱스가 가리키는 수가 작으면 그 수가 새 배열sorted에 k인덱스 자리에 정렬됨.
				k++;                       //삽입되므로 k인덱스, 비교하는 i인덱스 둘 다 증가.
				j++;
			}

		}
		while (i <= middle) {                 //i가미들값보다 작거나 같으면 
			sorted[k] = a[i];
			k++;
			i++;
		}

		while (j <= r) {
			sorted[k] = a[j];
			k++;
			j++;
		}

		for (int index = p; index <= r; index++) {                //후반부정렬 r의 인덱스 까지 반복하여 a 배열 값 sorted 배열로 정렬.
			a[index] = sorted[index];
		}
	}

	@Override
	public void quickSort(int[] a, int p, int r) {  

		if (p < r) {
			int newPivot = partition(a, p, r);// 파티션 사용.
			quickSort(a, p, newPivot - 1);// 재귀사용하여 왼쪽부분 정렬
			quickSort(a, newPivot + 1, r);// 재귀사용하여 오른쪽 부분 정렬

		}

	}

	public int partition(int[] a, int p, int r) { 
		int pivot = a[(p + r) / 2];        //피봇 기준점 만듦.

		while (p < r) {                           
			while ((a[p] < pivot) && (p < r)) {       //피봇보다 작을 때
				p++;
			}
			while ((a[r] > pivot) && (p < r)) {        //r이 피봇보다 클 때
				r--;
			}
			if (p < r) {
				swap(a, p, r);
				p++;
				r--;
			}
		}
		return p;
	}

	@Override
	public void heapSort(int[] a) {
		// 힙 생성
		heapify(a, a.length);
       // printAll(a);//힙정렬 과정 보기 위해 만듦.

		// 힙 정렬(반복)
		for (int i = a.length - 1; i > 0; i--) {
			swap(a, 0, i); // root와 마지막 leaf 교체.
		    //System.out.println("");//
			//printAll(a);//
			heapify(a, i); // 힙 생성
			//printAll(a);//
		}
	}

	private void heapify(int[] a, int length) {
		for (int i = 1; i < length; i++) { //최대 힙 기준 
			int child = i; //자식노드
			while (child > 0) {
				int parent = (child - 1) / 2; // index 부모가있는 인덱스 찾아줌.
				if (a[child] > a[parent])  //자식노드가 부모노드보다 크면 자식이랑, 부모노드랑 스왑;
					swap(a, child, parent);
				child = parent;  
				//자식이 부모가 됨.
			}
		}

	}

	@Override
	public void swap(int[] a, int i, int j) {
		int temp = a[i];         // 임시로  temp 생성
		a[i] = a[j];             //a배열의 i번째와 j번째 교환. 
		a[j] = temp;            //j번째가 temp로 됨.
	}

	@Override
	public void printAll(int[] a) {
		System.out.print("A=[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println("]");
	}

}
