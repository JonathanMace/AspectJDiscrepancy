package mace.jon.aspects;

import mace.jon.Annotations.ShouldDoWeave;

public aspect MatchAnnotation {

	public interface MyAspectAddedInterface {
		public int count();
	}

	public volatile int MyAspectAddedInterface.x;

	public int MyAspectAddedInterface.count() {
		return x++;
	}

	declare parents: (@ShouldDoWeave Object)+ implements MyAspectAddedInterface;

}