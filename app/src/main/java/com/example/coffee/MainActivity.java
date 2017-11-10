package com.example.coffee;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {


    static View.OnClickListener myOnClickListener;

    static View.OnClickListener myOnClickListener1;

    ImageButton imageButton;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myOnClickListener = new MyOnClickListener(this);
        myOnClickListener1 = new MyOnClickListener1(this);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        PagerAdapter adapter = new PagerAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

        ViewPager viewPager1 = findViewById(R.id.view_pager);
        viewPager1.setAdapter(new _PagerAdapter());
        viewPager1.setOffscreenPageLimit(3);

        drawerLayout = findViewById(R.id.drawer);

        imageButton = findViewById(R.id.navigation_button);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.START);
            }
        });
    }

    private class MyOnClickListener implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            FragmentManager fm = getSupportFragmentManager();
            QRDialog editNameDialogFragment = QRDialog.newInstance("Some Title");
            editNameDialogFragment.show(fm, "fragment_edit_name");

        }
    }

    private class MyOnClickListener1 implements View.OnClickListener {

        private final Context context;

        private MyOnClickListener1(Context context) {
            this.context = context;
        }

        @Override
        public void onClick(View v) {
            FragmentManager fm = getSupportFragmentManager();
            CookieDialog editNameDialogFragment = CookieDialog.newInstance("Some Title");
            editNameDialogFragment.show(fm, "fragment_edit_name");

        }
    }
}


