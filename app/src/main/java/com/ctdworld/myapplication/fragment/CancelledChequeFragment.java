package com.ctdworld.myapplication.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ctdworld.myapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CancelledChequeFragment extends Fragment {


    public CancelledChequeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_cancelled_cheque, container, false);
        return  v;
    }

}
