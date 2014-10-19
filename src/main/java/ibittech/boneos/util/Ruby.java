package ibittech.boneos.util;

import ibittech.boneos.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptException;

public class Ruby {
	public static void runScript(String script){
		try {
			Main.jruby.eval(new BufferedReader(new FileReader(script)));
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (ScriptException e){
			e.printStackTrace();
		}
	}
}
