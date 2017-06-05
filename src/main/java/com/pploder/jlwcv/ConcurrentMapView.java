package com.pploder.jlwcv;

import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapView<K, V> extends MapView<K, V> implements ConcurrentMap<K, V> {

	public ConcurrentMapView(MapView<K, V> original) {
		super(original);
	}

	@Override
	public V putIfAbsent(K key, V value) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean remove(Object key, Object value) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public V replace(K key, V value) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public boolean replace(K key, V oldValue, V newValue) {
		throw new ViewMutationAttemptException();
	}

}
