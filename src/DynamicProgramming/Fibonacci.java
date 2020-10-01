package DynamicProgramming;

public class Fibonacci {
	
	public static int Rcounter=0; 
	public static int DPCounter=0;
	public Fibonacci(){
		
	}
	
	public int Fib(int n) {
		Rcounter++;
		if(n==1 || n==2)
			return 1;
		return Fib(n-1)+Fib(n-2);
	}//재귀중복된 함수
	public int DpFib(int n) { //동적프로그래밍 함
		int[] data=new int[n];
		data[0]=1;
		data[1]=1;
		
		for(int i=2; i<n; i++) {
			DPCounter++;
			data[i] =data[i-1]+data[i-2];
		}
		return data[n-1];//마지막번째 데이터 출력
	}
	
	
	}
	
