package com.hva.tsse.juniorleraar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    // Vars
    private Button mDida;
    private Button mColle;
    private Button mPeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // findViews
        Button mDidaBtn = (Button)findViewById(R.id.btn_didactisch);
        Button mColleBtn = (Button)findViewById(R.id.btn_collegiaal);
        Button mPedaBtn = (Button)findViewById(R.id.btn_pedagogisch);


        // Nav
        mDidaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent didaIntent = new Intent(Home.this, Dida.class);
//                    Home.this.startActivity(didaIntent);

                Intent intent = new Intent(Home.this, TabActivity.class);
                Home.this.startActivity(intent);
            }
        });

        mColleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colleIntent = new Intent(Home.this, Colle.class);
                Home.this.startActivity(colleIntent);
            }
        });

        mPedaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pedaIntent = new Intent(Home.this, Peda.class);
                Home.this.startActivity(pedaIntent);
            }
        });


//        Toolbar toolbar = (Toolbar)findViewById(R.id.main_toolbar);
//        setToolbar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//        getSupportActionBar().setElevation(0);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setToolbar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.action_settings: {
//                showSettingsActivity(false);
//                return true;
//            }
//            case android.R.id.home: {
//                onBackPressed();
//                return true;
//            }
//            default: {
//                return false;
//            }
//        }
//    }
}
