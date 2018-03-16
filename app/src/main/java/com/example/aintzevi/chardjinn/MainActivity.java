package com.example.aintzevi.chardjinn;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //public ParseUser CURRENTUSER;

    private final String TAG = "MainPagerActivity";


    SectionsPagerAdapter mSectionsPagerAdapter;
    public ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deep-Linking Intent
        Intent intent = getIntent();
        Uri data = intent.getData();
        if(data!=null) {
            Log.e(TAG, "" + data.toString()); //Watch out for null pointerdata
            Log.e(TAG, "" + data.getEncodedPath()); //Watch out for null pointerdata

            if (data.getEncodedPath() != null){
                switch (data.getEncodedPath()){
                    case "/raceResults":
                        Intent intent1 = new Intent(this, RaceResultActivity.class);
                        startActivity(intent1);
                        break;
                    default:
                        //do nothing
                        break;
                }
            }
        }


        // Create adapter to return a fragment for each of the sections
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mViewPager.setCurrentItem(1, true);


        /**
         * Buttons
         * in der unteren Leiste
         */

        final ImageView ridesButton =(ImageView)findViewById(R.id.ridesIcon);
        final ImageView dashboardButton =(ImageView)findViewById(R.id.dashboardIcon);
        final ImageView leaderboardButton =(ImageView)findViewById(R.id.leaderboardIcon);
        final ImageView profileButton =(ImageView)findViewById(R.id.profileIcon);

        ridesButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mViewPager.setCurrentItem(0, true);
            }
        });
        dashboardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mViewPager.setCurrentItem(1, true);
            }
        });
        leaderboardButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mViewPager.setCurrentItem(2, true);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                mViewPager.setCurrentItem(3, true);
            }
        });



        /**
         * Farben der Buttons aendern je nach Seite
         *
         */

/*        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        *//*favouritesButton.setBackgroundColor(Color.parseColor("#30312C"));
                        searchButton.setBackgroundColor(Color.parseColor("#9EA3A9"));*//*
                        break;
                    case 1:
*//*                        searchButton.setBackgroundColor(Color.parseColor("#30312C"));
                        favouritesButton.setBackgroundColor(Color.parseColor("#9EA3A9"));*//*
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                // TODO Auto-generated method stub

            }
        });*/
    }


        public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);



        }


        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class
            // below).
            switch (position) {
                case 0:
                    return RidesFragment.newInstance(position + 1);
                case 1:
                    return BottomMenuFragment.newInstance(position + 1);
                case 2:
                    return LeaderboardFragment.newInstance(position + 1);
                case 3:
                    return ProfileFragment.newInstance(position + 1);
                default:
                    return BottomMenuFragment.newInstance(position + 1);
            }
//            return null;
        }

        @Override
        public int getCount() {
            // Show 1 total page.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return "";
                case 1:
                    return "";
                case 2:
                    return "";
            }
            return null;
        }
    }
}
