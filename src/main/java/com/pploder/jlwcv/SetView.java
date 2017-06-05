package com.pploder.jlwcv;

import java.util.Set;

public class SetView<T> extends CollectionView<T> implements Set<T> {

	public SetView(Set<T> original) {
		super(original);
	}

}
