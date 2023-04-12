package com.example.ridar;
/*
Activity 01
Login
ImageView [LogoBannerImageView]
TextView ["Number of Users: ", NumberOfUsersCounterTextView, VersionNumberTextView]
^ https://developer.android.com/reference/android/widget/TextView ^

- Nested Fragments -

fragment 01.01:
Login
TextView ["Log-in"]
EditText [IdentifierEditText, PasswordEditText]
Button [LoginButton (to MainActivity), RegisterButton (to Ac01Fr02Register), ForgotPasswordButton (to Ac01Fr03ForgotPassword)]

fragment 01.02:
Register
TextView ["Register Account"]
EditText [FirstNameEditText, LastNameEditText, EmailEditText, PasswordEditText]
DatePickerDialog [BirthdayDatePickerDialog]
^ https://developer.android.com/develop/ui/views/components/pickers?authuser=1 ^
CheckBox [TSACheckBox]
^ https://developer.android.com/develop/ui/views/components/checkbox ^
Button [SignUpButton (to Ac01Fr01Login ["Please verify account." TextView added]), SignInButton (to Ac01Fr01Login),

fragment 01.03:
ForgotPassword
TextView ["Forgot Password"]
EditText [IdentifierEditText]
Button [VerifyButton (to Ac01Fr04VerificationCode), SignInButton (to Ac01Fr01Login)]

fragment 01.04:
VerificationCode
TextView ["Enter Code:"]
EditText [VerificationCodeEditText]
Button [ResetPasswordButton (to Ac01Fr05ResetPassword), BackButton (to Ac01Fr03ForgotPassword)]

fragment 01.05:
ResetPassword
TextView ["Enter new password:"]
EditText [NewPasswordEditText, ConfirmPasswordEditText]
Button [ConfirmButton (to Ac01Fr01Login ["Password successfully reset. Please login." TextView added]), BackButton (to Ac01Fr03ForgotPassword)]
*/

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}