package ibittech.boneos.util;

import ibittech.boneos.RubyIndex;
import ibittech.boneos.system.java.ShutdownStatus;

public class Command {
	public static void doCommand(String command){
		switch(command.toLowerCase()){
		case "help": Ruby.runScript(RubyIndex.HELP);
			break;
		case "shutdown":
			ShutdownStatus.shutDown(ShutdownStatus.NORMAL);
		default:
			System.out.println("Error: command not found: " + command.toLowerCase());
			break;
		}
	}
}
