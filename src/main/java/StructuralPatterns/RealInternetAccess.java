package StructuralPatterns;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class RealInternetAccess implements OfficeInternetAccess {

	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private String employeeName;

	public RealInternetAccess(String empName) {
		this.employeeName = empName;
	}

	@Override
	public void grantInternetAccess() {
		myout.print("Internet Access granted for employee: " + employeeName);
	}
}