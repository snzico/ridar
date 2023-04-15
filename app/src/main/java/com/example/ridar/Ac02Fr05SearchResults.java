package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.05
// Search Results History
/*
    *RecyclerView [SearchResultsRecyclerView]
    Button [StartOverButton (to Ac02Fr02Search)]
    *May be a more appropriate view for Submissions type*
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - after user searches and finds delivery add customer to search results history
 *   - push to and pull from server
 */

public class Ac02Fr05SearchResults extends Fragment {

    public Ac02Fr05SearchResults() {
    }

    public static Ac02Fr05SearchResults newInstance() {
        Ac02Fr05SearchResults fragment = new Ac02Fr05SearchResults();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr05_search_results, container, false);
    }
}