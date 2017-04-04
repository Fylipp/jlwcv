package com.pploder.jlwic;

import java.util.Comparator;
import java.util.SortedSet;

public class ImmutableSortedSet<T> extends ImmutableSet<T> implements SortedSet<T> {

	private final SortedSet<T> original;

	public ImmutableSortedSet(SortedSet<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public Comparator<? super T> comparator() {
		return original.comparator();
	}

	@Override
	public T first() {
		return original.first();
	}

	@Override
	public SortedSet<T> headSet(T toElement) {
		return original.headSet(toElement);
	}

	@Override
	public T last() {
		return original.last();
	}

	@Override
	public SortedSet<T> subSet(T fromElement, T toElement) {
		return new ImmutableSortedSet<T>(original.subSet(fromElement, toElement));
	}

	@Override
	public SortedSet<T> tailSet(T fromElement) {
		return new ImmutableSortedSet<T>(original.tailSet(fromElement));
	}

}
