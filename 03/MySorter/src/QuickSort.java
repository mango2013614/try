public class QuickSort {
	private double[] numbers;
    private int number;

    public void sort(double[] values) {
    	
          
            if (values ==null || values.length==0){
         
            }
             this.numbers = values;
             number = values.length;
             quicksort(0, number - 1);
    }

    private void quicksort(int low, int high) {
            int i = low, j = high;
            
            double pivot = numbers[low + (high-low)/2];

         
            while (i <= j) {
                   
                    while (numbers[i] > pivot) {	//Bug
                            i++;
                    }
                  
                    while (numbers[j] < pivot) {	//Bug
                            j--;
                    }

                    
                    if (i <= j) {
                            exchange(i, j);
                            i++;
                            j--;
                    }
            }
            // Recursion
            if (low < j)
                    quicksort(low, j);
            if (i < high)
                    quicksort(i, high);
    }

    private void exchange(int i, int j) {
    		double temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
    }
}
