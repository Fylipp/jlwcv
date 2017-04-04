package com.pploder.jlwic;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

public class ImmutableNavigableMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {

	private final NavigableMap<K, V> original;

	public ImmutableNavigableMap(NavigableMap<K, V> original) {
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
	public K lastKey() {
		return original.lastKey();
	}

	@Override
	public Map.Entry<K, V> ceilingEntry(K key) {
		return new ImmutableEntry<K, V>(original.ceilingEntry(key));
	}

	@Override
	public K ceilingKey(K key) {
		return original.ceilingKey(key);
	}

	@Override
	public NavigableSet<K> descendingKeySet() {
		return new ImmutableNavigableSet<>(original.descendingKeySet());
	}

	@Override
	public NavigableMap<K, V> descendingMap() {
		return new ImmutableNavigableMap<>(original.descendingMap());
	}

	@Override
	public Map.Entry<K, V> firstEntry() {
		return new ImmutableEntry<K, V>(original.firstEntry());
	}

	@Override
	public Map.Entry<K, V> floorEntry(K key) {
		return new ImmutableEntry<K, V>(original.floorEntry(key));
	}

	@Override
	public K floorKey(K key) {
		return original.floorKey(key);
	}

	@Override
	public SortedMap<K, V> headMap(K toKey) {
		return new ImmutableSortedMap<>(original).headMap(toKey);
	}

	@Override
	public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
		return new ImmutableNavigableMap<>(original.headMap(toKey, inclusive));
	}

	@Override
	public Map.Entry<K, V> higherEntry(K key) {
		return new ImmutableEntry<K, V>(original.higherEntry(key));
	}

	@Override
	public K higherKey(K key) {
		return original.higherKey(key);
	}

	@Override
	public Map.Entry<K, V> lastEntry() {
		return new ImmutableEntry<K, V>(original.lastEntry());
	}

	@Override
	public Map.Entry<K, V> lowerEntry(K key) {
		return new ImmutableEntry<K, V>(original.lowerEntry(key));
	}

	@Override
	public K lowerKey(K key) {
		return original.lowerKey(key);
	}

	@Override
	public NavigableSet<K> navigableKeySet() {
		return new ImmutableNavigableSet<>(original.navigableKeySet());
	}

	@Override
	public Map.Entry<K, V> pollFirstEntry() {
		throw new ImmutableException();
	}

	@Override
	public Map.Entry<K, V> pollLastEntry() {
		throw new ImmutableException();
	}

	@Override
	public SortedMap<K, V> subMap(K fromKey, K toKey) {
		return new ImmutableSortedMap<>(original.subMap(fromKey, toKey));
	}

	@Override
	public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
		return new ImmutableNavigableMap<>(original.subMap(fromKey, fromInclusive, toKey, toInclusive));
	}

	@Override
	public SortedMap<K, V> tailMap(K fromKey) {
		return new ImmutableSortedMap<>(original.tailMap(fromKey));
	}

	@Override
	public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
		return new ImmutableNavigableMap<>(original.tailMap(fromKey, inclusive));
	}

}
