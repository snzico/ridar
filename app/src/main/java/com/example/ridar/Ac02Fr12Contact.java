package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.12
// Contact Us
/*
    TextView [CompanyNameTextView, CompanyEmailTextView]
    EditText [NameEditText, EmailEditText, PhoneNumberEditText, ConcernEditText]
    CheckBox [ContestReviewCheckBox]
    Button [SubmitButton (to Ac01Fr01Home)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - compile contact information
 *   - style contact submission form
 */

public class Ac02Fr12Contact extends Fragment {

    public Ac02Fr12Contact() {
    }

    public static Ac02Fr12Contact newInstance() {
        Ac02Fr12Contact fragment = new Ac02Fr12Contact();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr12_contact, container, false);
    }
}