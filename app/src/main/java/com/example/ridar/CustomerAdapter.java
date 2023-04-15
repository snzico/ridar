package com.example.ridar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {
    private ArrayList<Customer> customerArrayList;

    public CustomerAdapter(ArrayList<Customer> customerArrayList) {
        this.customerArrayList = customerArrayList;
    }

    public void filterList (ArrayList<Customer> list) {
        customerArrayList = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.ViewHolder holder, int position) {
        Customer customer = customerArrayList.get(position);
        holder.customerNameTextView.setText(customer.getCustomerName());
        holder.customerAddressTextView.setText(customer.getCustomerAddress());
    }

    @Override
    public int getItemCount() {
        return customerArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView customerNameTextView;
        private final TextView customerAddressTextView;

        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            customerNameTextView = itemView.findViewById(R.id.customer_name_textview);
            customerAddressTextView = itemView.findViewById(R.id.customer_address_textview);
        }
    }
}
