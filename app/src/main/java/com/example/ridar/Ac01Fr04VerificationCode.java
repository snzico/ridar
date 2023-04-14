package com.example.ridar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
fragment 01.04:
VerificationCode
TextView ["Enter Code:"]
EditText [VerificationCodeEditText]
Button [VerifyCodeButton (to Ac01Fr05ResetPassword), BackButton (to Ac01Fr03ForgotPassword)]
*/

public class Ac01Fr04VerificationCode extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    TextView VerificationCodeTextView;
    EditText VerificationCodeEditText;
    Button VerifyCodeButton, BackButton;

    public Ac01Fr04VerificationCode() {
        // Required empty public constructor
    }

    public static Ac01Fr04VerificationCode newInstance() {
        Ac01Fr04VerificationCode fragment = new Ac01Fr04VerificationCode();
        /*
        passed parameters:
        String param1, String param2

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
        /*if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        } */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*
        component declarations
        */
        VerificationCodeTextView = getView().findViewById(R.id.VerificationCodeTextView);
        VerificationCodeEditText = getView().findViewById(R.id.VerificationCodeEditText);
        VerifyCodeButton = getView().findViewById(R.id.VerifyCodeButton);
        BackButton = getView().findViewById(R.id.BackButton);
        /*
        component methods
        */
        VerificationCodeEditText.addTextChangedListener(new TextWatcher() {
            /* ^ This method is used multiple times ^ */
            public void beforeTextChanged (CharSequence sequence, int initial, int count, int after) {}
            public void onTextChanged (CharSequence sequence, int initial, int count, int after) {}
            public void afterTextChanged (Editable sequence) {
                /*
                - if left empty or incorrect number of characters notify user and make VerifyCodeButton un-clickable programmatically
                - else make VerifyCodeButton clickable programmatically
                */
            }
        });
        VerifyCodeButton.setOnClickListener((view) -> {
            /*
            - check that code matches
            - if so navigate to Ac01Fr05ResetPassword
            - else notify user and ask if they would like to try again
                - if so re-navigate to same fragment (Ac01Fr04VerificationCode) and send new code
                - else return to Ac01Fr01Login
            */
        });
        BackButton.setOnClickListener((view) -> {
            /*
            - navigate to Ac01Fr01Login
            */
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac01_fr04_verification_code, container, false);
    }
}