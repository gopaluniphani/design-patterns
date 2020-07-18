package StructuralPatterns;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ProxyInternetAccess implements OfficeInternetAccess {

	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private String employeeName;
	private RealInternetAccess realaccess;

	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if (getRole(employeeName) > 4) {
			realaccess = new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		} else {
			myout.print("No Internet access granted. Your job level is below 5");
		}
	}

	public int getRole(String emplName) {
		return 9;
	}
}