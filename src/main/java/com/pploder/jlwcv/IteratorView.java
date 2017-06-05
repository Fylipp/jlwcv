package com.pploder.jlwcv;

import java.util.Iterator;

public class IteratorView<T> implements Iterator<T> {

	private final Iterator<T> original;
	
	public IteratorView(Iterator<T> original) {
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
		throw new ViewMutationAttemptException();
	}

}
