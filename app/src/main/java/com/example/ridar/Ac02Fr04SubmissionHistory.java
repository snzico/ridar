package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

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
    String submissionCustomerName;
    List<Submission> submissionList = new ArrayList<>();

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

    private void submissionData () {
        // get list of Customer type
        // set submissionName to CustomerName
        // add each variable from Customer to submission List

        Submission submission1 = new Submission();
        Submission submission2 = new Submission();
        Submission submission3 = new Submission();
        Submission submission4 = new Submission();

        String submission1Name = "Becky A";
        submission1.setSubmissionCustomerName(submission1Name);
        submission1.setSubmissionCustomerAddress("DEFAULT ADDRESS");
        submission1.setSubmissionCustomerRating(4);
        submission1.setSubmissionCustomerAttributes("Rude to Driver.");

        String submission2name = "charles c";
        submission2.setSubmissionCustomerName(submission1Name);
        submission2.setSubmissionCustomerAddress("DEFAULT ADDRESS");
        submission2.setSubmissionCustomerRating(1);
        submission2.setSubmissionCustomerAttributes("Other: No Pants, Low Tip.");

        String submission3Name = "velvet t";
        submission3.setSubmissionCustomerName(submission1Name);
        submission3.setSubmissionCustomerAddress("DEFAULT ADDRESS");
        submission3.setSubmissionCustomerRating(3);
        submission3.setSubmissionCustomerAttributes("No Tip.");

        String submission4Name = "Andrew Callaghan";
        submission4.setSubmissionCustomerName(submission1Name);
        submission4.setSubmissionCustomerAddress("DEFAULT ADDRESS");
        submission4.setSubmissionCustomerRating(5);
        submission4.setSubmissionCustomerAttributes("NONE");

        submissionList.add(submission1);
        submissionList.add(submission2);
        submissionList.add(submission3);
        submissionList.add(submission4);

        for (Submission submission : submissionList) {

        }
    }
}