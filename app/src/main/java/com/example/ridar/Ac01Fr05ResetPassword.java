package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// fragment 01.05
// Reset Password
/*
fragment 01.05:
ResetPassword
TextView ["Enter new password:"]
EditText [NewPasswordEditText, ConfirmNewPasswordEditText]
Button [ConfirmNewPasswordButton (to Ac01Fr01Login ["Password successfully reset. Please login." TextView added]), BackButton (to Ac01Fr03ForgotPassword)]
 */

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - fix findViewById null pointer exception
 *   - ensure correct verification code was entered
 *      - possibly utilize a token system of some sort
 */

public class Ac01Fr05ResetPassword extends Fragment {
    TextView ResetPasswordTextView;
    EditText NewPasswordEditText, ConfirmNewPasswordEditText;
    Button ConfirmNewPasswordButton, BackButton;

    public Ac01Fr05ResetPassword() {
    }

    public static Ac01Fr05ResetPassword newInstance() {
        Ac01Fr05ResetPassword fragment = new Ac01Fr05ResetPassword();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ResetPasswordTextView = getView().findViewById(R.id.ResetPasswordTextView);
        NewPasswordEditText = getView().findViewById(R.id.NewPasswordEditText);
        ConfirmNewPasswordEditText = getView().findViewById(R.id.ConfirmNewPasswordEditText);
        ConfirmNewPasswordButton = getView().findViewById(R.id.ConfirmNewPasswordButton);
        BackButton = getView().findViewById(R.id.BackButton);

        NewPasswordEditText.addTextChangedListener(new TextWatcher() {
            /* ^ repeated code from Ac01Fr02Register -> create separate method for reuse ^ */
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Check off strong password requirements as they are met, or uncheck them as they are removed
            }
            @Override
            public void afterTextChanged(Editable s) {
                if (NewPasswordEditText.getText().toString().isEmpty()) {
                    // Prompt user to enter password
                }
                // Confirm password is strong and doesn't contain forbidden characters
            }
        });
        ConfirmNewPasswordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                // Confirm NewPasswordEditText and ConfirmNewPasswordEditText match exactly
            }
        });

        return inflater.inflate(R.layout.fragment_ac01_fr05_reset_password, container, false);
    }
}