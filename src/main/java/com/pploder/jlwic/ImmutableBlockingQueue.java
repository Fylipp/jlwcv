package com.pploder.jlwic;

import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ImmutableBlockingQueue<T> extends ImmutableQueue<T> implements BlockingQueue<T> {

	private final BlockingQueue<T> original;

	public ImmutableBlockingQueue(BlockingQueue<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public int drainTo(Collection<? super T> c) {
		throw new ImmutableException();
	}

	@Override
	public int drainTo(Collection<? super T> c, int i) {
		throw new ImmutableException();
	}

	@Override
	public boolean offer(T t, long l, TimeUnit tu) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public T poll(long l, TimeUnit tu) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public void put(T t) throws InterruptedException {
		throw new ImmutableException();
	}

	@Override
	public int remainingCapacity() {
		return original.remainingCapacity();
	}

	@Override
	public T take() throws InterruptedException {
		throw new ImmutableException();
	}

}
