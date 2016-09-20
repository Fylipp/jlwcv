package com.fylipp.jlwic;

import java.util.Iterator;

public class ImmutableIterator<T> implements Iterator<T> {

	private final Iterator<T> original;
	
	public ImmutableIterator(Iterator<T> original) {
		this.original = original;
	}
	
	@Override
	public boolean hasNext() {
		return original.hasNext();
	}

	@Override
	public T next() {
		return original.next();
	}
	
	@Override
	public void remove() {
		throw new ImmutableException();
	}

}
