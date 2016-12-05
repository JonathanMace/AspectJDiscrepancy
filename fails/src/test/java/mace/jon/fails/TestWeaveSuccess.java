package mace.jon.fails;

import org.junit.Test;

import junit.framework.TestCase;
import mace.jon.aspects.MatchAnnotation.MyAspectAddedInterface;
import mace.jon.fails.ConcreteClassFails;

public class TestWeaveSuccess extends TestCase {
	
	@Test
	public void testWeaveDidHappen() {
		ConcreteClassFails cls = new ConcreteClassFails();
		assertTrue(cls instanceof MyAspectAddedInterface);
	}

}
