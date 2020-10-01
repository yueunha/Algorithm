package DynamicProgramming;

public class MatrixpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixPath mp=new MatrixPath();
		System.out.println(mp.rPath(2,3));
		System.out.println(mp.Rcounter);
		
		System.out.println();
		
		System.out.println(mp.DPPath(3,3));
		System.out.println(mp.DPcounter);
	}

}
