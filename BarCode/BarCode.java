public class BarCode implements Comparable {

    private int _checkDigit;
    private String _zip;
    private static  String[] BARCODES = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    //             0       1       2       3       4       5       6       7       8       9    
    private char[] zipDigits;


    public BarCode(String zip) {
	_zip = zip;
	zipDigits = _zip.toCharArray();
	if (!isValidZip()) {
	    throw new IllegalArgumentException();
	}
	_checkDigit = checkSum();
    }


    public BarCode(BarCode x) {
	this(x._zip);
    }


    private boolean isValidZip() {
	if (_zip.length() != 5) {
	    return false;
	} 
	for (char digit : zipDigits) {
	    if (!Character.isDigit(digit)) {
		return false;
	    } 
	}
	return true;
    } 


    private int checkSum() {
	int digitSum = 0;
	for (char Digit : zipDigits) {
	    digitSum += Character.getNumericValue(Digit);
	}
	return digitSum % 10;
    }


    public String toString() {
        String output = "";
	output += _zip;
	output += _checkDigit;
	output += " |";
	for (char digit : zipDigits) {
	    output += BARCODES[Character.getNumericValue(digit)];
	} 
	output += BARCODES[_checkDigit] + "|";
	return output;
    }


    public boolean equals(Object other) {
	return (this == other) || ( (other instanceof BarCode) && ( ((BarCode) other)._zip.equals(this._zip)));
    }

    
    public int compareTo(Object other) {
	int zipPlusCheckThis;
	int zipPlusChecKOther;
	if (other instanceof BarCode) {
	    zipPlusCheckThis = Integer.parseInt(_zip) + _checkDigit;
	    zipPlusCheckOther = Integer.parseInt((BarCode)(other)._zip) + (BarCode)(other).checkDigit;
	} else {
	    throw new IllegalArgumentException();
	}
	return zipPlusCheckThis - zipPlusCheckOther;
    }


}