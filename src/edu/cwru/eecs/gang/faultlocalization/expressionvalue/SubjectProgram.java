package edu.cwru.eecs.gang.faultlocalization.expressionvalue;

import java.io.File;

public class SubjectProgram {
	
	//===============================================================================
	private static String folder_base = "C:/Documents and Settings/Gang/git/JavaExecutionProfiler/";
	public static String[] ignoredClasses = new String[]{
		"edu/cwru/eecs/gang/faultlocalization/expressionvalue"
	};
	//===============================================================================
	
	public static String base_bin  = folder_base + "bin/";
	public static String base_bin2 = folder_base + "bin2/";
	public static String base_out = folder_base + "out/";
	
	public static String folder_out_executions;
	public static String file_out_methods;
	
	static {
		folder_out_executions = base_out + "executions/";
		file_out_methods = base_out + "methods.txt";
		File dir = new File(base_out);
		if (dir.exists()){
			dir.mkdirs();
		}
	}
}
