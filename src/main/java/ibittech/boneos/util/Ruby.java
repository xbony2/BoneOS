package ibittech.boneos.util;

import ibittech.boneos.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptException;

public class Ruby {
	/**
	 * Simply runs the ruby script provided.
	 * 
	 * @param location where the script is. Remember to use the RubyIndex.
	 */
	public static void runScript(String location){
		try {
			Main.jruby.eval(new BufferedReader(new FileReader(location)));
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (ScriptException e){
			e.printStackTrace();
		}
	}
}
