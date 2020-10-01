package DynamicProgramming;

public class PebbleGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] pattern= {
				{1,2},
				{0,2,3},
				{0,1},
				{1}
		};
		
		int[][] data= {
				{6,7,12,15,5,3,11,3},
				{-8,10,14,9,7,13,8,5},
				{11,12,7,4,8,-2,9,4}
		};
		
        PebbleGame pg=new PebbleGame(data,pattern);
        System.out.println(pg.pebble());
        pg.printArray(pg.getPeb());
	}

}
