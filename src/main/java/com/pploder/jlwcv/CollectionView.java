package com.pploder.jlwcv;

import java.util.Collection;

public class CollectionView<T> extends IterableView<T> implements Collection<T> {

	private final Collection<T> original;

	public CollectionView(Collection<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public boolean add(T e) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void clear() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean contains(Object o) {
		return original.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return original.containsAll(c);
	}

	@Override
	public boolean isEmpty() {
		return original.isEmpty();
	}

	@Override
	public boolean remove(Object o) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public int size() {
		return original.size();
	}

	@Override
	public Object[] toArray() {
		return original.toArray();
	}

	@SuppressWarnings("hiding")
	@Override
	public <T> T[] toArray(T[] a) {
		return original.toArray(a);
	}

}
