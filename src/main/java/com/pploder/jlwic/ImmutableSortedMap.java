package com.pploder.jlwic;

import java.util.Comparator;
import java.util.SortedMap;

public class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements SortedMap<K, V> {

	private final SortedMap<K, V> original;

	public ImmutableSortedMap(SortedMap<K, V> original) {
		super(original);
		this.original = original;
	}

	@Override
	public Comparator<? super K> comparator() {
		return original.comparator();
	}

	@Override
	public K firstKey() {
		return original.firstKey();
	}

	@Override
	public SortedMap<K, V> headMap(K toKey) {
		return new ImmutableSortedMap<K, V>(original.headMap(toKey));
	}

	@Override
	public K lastKey() {
		return original.lastKey();
	}

	@Override
	public SortedMap<K, V> subMap(K fromKey, K toKey) {
		return new ImmutableSortedMap<K, V>(original.subMap(fromKey, toKey));
	}

	@Override
	public SortedMap<K, V> tailMap(K fromKey) {
		return new ImmutableSortedMap<K, V>(original.tailMap(fromKey));
	}

}
