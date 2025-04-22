package com.example.simulacroexamen;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    List<User> users;

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item, parent, false);
        return new ViewHolder(view, users);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txvName.setText(users.get(position).name);
        holder.itemView.setOnClickListener(v -> {
            Intent i = new Intent(v.getContext(), UserDetailActivity.class);
            i.putExtra("NAME", users.get(position).name);
            i.putExtra("PHONE", users.get(position).phone);
            v.getContext().startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txvName;

        public ViewHolder(@NonNull View itemView, List<User> users) {
            super(itemView);
            this.txvName = itemView.findViewById(R.id.txvName);
        }

    }
}
