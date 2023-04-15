package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.07
// View Submission Details
/*
    TextView [CustomerNameTextView, CustomerAddressTextView, ReviewTextView, StarRatingTextView, CommonIssuesTextView]
    Button [BackButton (to Ac02Fr05SearchResults)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - show full details of submission
 *   - single submission from search, submission history, or search results history on menu item click
 */

public class Ac02Fr07ViewSubmission extends Fragment {

    public Ac02Fr07ViewSubmission() {
    }

    public static Ac02Fr07ViewSubmission newInstance() {
        Ac02Fr07ViewSubmission fragment = new Ac02Fr07ViewSubmission();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr07_view_submission, container, false);
    }
}