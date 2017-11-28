package io.github.ziginsider.firebasedemo.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import io.github.ziginsider.firebasedemo.Model.User;
import io.github.ziginsider.firebasedemo.R;

/**
 * Created by zigin on 28.11.2017.
 */

public class ListViewAdapter extends BaseAdapter {

    Activity activity;
    List<User> listUsers;
    LayoutInflater inflater;

    public ListViewAdapter(Activity activity, List<User> listUsers) {
        this.activity = activity;
        this.listUsers = listUsers;
    }

    @Override
    public int getCount() {
        return listUsers.size();
    }

    @Override
    public Object getItem(int i) {
        return listUsers.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        inflater = (LayoutInflater) activity
                .getBaseContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.listview_item, null);

        TextView txtUser = (TextView) itemView.findViewById(R.id.txt_name);
        TextView txtEmail = (TextView) itemView.findViewById(R.id.txt_email);

        txtUser.setText(listUsers.get(i).getName());
        txtEmail.setText(listUsers.get(i).getEmail());

        return  itemView;
    }
}
