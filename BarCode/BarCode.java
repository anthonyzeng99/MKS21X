public class BarCode {

    private int _checkDigit;
    private String _zip;
    private static  String[] BARCODES = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    //             0       1       2       3       4       5       6       7       8       9    

    public BarCode(String zip) {
	_zip = zip;
	_checkDigit = checkSum();
    }

    public BarCode(BarCode x) {
	this(x._zip);
    }

    private boolean isValidZip(String zip) {
	char[] zipDigits;
	if (zip.length() != 5) {
	    return false;
	} 
	zipDigits = zip.toCharArray();
	for (char digit : zipDigits) {
	    if (!Character.isDigit(digit)) {
		return false;
	    } 
	}
	return true;
    } 

    private int checkSum() {
	char[] zipDigits = _zip.toCharArray();
	int digitSum = 0;
	for (char Digit : zipDigits) {
	    digitSum += Character.getNumericValue(Digit);
	}
	return digitSum % 10;
    }

    public static void main(String[] args) {
	BarCode b1 = new BarCode("11228");
	System.out.println(b1.checkSum());
    }

}