package com.example.ridar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class Ac02Fr02Search extends Fragment implements SearchView.OnQueryTextListener {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    SearchView searchView;
    ListView suggestions;
    ListViewAdapter suggestionsAdapter;
    /*
    TODO
    Get customerData from SQL database
     */
    String[] customerData;
    ArrayList<Customer> customerArrayList = new ArrayList<Customer>();
    public Ac02Fr02Search() {
        // Required empty public constructor
    }

    public static Ac02Fr02Search newInstance() {
        Ac02Fr02Search fragment = new Ac02Fr02Search();
        /*
        passed parameters:
        String param1, String param2

        args from parameters passed in class definition
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        */
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        } */
    }

    @Override
    public boolean onQueryTextSubmit (String query) {
                /*
                Search "name" and "address" fields of customer data
                 */
        return false;
    }

    @Override
    public boolean onQueryTextChange (String query) {
        String input = query;
        suggestionsAdapter.filter(input);
        return false;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        customerData = new String[] {"Becky A", "charles c", "velvet t", "Andrew Callaghan"};
        suggestions = getView().findViewById(R.id.suggestions);

        for (int i = 0; i < customerData.length; i++) {
            Customer customer = new Customer(customerData[i]);
            customerArrayList.add(customer);
        }

        suggestionsAdapter = new ListViewAdapter(getContext(), customerArrayList);
        suggestions.setAdapter(suggestionsAdapter);

        searchView = (SearchView) getView().findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(this);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac02_fr02_search, container, false);
    }
}