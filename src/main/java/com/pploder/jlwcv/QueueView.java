package com.pploder.jlwcv;

import java.util.Queue;

public class QueueView<T> extends CollectionView<T> implements Queue<T> {

	private final Queue<T> original;

	public QueueView(Queue<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public T element() {
		return original.element();
	}

	@Override
	public boolean offer(T arg0) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T peek() {
		return original.peek();
	}

	@Override
	public T poll() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T remove() {
		throw new ViewMutationAttemptException();
	}

}
