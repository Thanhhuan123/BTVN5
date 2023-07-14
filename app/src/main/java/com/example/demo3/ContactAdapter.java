package com.example.demo3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactAdapter extends BaseAdapter {
    Context context;
    ArrayList<Contact> contactList;

    public ContactAdapter(Context context, ArrayList<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;

    }


    @Override
    public int getCount() {

        return contactList.size();
    }


    @Override
    public Object getItem(int position) {

        return contactList.get(position);
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate();
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return null;
    }
    public static class ViewHolder{
        TextView tvAlbumId,tvId,tvTitle,tvUrl,tvThumbnailUrl;
    }
}
