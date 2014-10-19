package ibittech.boneos;

import ibittech.boneos.util.Ruby;

import java.io.FileNotFoundException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
	public static ScriptEngine jruby;
	
	public static void main(String[] args) throws FileNotFoundException, ScriptException{
		jruby = new ScriptEngineManager().getEngineByName("jruby");
		Ruby.runScript(RubyIndex.STARTUPSCREEN);
		
		while(true){
			//TODO
		}
	}
}
