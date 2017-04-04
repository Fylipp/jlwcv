package com.fylipp.jlwic;

import java.util.Deque;
import java.util.Iterator;

public class ImmutableDeque<T> extends ImmutableQueue<T> implements Deque<T> {

	private final Deque<T> original;

	public ImmutableDeque(Deque<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public void addFirst(T e) {
		throw new ImmutableException();
	}

	@Override
	public void addLast(T e) {
		throw new ImmutableException();
	}

	@Override
	public Iterator<T> descendingIterator() {
		return new ImmutableIterator<>(original.descendingIterator());
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
		throw new ImmutableException();
	}

	@Override
	public boolean offerLast(T e) {
		throw new ImmutableException();
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
		throw new ImmutableException();
	}

	@Override
	public T pollLast() {
		throw new ImmutableException();
	}

	@Override
	public T pop() {
		throw new ImmutableException();
	}

	@Override
	public void push(T e) {
		throw new ImmutableException();
	}

	@Override
	public T removeFirst() {
		throw new ImmutableException();
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		throw new ImmutableException();
	}

	@Override
	public T removeLast() {
		throw new ImmutableException();
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		throw new ImmutableException();
	}

}
