package DynamicProgramming;

public class PebbleGame {
 private int[][] data;
 private int[][] pattern= {
		    {1,2},//패턴0은 패턴 1,2 올수 있음.
			{0,2,3},//패턴 1은 패턴0,2,3 올 수 있음.
			{0,1}, //패턴2는 패턴 0,1 	올 수 있음.
			{1} //패턴 3은 패턴 1올 수있음.
			};
 
 private int[][] peb;
 
 
 public PebbleGame(int[][] data,int [][] pattern) {
	 this.data=data;
	 this.pattern=pattern;
 }
 
 public int pebble() {
	 
	 peb=new int[pattern.length][data[0].length]; //새로운 동적 프로그래밍 공간;열의 길이를 알아내기 위해 data[0].length함.
	 
	 for(int p=0; p<pattern.length; p++) { // 패턴 값 돌아가면서 첫번째 값 삽입. 
		  peb[p][0] = w(0,p);//직관적으로 구성함.
		  
	 }
	 
	 int tempC=0;
	 int maxC=0;
	 
	 
	 for(int col=1; col<data[0].length; col++) {  //열 
		 maxC=Integer.MIN_VALUE;
		 
		 for(int p=0; p<pattern.length; p++) {     //패턴(횡적인 면)
			 int[] q = pattern[p];
			  tempC= MAX(peb, col-1, q)+w(col,p);//기록 만들어냄.(최대값 반환하게 함.)
			  peb[p][col]=tempC;      //열중에서 가장 큰 값고르는 거.
			  if(tempC> maxC) {
				  maxC=tempC;
			  }
		 }
	 }	 
	 return maxC; //최대값 리턴 
 }
 
   public int MAX(int[][]peb,int col, int[] q){
	   int max=Integer.MIN_VALUE; //max 0으로 설정하면 결과 값0보다 작은 값 나올 때 에러 발생하므로 인테저에서가장작은 값 반환하도록 설정. 
	   int tempMax =0;
	   
	   for(int i=0; i<q.length; i++) {
		   int index=q[i];   
		   tempMax=peb[index][col];//peb에 인덱스 접근.
		   if(tempMax>max) {
			   max=tempMax;
		   }
	   }
	   return max;
   }
   private int w(int col,int p) { //-i와 패턴(4가지)을 알려주면 값을 찾아서 알려줌.
	   int value=0; //리턴 될 
	  switch(p) {
	  case 0:
		  value=data[0][col];
		  break;
	  case 1:
		  value=data[1][col];
		  break;
	  case 2:
		  value=data[2][col];
		  break;
	  case 3:	  
		  value=data[0][col]+data[2][col];
		  break;
	  }
	   return value;
   }
   
   public int[][] getPeb(){
	   return peb;
   }
   
   public void printArray(int[][] a) {
       for(int i=0; i<a.length; i++) {
    	   for(int j=0; j<a[0].length; j++) {
    		   System.out.println(a[i][j]+" ");
    	   }
    	   System.out.println();
       }	   
   }
}
