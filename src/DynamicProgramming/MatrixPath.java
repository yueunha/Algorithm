package DynamicProgramming;

public class MatrixPath {
   int[][] m= {{0,0,0,0,0},
		   	   {0,6,7,12,5},
		       {0,5,3,11,18},
		       {0,7,17,3,3},
		       {0,8,10,14,9}};

   public static int Rcounter=0;
   public static int DPcounter=0;
   final static int SIZE = 5;
   
   public MatrixPath() {
	   
   }
   
   public int rPath(int i, int j){    //재귀
	   Rcounter++;
	  if(i==0 &&  j==0)//위에가 없는 경우 if(i==0||j==0)
		return 0; 
	  else if(i==0 && j!=0)//행만 0인 경우
		return 0;
	  else if(i!=0 && j==0)//열만 0인 경우
	    return 0;
	  
	  return m[i][j]+max(rPath(i-1,j),rPath(i,j-1),rPath(i-1,j-1));  //오른쪽과 대각선 위 비교해서 큰수와 m에 i,j번째 수 합한 값 출력.
   }  
   
   public int DPPath(int x,int y) {
	   int[][] c= new int[SIZE][SIZE];//똑같은 2차원 배열만들어서 계산한 결과 집어넣음.   	
	   c[1][1] = m[1][1];
	   for(int i=1; i<SIZE; i++) {
		   for(int j=1; j<SIZE; j++) {
			   DPcounter++;
			   c[i][j]=m[i][j]+ max(c[i-1][j],c[i][j-1],c[i-1][j-1]);
		   }
	   }
	   
	   return c[x][y];
   } 
   public int max(int a, int b, int c) {
	   if(a>b && a>c)
		return a;     
	else if(b>a && b>c)
		return b;	    
	else return c; 
    }
  
}

