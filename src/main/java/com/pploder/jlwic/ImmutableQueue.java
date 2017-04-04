package com.pploder.jlwic;

import java.util.Queue;

public class ImmutableQueue<T> extends ImmutableCollection<T> implements Queue<T> {

	private final Queue<T> original;

	public ImmutableQueue(Queue<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public T element() {
		return original.element();
	}

	@Override
	public boolean offer(T arg0) {
		throw new ImmutableException();
	}

	@Override
	public T peek() {
		return original.peek();
	}

	@Override
	public T poll() {
		throw new ImmutableException();
	}

	@Override
	public T remove() {
		throw new ImmutableException();
	}

}
