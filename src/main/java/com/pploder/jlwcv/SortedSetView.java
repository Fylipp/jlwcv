package com.pploder.jlwcv;

import java.util.Comparator;
import java.util.SortedSet;

public class SortedSetView<T> extends SetView<T> implements SortedSet<T> {

	private final SortedSet<T> original;

	public SortedSetView(SortedSet<T> original) {
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
		return new SortedSetView<T>(original.subSet(fromElement, toElement));
	}

	@Override
	public SortedSet<T> tailSet(T fromElement) {
		return new SortedSetView<T>(original.tailSet(fromElement));
	}

}
