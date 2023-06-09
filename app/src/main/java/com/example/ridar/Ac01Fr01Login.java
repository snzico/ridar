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

// fragment 01.01
// Login
/*
fragment 01.01:
        Login
        TextView ["Log-in"]
        EditText [IdentifierEditText, PasswordEditText]
        Button [LoginButton (to MainActivity), RegisterButton (to Ac01Fr02Register), ForgotPasswordButton (to Ac01Fr03ForgotPassword)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - fix findViewById null pointer exception
 */

public class Ac01Fr01Login extends Fragment {
    TextView LoginTextView;
    EditText IdentifierEditText, PasswordEditText;
    Button LoginButton, RegisterButton, ForgotPasswordButton;

    public Ac01Fr01Login() {
    }

    public static Ac01Fr01Login newInstance() {
        Ac01Fr01Login fragment = new Ac01Fr01Login();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LoginTextView = getView().findViewById(R.id.LoginTextView);
        IdentifierEditText = getView().findViewById(R.id.IdentifierEditText);
        PasswordEditText = getView().findViewById(R.id.PasswordEditText);
        LoginButton = getView().findViewById(R.id.LoginButton);
        RegisterButton = getView().findViewById(R.id.RegisterButton);
        ForgotPasswordButton = getView().findViewById(R.id.ForgotPasswordButton);

        // determine if email address or phone number
        /*
        component methods
        for IdentifierEditText:
                - check if first character is digit or not
                - if digit assign inputType to phone number:
                    - if a non-digit is entered throw exception
                    - after 10 digits auto-tab to PasswordEditText
                - otherwise assign inputType to email
                    - make sure it has appropriate ending
                        - @domain.tld
         */

        IdentifierEditText.addTextChangedListener(new TextWatcher() {
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
        PasswordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
        PasswordEditText.addTextChangedListener(new TextWatcher() {
            public void beforeTextChanged (CharSequence sequence, int initial, int count, int after) {}
            public void onTextChanged (CharSequence sequence, int initial, int count, int after) {}
            public void afterTextChanged (Editable sequence) {
                if (PasswordEditText.getText().toString().isEmpty()) {
                    // Prompt user to enter password
                }
            }
        });
        LoginButton.setOnClickListener((view) -> {
                // Check that both EditText have appropriate user input
                // to MainActivity Activity
        });
        RegisterButton.setOnClickListener((view) -> {
                // to Ac01Fr02Register Fragment
        });
        ForgotPasswordButton.setOnClickListener((view) -> {
                // to Ac01Fr03ForgotPassword Fragment
        });

        return inflater.inflate(R.layout.fragment_ac01_fr01_login, container, false);
    }
}