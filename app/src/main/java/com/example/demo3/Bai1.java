package com.example.demo3;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Bai1 extends AsyncTask<Void,Void,Void> {

    private String url = "https://jsonplaceholder.typicode.com/photos";
    ArrayList<Contact> contactList;
    private ListView listView;
    Context context;
    ContactAdapter adapter;

    public Bai1(Context context,ListView listView){
        this.listView = listView;
        this.context = context;
        contactList = new ArrayList<>();

    }

    @Override
    protected void onPostExecute(Void unused) {
        super.onPostExecute(unused);
        adapter = new ContactAdapter(context,contactList);
        listView.setAdapter(adapter);
    }

    @Override
    protected Void doInBackground(Void... voids) {
        HttpHandle handle = new HttpHandle();
        String json = handle.convertStream(url);
        if (json != null)
        {
            try {
                JSONObject jsonObject = new JSONObject(json);
                JSONArray contacts = jsonObject.getJSONArray("");
                for (int i = 0; i< contacts.length();i++){
                    JSONObject c = contacts.getJSONObject(i);
                    String albumId = c.getString("albumId");
                    String id = c.getString("id");
                    String title = c.getString("title");
                    String url = c.getString("url");
                    String thumbnailUrl = c.getString("thumbnailUrl");

                    Contact contact = new Contact();
                    contact.setAlbumId(albumId);
                    contact.setAlbumId(id);
                    contact.setAlbumId(title);
                    contact.setAlbumId(url);
                    contact.setAlbumId(thumbnailUrl);

                    contactList.add(contact);

                }

            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
