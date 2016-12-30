package com.samburba.sqldelighterrorsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableTwo.Type[] types = new TableTwo.Type[]{TableTwo.Type.TYPE_ONE, TableTwo.Type.TYPE_TWO};
        TableOne.FACTORY.select_with_types(TableTwo.FACTORY, types);
    }
}
