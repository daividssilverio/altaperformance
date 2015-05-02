package com.wordpress.alissonpedrina.agent;

import java.lang.instrument.Instrumentation;

/**
 * Execute o jar com este comando: java -javaagent:agent.jar
 * com.wordpress.alissonpedrina.App
 * 
 * @author Auxiliadora
 *
 */
public class AgentSimples {

	public static void premain(String agentArguments,
			Instrumentation instrumentation) {

		System.out.println("Agente");

	}
}
