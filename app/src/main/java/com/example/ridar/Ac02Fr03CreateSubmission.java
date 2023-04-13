package com.example.ridar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
fragment 02.03
CreateSubmission
    EditText [CustomerNameEditText, CustomerAddressEditText, ReviewEditText]
    RatingBar [CustomerRatingBar]
    ^ https://developer.android.com/reference/android/widget/RatingBar ^
    CheckBox [LowTipCheckBox, RudeCheckBox, CanceledOrderCheckBox, BadReviewCheckBox, BadCommunicationCheckBox]
    *Intent [FilePickerIntent]
    ^ https://www.youtube.com/watch?v=ZpJ66yzj8pM ^
    ^ https://developers.google.com/android-publisher/upload ^
    ^ https://talkjs.com/resources/chat-file-upload-android/ ^
    Button [SubmitButton (to Ac02Fr06SuccessfulSubmission)
    *For submitting proof*
    *May be better element type for uploading file*
*/

public class Ac02Fr03CreateSubmission extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    public Ac02Fr03CreateSubmission() {
        // Required empty public constructor
    }

    public static Ac02Fr03CreateSubmission newInstance(String param1, String param2) {
        Ac02Fr03CreateSubmission fragment = new Ac02Fr03CreateSubmission();
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
        return inflater.inflate(R.layout.fragment_ac02_fr03_create_submission, container, false);
    }
}