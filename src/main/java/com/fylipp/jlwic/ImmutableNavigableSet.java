package com.fylipp.jlwic;

import java.util.Iterator;
import java.util.NavigableSet;

public class ImmutableNavigableSet<T> extends ImmutableSortedSet<T> implements NavigableSet<T> {

	private final NavigableSet<T> original;

	public ImmutableNavigableSet(NavigableSet<T> original) {
		super(original);
		this.original = original;
	}

	@Override
	public T ceiling(T e) {
		return original.ceiling(e);
	}

	@Override
	public Iterator<T> descendingIterator() {
		return original.descendingIterator();
	}

	@Override
	public NavigableSet<T> descendingSet() {
		return original.descendingSet();
	}

	@Override
	public T floor(T e) {
		return original.floor(e);
	}

	@Override
	public NavigableSet<T> headSet(T toElement, boolean inclusive) {
		return original.headSet(toElement, inclusive);
	}

	@Override
	public T higher(T e) {
		return original.higher(e);
	}

	@Override
	public T lower(T e) {
		return original.lower(e);
	}

	@Override
	public T pollFirst() {
		return original.pollFirst();
	}

	@Override
	public T pollLast() {
		return original.pollLast();
	}

	@Override
	public NavigableSet<T> subSet(T fromElement, boolean fromInclusive, T toElement, boolean toInclusive) {
		return new ImmutableNavigableSet<T>(original.subSet(fromElement, fromInclusive, toElement, toInclusive));
	}

	@Override
	public NavigableSet<T> tailSet(T fromElement, boolean inclusive) {
		return new ImmutableNavigableSet<T>(original.tailSet(fromElement, inclusive));
	}

}
