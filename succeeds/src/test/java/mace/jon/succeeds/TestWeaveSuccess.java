package mace.jon.succeeds;

import org.junit.Test;

import junit.framework.TestCase;
import mace.jon.aspects.MatchAnnotation.MyAspectAddedInterface;
import mace.jon.fails.ConcreteClassSucceeds;

public class TestWeaveSuccess extends TestCase {
	
	@Test
	public void testWeaveDidHappen() {
		ConcreteClassSucceeds cls = new ConcreteClassSucceeds();
		assertTrue(cls instanceof MyAspectAddedInterface);
	}

}
