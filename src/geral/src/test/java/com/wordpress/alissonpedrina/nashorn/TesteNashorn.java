package com.wordpress.alissonpedrina.nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class TesteNashorn {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("nashorn");
		engine.eval("print (java.lang.System.currentTimeMillis())");
	}
	
}
