public class BarCode {

    private int _checkDigit;
    private String _zip;
    private String[] BARCODES;

    BARCODES = ["||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"];
    //             0       1       2       3       4       5       6       7       8       9 

    public BarCode(String zip) {
	_zip = zip;
	_checkDigit = checkSum();
    }

    public BarCode(BarCode x) {
	this(x._zip_);
    }

}