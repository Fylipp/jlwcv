package com.fylipp.jlwic;

import java.util.Iterator;

public class ImmutableIterable<T> implements Iterable<T> {

	private final Iterable<T> original;

	public ImmutableIterable(Iterable<T> original) {
		this.original = original;
	}

	@Override
	public Iterator<T> iterator() {
		return new ImmutableIterator<T>(original.iterator());
	}

}
