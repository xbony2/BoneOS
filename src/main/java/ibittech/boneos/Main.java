package ibittech.boneos;

import ibittech.boneos.util.Command;
import ibittech.boneos.util.Ruby;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
	public static ScriptEngine jruby;
	private static Scanner reader;
	
	public static void main(String[] args) throws FileNotFoundException, ScriptException{
		jruby = new ScriptEngineManager().getEngineByName("jruby");
		Ruby.runScript(RubyIndex.STARTUPSCREEN);
		
		while(true){
			reader = new Scanner(System.in);
			String input = reader.next();
			Command.doCommand(input);
		}
	}
}
