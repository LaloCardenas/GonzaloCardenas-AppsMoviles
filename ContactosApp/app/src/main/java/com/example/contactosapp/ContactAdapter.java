package com.example.contactosapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txvName;
        TextView txvPhone;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txvName = itemView.findViewById(R.id.txvName);
            this.txvPhone = itemView.findViewById(R.id.txvPhone);
        }

        public void setName(String txvName) {
            this.txvName.setText(txvName);
        }

        public void setPhone(String txvPhone) {
            this.txvPhone.setText(txvPhone);
        }
    }

    ContactStore dataSource;

    public ContactAdapter() {
        this.dataSource = new ContactStore();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = dataSource.get(position);
        holder.setName(contact.getName());
        holder.setPhone(contact.getPhone());
        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(v.getContext(), DetailActivity.class);
            i.putExtra(BundleConstants.CONTACT_PHONE, contact.getPhone());
            v.getContext().startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return this.dataSource.size();
    }
}
