package org.ilfirst.FLFL.spikes2212.robot.vision;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResultReader {
	public static double readResult(String path) {
		Scanner s = null;
		try {
			s = new Scanner(new File(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (s != null) {
			return s.nextDouble();
		}
		throw new IllegalStateException("Scanning unsuccesful");
	}
}
