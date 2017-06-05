package com.pploder.jlwcv;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapView<K, V> implements Map<K, V> {

	private final Map<K, V> original;

	public MapView(Map<K, V> original) {
		this.original = original;
	}

	@Override
	public void clear() {
		original.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return original.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return original.containsValue(value);
	}

	@Override
	public Set<Map.Entry<K, V>> entrySet() {
		Set<Map.Entry<K, V>> old = original.entrySet();
		Set<Map.Entry<K, V>> neo = new HashSet<>();

		for (Entry<K, V> entry : old) {
			neo.add(new EntryView<K, V>(entry));
		}

		return new SetView<>(neo);
	}

	@Override
	public V get(Object key) {
		return original.get(key);
	}

	@Override
	public boolean isEmpty() {
		return original.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return original.keySet();
	}

	@Override
	public V put(K key, V value) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public V remove(Object key) {
		throw new ViewMutationAttemptException();
	}

	@Override
	public int size() {
		return original.size();
	}

	@Override
	public Collection<V> values() {
		return original.values();
	}

}
