package com.example.christophertzefungchan.navigationapp;

import android.content.Context;

import java.util.ArrayList;

public class PicBank {
    //Creating a singleton
    private ArrayList<Integer> mPics;
    private ArrayList<String> mPicIds;
    private static PicBank sPicBank;
    private Context mAppContext;
    private int numOfPics;
    private PicBank (Context appContext){
        mAppContext=appContext;
        mPics=new ArrayList<Integer>();

        //--------------------------------DECLARE THE INSTRUCTION PICS HERE-------------------------

        mPics.add(R.drawable.instr_1);
        mPics.add(R.drawable.instr_2);
        mPics.add(R.drawable.instr_3);

        //------------------------------------------------------------------------------------------
    }

    public static PicBank get (Context c){
        if (sPicBank==null){
            sPicBank=new PicBank (c.getApplicationContext());
        }
        return sPicBank;
    }

    public ArrayList<Integer> getPics() {
        return mPics;
    }

    public Integer getPic (int picNum) {
        if (picNum<mPics.size())return mPics.get(picNum);
        return null;
    }
}