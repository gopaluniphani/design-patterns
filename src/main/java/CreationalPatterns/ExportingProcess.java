package CreationalPatterns;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ExportingProcess {
	private long processNo;
	static PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));

	public ExportingProcess(long processNo) {
		this.processNo = processNo;

		myout.print("Object with process no. " + processNo + " was created\n");
	}

	public long getProcessNo() {
		return processNo;
	}
}