package com.pploder.jlwic;

import java.util.Set;

public class ImmutableSet<T> extends ImmutableCollection<T> implements Set<T> {

	public ImmutableSet(Set<T> original) {
		super(original);
	}

}
