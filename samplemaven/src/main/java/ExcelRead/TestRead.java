package ExcelRead;

import java.io.IOException;

public class TestRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelRead1 obj = new ExcelRead1();
		System.out.println(ExcelRead1.getStringData(1,0));
		System.out.println(ExcelRead1.getIntegerData(1, 1));
		
	}

}
