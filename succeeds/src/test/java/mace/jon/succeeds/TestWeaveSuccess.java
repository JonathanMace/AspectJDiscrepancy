package mace.jon.succeeds;

import org.junit.Test;

import junit.framework.TestCase;
import mace.jon.aspects.MatchAnnotation.MyAspectAddedInterface;

public class TestWeaveSuccess extends TestCase {
	
	@Test
	public void testWeaveDidHappen() {
		MyConcreteClass cls = new MyConcreteClass();
		assertTrue(cls instanceof MyAspectAddedInterface);
	}

}
