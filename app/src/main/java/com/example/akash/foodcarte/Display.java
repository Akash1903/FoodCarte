package com.example.akash.foodcarte;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class Display extends AppCompatActivity {
    DatabaseReference Canteen1ref,Canteen2ref,Canteen3ref,Canteen4ref;
    ArrayList<String> data = new ArrayList<String>();
    ListView mlistview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Canteen1ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen1");
        Canteen2ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen2");
        Canteen3ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen3");
        Canteen4ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen4");
        mlistview = (ListView)findViewById(R.id.listView);
        final ArrayAdapter<String> arrayAdapter  = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        mlistview.setAdapter(arrayAdapter);

        Intent intent = getIntent();
        int ID = intent.getIntExtra("ID",0);
        if(ID == R.id.rolls) {
            Canteen4ref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value = String.valueOf(dataSnapshot.getValue());
                    data.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
        else if(ID == R.id.coke) {
            Canteen3ref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value = String.valueOf(dataSnapshot.getValue());
                    data.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }

        else if(ID == R.id.nescafe) {

            Canteen2ref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value = String.valueOf(dataSnapshot.getValue());
                    data.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }

        else {
            Canteen1ref.addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    String value = String.valueOf(dataSnapshot.getValue());
                    data.add(value);
                    arrayAdapter.notifyDataSetChanged();
                }

                @Override
                public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onChildRemoved(DataSnapshot dataSnapshot) {

                }

                @Override
                public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        }
    }
}
