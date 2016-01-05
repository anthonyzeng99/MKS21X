public class Sorts2 {


    public static void printArray(int[] data) {
	String output = "";
	for (int i = 0; i < data.length; i++) {
	    if (i == 0) {
		output += "[" + data[i] + ",";
	    } else {
		output += data[i] + ",";
	    }
	}
	System.out.println(output + "]");
    }


    public static void fillRandom(int[] data) {
	for(int i = 0; i < data.length; i++) {
	    data[i] = (int)(Math.random()*Integer.MAX_VALUE);
	}
    }


    public static void insertionSort(int[] data) {
	for (int i = 0; i < data.length; i++) {
	    for (int j = 0; j < data.length - 1; j++) {
		if(data[j] >= data[j + 1]) {
		    int k = data[j];
		    data[j] = data[j + 1];
		    data[j + 1] = k;
		}	      
	    }
	}
    }

    
    public static void main(String[] args) {
	int[] a1 = {8,6,7,5,3,0,9};
	Sorts.printArray(a1);
	Sorts.insertionSort(a1);
	Sorts.printArray(a1);
    }


}
