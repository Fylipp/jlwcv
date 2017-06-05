package com.pploder.jlwcv;

import java.util.Deque;
import java.util.Iterator;

public class DequeView<T> extends QueueView<T> implements Deque<T> {

	private final Deque<T> original;

	public DequeView(Deque<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public void addFirst(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void addLast(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public Iterator<T> descendingIterator() {
		return new IteratorView<>(original.descendingIterator());
	}

	@Override
	public T getFirst() {
		return original.getFirst();
	}

	@Override
	public T getLast() {
		return original.getLast();
	}

	@Override
	public boolean offerFirst(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean offerLast(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T peekFirst() {
		return original.peekFirst();
	}

	@Override
	public T peekLast() {
		return original.peekLast();
	}

	@Override
	public T pollFirst() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T pollLast() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T pop() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void push(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T removeFirst() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T removeLast() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		throw new ViewMutationAttemptException();
	}

}
