package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.04
// Submission History
/*
    RecyclerView [SubmissionRecyclerView]
    ^ https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list#0 ^
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - load user's submission history from server
 */

public class Ac02Fr04SubmissionHistory extends Fragment {

    public Ac02Fr04SubmissionHistory() {
    }

    public static Ac02Fr04SubmissionHistory newInstance() {
        Ac02Fr04SubmissionHistory fragment = new Ac02Fr04SubmissionHistory();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr04_submission_history, container, false);
    }
}