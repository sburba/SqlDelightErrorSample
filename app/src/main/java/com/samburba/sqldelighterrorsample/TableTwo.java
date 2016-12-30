package com.samburba.sqldelighterrorsample;


import android.support.annotation.Nullable;

import com.squareup.sqldelight.ColumnAdapter;
import com.squareup.sqldelight.EnumColumnAdapter;

public class TableTwo implements TableTwoModel {
    private static final Creator<TableTwo> CREATOR = new Creator<TableTwo>() {
        @Override
        public TableTwo create(long _id, @Nullable Type type) {
            return null;
        }
    };

    private static final ColumnAdapter<Type, String> TYPE_ADAPTER = EnumColumnAdapter.create(Type.class);

    static Factory<TableTwo> FACTORY = new Factory<>(CREATOR, TYPE_ADAPTER);

    enum Type {
        TYPE_ONE, TYPE_TWO
    }

    @Override
    public long _id() {
        return 0;
    }

    @Nullable
    @Override
    public Type type() {
        return null;
    }
}
