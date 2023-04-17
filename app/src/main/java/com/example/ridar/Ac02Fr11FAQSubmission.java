package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.11
// FAQ Submit a Question
/*
    TextView [ThankYouForQuestionTextView]
    EditText [NameEditText, EmailAddressEditText, QuestionEditText]
    Button [BackButton (to Ac02Fr10FAQ), SubmitButton (to Ac02Fr01Home)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - notify admin via email or push notification
 *   - if question is appropriate and applicable to many add to faq list
 *   - if specific to single user respond to user via email and/or text
 */

public class Ac02Fr11FAQSubmission extends Fragment {

    public Ac02Fr11FAQSubmission() {
    }

    public static Ac02Fr11FAQSubmission newInstance() {
        Ac02Fr11FAQSubmission fragment = new Ac02Fr11FAQSubmission();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr11_f_a_q_submission, container, false);
    }
}