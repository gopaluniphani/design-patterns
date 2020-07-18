package StructuralPatterns;

import java.io.PrintStream;
import java.util.Properties;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProxyPatternClient {

	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
	private static final Logger logger = LogManager.getLogger(ProxyPatternClient.class);
	static Properties props = new Properties();

	public static void main(String[] args) {
		logger.debug("Debugging started in ProxyPatternClient");
		OfficeInternetAccess access = new ProxyInternetAccess("Phani Gopaluni");
		access.grantInternetAccess();
	}
}