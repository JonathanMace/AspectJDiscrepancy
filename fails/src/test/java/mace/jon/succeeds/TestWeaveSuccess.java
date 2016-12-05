package mace.jon.succeeds;

import org.junit.Test;

import junit.framework.TestCase;
import mace.jon.aspects.MatchAnnotation.MyAspectAddedInterface;
import mace.jon.fails.MyConcreteClass2;

public class TestWeaveSuccess extends TestCase {
	
	@Test
	public void testWeaveDidHappen() {
		MyConcreteClass2 cls = new MyConcreteClass2();
		assertTrue(cls instanceof MyAspectAddedInterface);
	}

}
