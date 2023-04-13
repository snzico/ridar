package com.example.ridar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
fragment 02.04
SubmissionHistory
    RecyclerView [SubmissionRecyclerView]
    ^ https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list#0 ^
*/

public class Ac02Fr04SubmissionHistory extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    public Ac02Fr04SubmissionHistory() {
        // Required empty public constructor
    }

    public static Ac02Fr04SubmissionHistory newInstance(String param1, String param2) {
        Ac02Fr04SubmissionHistory fragment = new Ac02Fr04SubmissionHistory();
        /*
        args from parameters passed in class definition
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        */
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            /*
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            */
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac02_fr04_submission_history, container, false);
    }
}