import junit.framework.*;

public class Test extends TestCase {
	int index ;
	
	double[][][] testcase;
	QuickSort Q;
	
	public void setUp() {
		Q = new QuickSort();
		testcase = new double[][][]{
									{{},{}}, // test empty set 
								  	{{1.0},{1.0}}, // test single element set 
								  	{{1.0,1.1,2.0,2.1,10.10,100},{1.0,1.1,2.0,2.1,10.10,100}},//test set with incremental order  
								  	{{100,10.10,2.1,2.0,1.1,1.0},{1.0,1.1,2.0,2.1,10.10,100}}, //test set with decremental order
								  	{{2.0,2.1,1.1,10.10,100,1.0},{1.0,1.1,2.0,2.1,10.10,100}}, //test set with random order
								  	{{2.0,2.1,1.1,10.10,100},{1.1,2.0,2.1,10.10,100}}, //test set with odd number of elements 
								  	{{1,2,3,4},{4,3,2,1}}, //test set with all integer value 
								  	{{2,2,2},{2,2,2}} //test set with negative
								  };
		
		
		

	}
	
	private void assertArraysEquals(double[][][] testcase2, double[][][] testcase3) {
		
		for(int i = 0,j = 0;i < testcase[index][0].length && j < testcase[index][1].length;i++,j++)
			assertEquals(testcase[index][0][i],testcase[index][1][j]);
	}
	
public void test(){
		
		Q.sort(testcase[1][0]);

		index = 0;
		
			assertArraysEquals(testcase,testcase);
			
				
	}
	
	public void test1(){
		
		Q.sort(testcase[1][0]);

		index = 1;
		
			assertArraysEquals(testcase,testcase);
			
				
	}
	
	



	public void test2() {
		
		Q.sort(testcase[2][0]);

		index = 2;
		
		assertArraysEquals(testcase,testcase);
		
				
	}
	
	public void test3() {
		
		Q.sort(testcase[3][0]);

		
        index = 3;
		
		assertArraysEquals(testcase,testcase);
		
	}
	
	public void test4() {
		
		Q.sort(testcase[4][0]);

		
		index = 4;
		
		assertArraysEquals(testcase,testcase);
		
				
	}
	
	public void test5() {
		
		Q.sort(testcase[5][0]);

		
		index = 5;
		
		assertArraysEquals(testcase,testcase);
		
				
	}
	
	public void test6() {
		
		Q.sort(testcase[6][0]);

		
		index = 6;
		
		assertArraysEquals(testcase,testcase);
		
				
	}
	
	public void test7() {
		
		Q.sort(testcase[7][0]);

		
    index = 7;
		
		assertArraysEquals(testcase,testcase);
		
				
	}
}
