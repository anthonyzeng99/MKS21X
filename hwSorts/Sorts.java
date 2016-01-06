public class Sorts{


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


    public static void selectionSort(int[] data) {
	int minIndex;
	int swap;
	minIndex = 0;
	for (int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
	    minIndex = sortedIndex;
	    for (int index = sortedIndex + 1; index< data.length; index++) {
		if (data[index] < data[minIndex]) {
		    minIndex = index;
		}
	    }
	    swap = data[minIndex];
	    data[minIndex] = data[sortedIndex];
	    data[sortedIndex] = swap;
	} 
    }

    
    public static void main(String[] args) {
	int[] a1 = {8,6,7,5,3,0,9};
	Sorts.printArray(a1);
	Sorts.insertionSort(a1);
	Sorts.printArray(a1);
	int[] a2 = {8,6,7,5,3,0,9};
	Sorts.printArray(a2);
	Sorts.selectionSort(a2);
	Sorts.printArray(a2);
    }


}
