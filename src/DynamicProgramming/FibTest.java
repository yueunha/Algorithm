package DynamicProgramming;

public class FibTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fb=new Fibonacci();
		
		System.out.println(fb.Fib(30));
		System.out.print(fb.Rcounter); //재귀호출된 수 알아보기.데이터가 조금만많아져도 속도 엄청 느려짐.

		System.out.println();
		
		System.out.println(fb.DpFib(45));
		System.out.print(fb.DPCounter); 
	
	
	}

}
