package ibittech.boneos.util;

public class Command {
	public static boolean doCommand(String command){
		switch(command){
		case "help": //TODO
		}
		System.out.println("Error: command not found: " + command);
		return false;
	}
}
