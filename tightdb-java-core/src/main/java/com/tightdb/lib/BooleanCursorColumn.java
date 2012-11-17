package com.tightdb.lib;

public class BooleanCursorColumn<Cursor, View, Query> extends AbstractColumn<Boolean, Cursor, View, Query> {

	public BooleanCursorColumn(EntityTypes<?, View, Cursor, Query> types, AbstractCursor<Cursor> cursor, int index, String name) {
		super(types, cursor, index, name);
	}

	@Override
	public Boolean get() {
		return cursor.rowset.getBoolean(columnIndex, cursor.getPosition());
	}

	@Override
	public void set(Boolean value) {
		cursor.rowset.setBoolean(columnIndex, cursor.getPosition(), value);
	}

}