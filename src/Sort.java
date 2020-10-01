
public class Sort {

	public void selectionSort(int[] a) {
		
		int i,j, maxNum, maxIndex;
		
		for(i=a.length-1; i>=0; i--) {
			maxNum = a[i];//실제 값//
			maxIndex=i;//index//
			for(j=0; j<i; j++) { 
				if(a[j]>maxNum) {
					maxNum= a[j];
					maxIndex=j;
				}
			} //maxNum값 구하기 위해 i와j 비교해서 최대큰 원소 구함.//
		
			if(a[i]<maxNum) //maxNum보다 a[i]가 작으면 교체//
				swap(a, maxIndex, i);
		}
		
		
	}
	//merge Sort
	
	public void mergeSort(int[] a, int p, int r){
		if(p<r) {
			int middle=(p+r)/2; //미들값 지정.
		    mergeSort(a,p,middle);//전반부 정렬
		    mergeSort(a,middle+1,r); //후반부 정렬
		    merge(a,p, middle, r); //합병 정렬
			
		}
	}
	
	
	public void merge(int[]a, int p, int middle, int r) {
		int i=p;
		int j=middle+1;//후반부 정렬 인덱스
		int k=p;//새로 만든 배열 첫번째 인덱스
		int[] sorted =new int[a.length];
		
		while(i<=middle&&(j<=r)) {  //i는 중앙값보다 작거나 같고 j는 r보다 작거나 같을 때
	    if(a[i]<a[j]) {
	    	sorted[k]=a[i];
	    	k++;
	    	i++;
	    } else {
	    	sorted[k]=a[j];
	    	k++;
	    	i++;
	    }
		
	 }		
	    while(i<=middle) {
	    	sorted[k] = a[i];
	    	k++;
	    	i++;
	    }
	    
	    while(j<=r) {
	    	sorted[k]= a[j];
	    	k++;
	    	i++;
	    }
	    
	    
	    for(int index = p; index<=r; index++) {
	    	a[index]= sorted[index];
	    }
		
  }
	
	
	
	
	
     public void swap(int[]a, int i, int j) {
    	 int temp =a[i];//swap하기 위해 만든 임시 데이터//
    	 a[i]= a[j];
    	 a[j]= temp;

     }
     
    public void printArray(int[] a) {
    	 System.out.println("A=[");
    	for(int i=0; i<a.length; i++) {
    		System.out.print(a[i]+",");
    	}
          System.out.println("]");
    }

}
