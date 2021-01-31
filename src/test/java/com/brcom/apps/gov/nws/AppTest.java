/**
 * 
 */
package com.brcom.apps.gov.nws;

import org.junit.Test;

import com.brcom.apps.gov.nws.App;

/**
 * @author Lakshmipriya
 *
 */
public class AppTest {

	@Test
	public void testMain_NPE() {
		String[] args =null;
		App.main(args);
	}
	
	@Test
	public void testMain_insufficinet_args() throws Exception {
		String[] args = {"0"};
		App.main(args);
	}
	
	@Test
	public void testMain_sufficinet_args() throws Exception {
		String[] args = {"0","0"};
		App.main(args);
	}

}
