package com.pploder.jlwcv;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class TransferQueueView<T> extends BlockingQueueView<T> implements TransferQueue<T> {

	private final TransferQueue<T> original;

	public TransferQueueView(TransferQueue<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public int getWaitingConsumerCount() {
		return original.getWaitingConsumerCount();
	}

	@Override
	public boolean hasWaitingConsumer() {
		return original.hasWaitingConsumer();
	}

	@Override
	public void transfer(T e) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean tryTransfer(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean tryTransfer(T e, long timeout, TimeUnit unit) throws InterruptedException {
		throw new ViewMutationAttemptException();
	}

}
