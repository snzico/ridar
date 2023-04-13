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
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

/*
fragment 01.02:
Register
TextView ["Register Account"]
EditText [FirstNameEditText, LastNameEditText, EmailAddressEditText, PhoneNumberEditText, PasswordEditText, ConfirmPasswordEditText]
DatePickerDialog [BirthdayDatePickerDialog]
^ https://developer.android.com/develop/ui/views/components/pickers?authuser=1 ^
CheckBox [TSACheckBox]
^ https://developer.android.com/develop/ui/views/components/checkbox ^
Button [SignUpButton (to Ac01Fr01Login ["Please verify account." TextView added]), SignInButton (to Ac01Fr01Login),
 */

public class Ac01Fr02Register extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    Boolean TSAAcceptedBoolean;
    TextView RegisterTextView;
    EditText FirstNameEditText, LastNameEditText, EmailAddressEditText, PhoneNumberEditText, PasswordEditText, ConfirmPasswordEditText;
    DatePicker BirthdayDatePicker;
    CheckBox TSACheckBox;
    Button SignUpButton, SignInButton;
    public Ac01Fr02Register() {
        // Required empty public constructor
    }

    public static Ac01Fr02Register newInstance(String param1, String param2) {
        Ac01Fr02Register fragment = new Ac01Fr02Register();
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
        RegisterTextView = getView().findViewById(R.id.RegisterTextView);
        FirstNameEditText = getView().findViewById(R.id.FirstNameEditText);
        LastNameEditText = getView().findViewById(R.id.LastNameEditText);
        EmailAddressEditText = getView().findViewById(R.id.EmailAddressEditText);
        PhoneNumberEditText = getView().findViewById(R.id.PhoneNumberEditText);
        PasswordEditText = getView().findViewById(R.id.PasswordEditText);
        ConfirmPasswordEditText = getView().findViewById(R.id.ConfirmPasswordEditText);
        BirthdayDatePicker = getView().findViewById(R.id.BirthdayDatePicker);
        /* ^ https://developer.android.com/develop/ui/views/components/pickers ^ */
        TSACheckBox = getView().findViewById(R.id.TSACheckBox);
        SignUpButton = getView().findViewById(R.id.SignUpButton);
        SignInButton = getView().findViewById(R.id.RelativeLayout);
        /*
        component methods
         */
        FirstNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {}
        });
        LastNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {}
        });
        EmailAddressEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {}
        });
        PhoneNumberEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {}
        });
        PasswordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        PasswordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Check off strong password requirements as they are met, or uncheck them as they are removed
            }
            @Override
            public void afterTextChanged(Editable s) {
                if (PasswordEditText.getText().toString().isEmpty()) {
                    // Prompt user to enter password
                }
                // Confirm password is strong and doesn't contain forbidden characters
            }
        });
        ConfirmPasswordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                // Confirm PasswordEditText and ConfirmPasswordEditText match exactly
            }
        });
        TSACheckBox.setOnCheckedChangeListener((view, isChecked) -> {
            if (isChecked) {
                TSAAcceptedBoolean = true;
            } else {
                TSAAcceptedBoolean = false;
            }
        });
        SignUpButton.setOnClickListener((view) -> {
            /*
            verify correct information type in each component
                - if TSAAcceptedBoolean !true notify user to read and accept
            submit user object to server
            */
        });
        SignInButton.setOnClickListener((view) -> {
            /*
            Navigate back to Ac01Fr01Login fragment
            */
        });
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac01_fr02_register, container, false);
    }
}