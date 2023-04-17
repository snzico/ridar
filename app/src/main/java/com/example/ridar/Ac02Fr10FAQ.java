package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.10
// FAQ
/*
    RecyclerView [FAQRecyclerView]
    Button [SubmitQuestionButton (to Ac02Fr11FAQSubmission), BackButton (to Ac02Fr01Home)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - compile list of questions and answers
 *   - custom menu item for question/answer pairs
 */

public class Ac02Fr10FAQ extends Fragment {

    public Ac02Fr10FAQ() {
    }

    public static Ac02Fr10FAQ newInstance() {
        Ac02Fr10FAQ fragment = new Ac02Fr10FAQ();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr10_f_a_q, container, false);
    }
}