package com.pploder.jlwic;

import java.util.Collection;

public class ImmutableCollection<T> extends ImmutableIterable<T> implements Collection<T> {

	private final Collection<T> original;

	public ImmutableCollection(Collection<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public boolean add(T e) {
		throw new ImmutableException();
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		throw new ImmutableException();
	}

	@Override
	public void clear() {
		throw new ImmutableException();
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
		throw new ImmutableException();
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		throw new ImmutableException();
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		throw new ImmutableException();
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
