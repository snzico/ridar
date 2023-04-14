package com.example.ridar;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;
    private List<Customer> customerList = null;
    private ArrayList<Customer> customerArrayList;

    public ListViewAdapter (Context context, List<Customer> customerList) {
        this.context = context;
        this.customerList = customerList;
        this.customerArrayList = new ArrayList<Customer>();
        this.customerArrayList.addAll(customerList);

        inflater = LayoutInflater.from(this.context);
    }

    public class CurrentView {
        TextView customerName;
    }

    @Override
    public int getCount() {
        return customerList.size();
    }

    @Override
    public Customer getItem(int i) {
        return customerList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final CurrentView current;
        if (view == null) {
            current = new CurrentView();
            view = inflater.inflate(R.layout.searchview_items, null);
            current.customerName = view.findViewById(R.id.customer_textview);
            view.setTag(current);
        } else {
            current = (CurrentView) view.getTag();
        }

        current.customerName.setText(customerList.get(i).getCustomerName());
        return view;
    }

    public void filter (String text) {
        text = text.toLowerCase(Locale.getDefault());
        customerList.clear();

        if (text.length() == 0) {
            customerList.addAll(customerArrayList);
        } else {
            for (Customer name : customerArrayList) {
                if (name.getCustomerName().toLowerCase(Locale.getDefault()).contains(text)) {
                    customerList.add(name);
                }
            }
        }

        notifyDataSetChanged();
    }
}
