package com.example.qthjen.fragmentgetpostdata;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAdd = (Button) findViewById(R.id.btAdd);

        FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentA fragmentA = new FragmentA();

                Bundle bundle = new Bundle();
                bundle.putString("myKey", "Hi Q.ThjeN");

                fragmentA.setArguments(bundle);

                fragmentTransaction.add(R.id.linearLayout, fragmentA);
                fragmentTransaction.commit();

            }
        });


    }
}
