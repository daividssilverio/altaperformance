package com.wordpress.alissonpedrina.altaperformance.flags;

public class Tools {

	public static void main(String[] args) {
		String verPIDJava = "jcmd -l";
		String upTime = "jcmd process_id VM.uptime";
		String systemProperties = "jcmd process_id VM.system_properties";
		String systemPropertiesComJinfo = "jinfo -sysprops process_id";
		String versaoVM = "jcmd pid VM.version";
		String commandLine = "jcmd pid VM.command_line";
		String flags = "jcmd pid VM.flags";
		String verTodasFlags = "-XX:+PrintFlagsFinal";
		String verThreads = "jstack pid";
	}
	
}
