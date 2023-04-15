package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.06
// Submission Success
/*
    TextView ["Review successfully submitted"]
    Button [BackButton (to Ac02Fr03CreateSubmission)
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - time out and navigate back to home
 */

public class Ac02Fr06SuccessfulSubmission extends Fragment {

    public Ac02Fr06SuccessfulSubmission() {
    }

    public static Ac02Fr06SuccessfulSubmission newInstance() {
        Ac02Fr06SuccessfulSubmission fragment = new Ac02Fr06SuccessfulSubmission();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr06_successful_submission, container, false);
    }
}