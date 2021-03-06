/**
 * 
 */
package com.manning.sbia.ch10;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author acogoluegnes
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"batch-infrastructure.xml","externalized-flow.xml"})
public class ExternalizedFlowTest extends AbstractJobTest {

	@Override
	protected int getExpectedNbOfInvocationFileExists() {
		return 2;
	}
	
}
