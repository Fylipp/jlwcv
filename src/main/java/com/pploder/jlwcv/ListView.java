package com.pploder.jlwcv;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

public class ListView<T> extends CollectionView<T> implements List<T> {

	private final List<T> original;

	public ListView(List<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public void add(int index, T element) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T get(int index) {
		return original.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return original.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return original.lastIndexOf(o);
	}

	@Override
	public ListIterator<T> listIterator() {
		return new ListIteratorView<T>(original.listIterator());
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		return new ListIteratorView<T>(original.listIterator(index));
	}

	@Override
	public T remove(int index) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public T set(int index, T element) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		return new ListView<>(original.subList(fromIndex, toIndex));
	}

}
