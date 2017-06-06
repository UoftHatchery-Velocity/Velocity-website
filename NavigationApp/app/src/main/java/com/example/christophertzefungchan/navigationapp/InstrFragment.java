package com.example.christophertzefungchan.navigationapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * .
 */

public class InstrFragment extends Fragment {
    public static final String EXTRA_PICNUM="com.velocity.InstrSlide.picNum";
    private ImageView mImageView;
    private Integer mPic;
    private TextView mTextView;//TO DELETTE (or not)


    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //Get information about which picture to display
        Integer picNum=(Integer)getArguments().getInt(EXTRA_PICNUM);
        mPic=PicBank.get(getActivity()).getPic(picNum);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_instr, container, false);

        mImageView=(ImageView)v.findViewById(R.id.instr_pic);
        mImageView.setImageResource(mPic);

        //TO DELETE (or not)--------------------------------------
        //mTextView=(TextView)v.findViewById(R.id.placeholder);
        //mTextView.setText (Integer.toString(mPic));

        //-----------------------------------------------
        return v;
    }

    public static InstrFragment newInstance (Integer picNum){
        Bundle args = new Bundle();
        args.putInt(EXTRA_PICNUM,picNum);

        InstrFragment fragment = new InstrFragment();
        fragment.setArguments(args);

        return fragment;
    }
}
