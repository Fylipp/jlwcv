package com.pploder.jlwcv;

import java.util.Iterator;

public class IterableView<T> implements Iterable<T> {

	private final Iterable<T> original;

	public IterableView(Iterable<T> original) {
		this.original = original;
	}

	@Override
	public Iterator<T> iterator() {
		return new IteratorView<T>(original.iterator());
	}

}
