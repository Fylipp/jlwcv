package com.pploder.jlwcv;

import java.util.Map.Entry;

public class EntryView<K, V> implements Entry<K, V> {

	private final Entry<K, V> original;

	public EntryView(Entry<K, V> original) {
		this.original = original;
	}

	@Override
	public K getKey() {
		return original.getKey();
	}

	@Override
	public V getValue() {
		return original.getValue();
	}

	@Override
	public V setValue(V arg0) {
		throw new ViewMutationAttemptException();
	}

}
