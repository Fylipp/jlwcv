package com.pploder.jlwcv;

import java.util.Iterator;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

public class BlockingDequeView<T> extends BlockingQueueView<T> implements BlockingDeque<T> {

	private final BlockingDeque<T> original;

	public BlockingDequeView(BlockingDeque<T> original) {
		super(original);
		this.original = original;
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
	public T removeFirst() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T removeLast() {
		throw new ViewMutationAttemptException();
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
	public boolean offerFirst(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean offerFirst(T e, long timeout, TimeUnit unit) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean offerLast(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean offerLast(T e, long timeout, TimeUnit unit) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T pollLast(long timeout, TimeUnit unit) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void push(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void putFirst(T e) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void putLast(T e) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean removeFirstOccurrence(Object o) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean removeLastOccurrence(Object o) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T takeFirst() throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T takeLast() throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

}
