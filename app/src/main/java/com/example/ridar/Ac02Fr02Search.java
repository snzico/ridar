package com.example.ridar;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import android.widget.Toast;
import java.util.ArrayList;

// fragment 02.02
// Search

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - order methods for best resource management and readability
 *   - style recyclerview
 *   - get data from server instead of string array
 */

public class Ac02Fr02Search extends Fragment {
    SearchView searchView;
    RecyclerView customersRecyclerView;
    CustomerAdapter customerAdapter;
    String[] customerData;
    ArrayList<Customer> customerArrayList = new ArrayList<>();

    public Ac02Fr02Search() {
    }

    public static Ac02Fr02Search newInstance() {
        Ac02Fr02Search fragment = new Ac02Fr02Search();
        Log.d("newInstanceReached", "<-- newInstance reached. -->\n\n");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        Log.d("onCreateReached", "<-- onCreate reached. -->\n\n");

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_item);
        searchView = (SearchView) menuItem.getActionView();
        Log.d("onCreateOptionMenuReached", "<-- onCreateOptionsMenu reached.\ninflater, menuItem, and searchView instantiated. -->\n\n");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                Log.d("onQueryTextChangeReached", "<-- onQueryTextChange reached.\nchange made to searchView query. -->\n\n");
                filter(s);
                return false;
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ac02_fr02_search, container, false);
        customersRecyclerView = view.findViewById(R.id.search_suggestions_recyclerview);
        buildRecyclerView();
        Log.d("onCreateViewReached", "<-- onCreateView reached.\nview and customersRecycleViewer instantiated.\nrecycler view built. -->\n\n");
        return view;
    }

    public void filter (String s) {
        ArrayList<Customer> list = new ArrayList<>();
        for (Customer customer : customerArrayList) {
            String customerName = customer.getCustomerName();
            Log.d("newCustomerReached", "<-- customer " + customerName + " reached. -->\n\n");
            if (customer.getCustomerName().toLowerCase().contains(s.toLowerCase())) {
                list.add(customer);
                Log.d("newCustomerAdded", "<-- customer " + customerName + " added to filtered list. -->\n\n");
            }
        }
        if (!(list.isEmpty())) {
            Log.d("listNotEmpty", "<-- filtered list is not empty.\ncasting filtered list to customerAdapter. -->\n\n");
            customerAdapter.filterList(list);
            Log.d("customerAdapterListCast", "<-- filtered list successfully cast to customerAdapter. -->\n\n");
        } else {
            Log.d("listEmpty", "<-- filtered list is empty.\nno customer in database matches query. -->\n\n");
        }
    }

    public void buildRecyclerView () {
        customerData = new String[]{"Becky A", "charles c", "velvet t", "Andrew Callaghan"};
        Log.d("customerDataCreated", "<-- customers added to customerData String array. -->\n\n");
        // Toast.makeText(getActivity(), "Customer data loaded.", Toast.LENGTH_SHORT);
        for (int i = 0; i < customerData.length; i++) {
            Customer customer = new Customer(customerData[i]);
            customerArrayList.add(customer);
            String newCustomer = "<-- customer " + customerArrayList.get(customerArrayList.size() - 1).getCustomerName() + " data loaded. -->\n\n";
            Log.d("customerAddedToArrayList", newCustomer);
        }

        customerAdapter = new CustomerAdapter(customerArrayList);
        customersRecyclerView.setAdapter(customerAdapter);
        Log.d("customerAdapterSetForRecyclerView", "<-- customerRecyclerView adapter set. -->\n\n");
    }
}