package com.pploder.jlwic;

import java.util.concurrent.ConcurrentMap;

public class ImmutableConcurrentMap<K, V> extends ImmutableMap<K, V> implements ConcurrentMap<K, V> {

	public ImmutableConcurrentMap(ImmutableMap<K, V> original) {
		super(original);
	}

	@Override
	public V putIfAbsent(K key, V value) {
		throw new ImmutableException();
	}

	@Override
	public boolean remove(Object key, Object value) {
		throw new ImmutableException();
	}

	@Override
	public V replace(K key, V value) {
		throw new ImmutableException();
	}

	@Override
	public boolean replace(K key, V oldValue, V newValue) {
		throw new ImmutableException();
	}

}
