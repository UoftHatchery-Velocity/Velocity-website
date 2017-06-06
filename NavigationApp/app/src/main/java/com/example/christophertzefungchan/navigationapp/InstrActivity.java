package com.example.christophertzefungchan.navigationapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

/**
 * FIVE THINGS TO BE DONE:
 * 1. The instruction pictures must be of allowable format (e.g. png)
 * 2. Follow the convention instr_1, instr_2, etc. where instr_1 is the first instruction pic
 * 3. Add the pictures into the drawable folder
 * 4. In PicBank.java, declare the instruction pictures
 * 5. In specifics.xml, specify the number of instruction pics used
 */
public class InstrActivity extends FragmentActivity {

    //Number of pages
    private int NUM_PAGES;

    //This widget handles animation of the swiping
    private ViewPager mPager;

    //Provides the pages to the widget
    private PagerAdapter mPagerAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instr);

        //Setting the numbeer of pages needed
        Resources res = getResources();
        NUM_PAGES = res.getInteger(R.integer.numOfPics);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
    }

    /*
            @Override
            public void onBackPressed(){
                //Handling the back button when user is on first step
                if (mPager.getCurrentItem()==0){
                    super.onBackPressed();
                }else{
                    mPager.setCurrentItem(mPager.getCurrentItem()-1);
                }
            }
    */
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            //return new ScreenSlidePageFragment();

            return InstrFragment.newInstance(position);

        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

    }

}