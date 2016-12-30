package com.samburba.sqldelighterrorsample;

class TableOne implements TableOneModel {
    private static final Creator<TableOne> CREATOR = new Creator<TableOne>() {
        @Override
        public TableOne create(long _id) {
            return new TableOne();
        }
    };

    static final Factory<TableOne> FACTORY = new Factory<>(CREATOR);

    @Override
    public long _id() {
        return 0;
    }
}
