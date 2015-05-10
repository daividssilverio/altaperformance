package com.wordpress.alissonpedrina.string;

import org.junit.Test;

/**
 * Rode com os parametros -Xprof
 * @author Auxiliadora
 *
 */
public class WrapperEPrimitivosTest {

	@Test(timeout = 18000)
	public void deveTestarDesempenhoDeCalculoDeLongComWrapper(){
		calculoComAutoBoxing();
	}

	@Test(timeout = 18000)
	public void deveTestarDesempenhoDeCalculoDeLongComPrimitivos(){
		calculoComPrimitivos();
	}
	
	public long calculoComPrimitivos(){
		long sum = 0L;
		
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

	
	public long calculoComAutoBoxing(){
		Long sum = 0L;
		
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
		
		return sum;
	}
	
}
