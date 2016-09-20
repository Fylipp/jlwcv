package com.fylipp.jlwic;

import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class ImmutableBlockingDeque<T> extends ImmutableBlockingQueue<T> implements BlockingDeque<T> {

	private final BlockingDeque<T> original;

	public ImmutableBlockingDeque(BlockingDeque<T> original) {
		super(original);
		this.original = original;
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
	public T removeFirst() {
		throw new ImmutableException();
	}

	@Override
	public T removeLast() {
		throw new ImmutableException();
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
	public boolean offerFirst(T e) {
		throw new ImmutableException();
	}

	@Override
	public boolean offerFirst(T e, long timeout, TimeUnit unit) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public boolean offerLast(T e) {
		throw new ImmutableException();
	}

	@Override
	public boolean offerLast(T e, long timeout, TimeUnit unit) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public T pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public T pollLast(long timeout, TimeUnit unit) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public void push(T e) {
		throw new ImmutableException();
	}

	@Override
	public void putFirst(T e) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public void putLast(T e) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		throw new ImmutableException();
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		throw new ImmutableException();
	}

	@Override
	public T takeFirst() throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public T takeLast() throws InterruptedException {
		throw new ImmutableException();
	}

}
