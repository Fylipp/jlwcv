package com.pploder.jlwcv;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;

public class NavigableMapView<K, V> extends MapView<K, V> implements NavigableMap<K, V> {

	private final NavigableMap<K, V> original;

	public NavigableMapView(NavigableMap<K, V> original) {
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
		return new EntryView<K, V>(original.ceilingEntry(key));
	}

	@Override
	public K ceilingKey(K key) {
		return original.ceilingKey(key);
	}

	@Override
	public NavigableSet<K> descendingKeySet() {
		return new NavigableSetView<>(original.descendingKeySet());
	}

	@Override
	public NavigableMap<K, V> descendingMap() {
		return new NavigableMapView<>(original.descendingMap());
	}

	@Override
	public Map.Entry<K, V> firstEntry() {
		return new EntryView<K, V>(original.firstEntry());
	}

	@Override
	public Map.Entry<K, V> floorEntry(K key) {
		return new EntryView<K, V>(original.floorEntry(key));
	}

	@Override
	public K floorKey(K key) {
		return original.floorKey(key);
	}

	@Override
	public SortedMap<K, V> headMap(K toKey) {
		return new SortedMapView<>(original).headMap(toKey);
	}

	@Override
	public NavigableMap<K, V> headMap(K toKey, boolean inclusive) {
		return new NavigableMapView<>(original.headMap(toKey, inclusive));
	}

	@Override
	public Map.Entry<K, V> higherEntry(K key) {
		return new EntryView<K, V>(original.higherEntry(key));
	}

	@Override
	public K higherKey(K key) {
		return original.higherKey(key);
	}

	@Override
	public Map.Entry<K, V> lastEntry() {
		return new EntryView<K, V>(original.lastEntry());
	}

	@Override
	public Map.Entry<K, V> lowerEntry(K key) {
		return new EntryView<K, V>(original.lowerEntry(key));
	}

	@Override
	public K lowerKey(K key) {
		return original.lowerKey(key);
	}

	@Override
	public NavigableSet<K> navigableKeySet() {
		return new NavigableSetView<>(original.navigableKeySet());
	}

	@Override
	public Map.Entry<K, V> pollFirstEntry() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public Map.Entry<K, V> pollLastEntry() {
		throw new ViewMutationAttemptException();
	}

	@Override
	public SortedMap<K, V> subMap(K fromKey, K toKey) {
		return new SortedMapView<>(original.subMap(fromKey, toKey));
	}

	@Override
	public NavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) {
		return new NavigableMapView<>(original.subMap(fromKey, fromInclusive, toKey, toInclusive));
	}

	@Override
	public SortedMap<K, V> tailMap(K fromKey) {
		return new SortedMapView<>(original.tailMap(fromKey));
	}

	@Override
	public NavigableMap<K, V> tailMap(K fromKey, boolean inclusive) {
		return new NavigableMapView<>(original.tailMap(fromKey, inclusive));
	}

}
