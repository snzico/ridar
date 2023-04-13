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
fragment 01.03:
ForgotPassword
TextView ["Forgot Password"]
EditText [IdentifierEditText]
Button [ResetPasswordButton (to Ac01Fr04VerificationCode), SignInButton (to Ac01Fr01Login)]
 */

public class Ac01Fr03ForgotPassword extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    TextView ForgotPasswordTextView;
    EditText IdentifierEditText;
    Button ResetPasswordButton, SignInButton;

    public Ac01Fr03ForgotPassword() {
        // Required empty public constructor
    }

    public static Ac01Fr03ForgotPassword newInstance(String param1, String param2) {
        Ac01Fr03ForgotPassword fragment = new Ac01Fr03ForgotPassword();
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
        /*
        component declarations
         */
        ForgotPasswordTextView = getView().findViewById(R.id.ForgotPasswordTextView);
        IdentifierEditText = getView().findViewById(R.id.IdentifierEditText);
        ResetPasswordButton = getView().findViewById(R.id.ConfirmNewPasswordButton);
        SignInButton = getView().findViewById(R.id.SignInButton);
        /*
        component methods
         */
        ForgotPasswordTextView.setText("Reset Password.");
        IdentifierEditText.addTextChangedListener(new TextWatcher() {
            /* ^ This method is used multiple times ^ */
            public void afterTextChanged (Editable sequence) {}
            public void beforeTextChanged (CharSequence sequence, int initial, int count, int after) {}
            public void onTextChanged (CharSequence sequence, int initial, int count, int after) {
                if (Character.isDigit(sequence.charAt(0))) {
                    IdentifierEditText.setAutofillHints(View.AUTOFILL_HINT_PHONE);
                    IdentifierEditText.setInputType(InputType.TYPE_CLASS_PHONE);
                } else {
                    IdentifierEditText.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                }
            }
        });
        ResetPasswordButton.setOnClickListener((view) -> {
            /*
            - check server to ensure email/phone number exists in user database
            - send instruction to server to send reset email and/or phone call/text
            - navigate back to Ac01Fr01Login and autofill IdentifierEditText with identifier value entered on Ac01Fr03ForgotPassword
            */
        });
        SignInButton.setOnClickListener((view) -> {
            /*
            - navigate to Ac01Fr01Login
            */
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac01_fr03_forgot_password, container, false);
    }
}