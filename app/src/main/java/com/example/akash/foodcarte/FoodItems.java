package com.example.akash.foodcarte;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FoodItems extends AppCompatActivity {
    CheckBox rajma,chole,sandwitch,thali,kadi,momos;
    DatabaseReference Canteen1ref, Canteen2ref,Canteen3ref, Canteen4ref;
    String email;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_items);
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();


        rajma = (CheckBox)findViewById(R.id.checkBox);
        chole = (CheckBox)findViewById(R.id.checkBox2);
        sandwitch = (CheckBox)findViewById(R.id.checkBox3);
        thali = (CheckBox)findViewById(R.id.checkBox4);
        kadi = (CheckBox)findViewById(R.id.checkBox5);
        momos = (CheckBox)findViewById(R.id.checkBox6);
        submit = (Button)findViewById(R.id.button2);

        Canteen1ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen1");
        Canteen2ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen2");
        Canteen3ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen3");
        Canteen4ref = FirebaseDatabase.getInstance().getReferenceFromUrl("https://food-carte.firebaseio.com/Canteen4");


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch(user.getEmail()){

                    case  "canteen1@gmail.com" :
                                                items(Canteen1ref);
                                                break;
                    case "canteen2@gmail.com" :
                                                items(Canteen2ref);
                                                break;
                    case "canteen3@gamil.com" :
                                                items(Canteen3ref);
                                                break;

                    case "canteen4@gmail.com":
                                                items(Canteen4ref);
                                                break;

                }



                FirebaseAuth.getInstance().signOut();
                finish();

            }
        });

    }

    public void items(DatabaseReference reference){
        DatabaseReference data;
        String key,value;
        if (rajma.isChecked()) {
            key = "Item1";
            value = "Rajma Rice";
            data = reference.child(key);
            data.setValue(value);

        }
        if (chole.isChecked()) {
            key = "Item2";
            value = "Chole Rice";
            data = reference.child(key);
            data.setValue(value);

        }
        if (sandwitch.isChecked()) {
            key = "Item3";
            value = "Grilled Sandwitch";
            data = reference.child(key);
            data.setValue(value);

        }
        if (thali.isChecked()) {
            key = "Item4";
            value = "Veg Thali";
            data = reference.child(key);
            data.setValue(value);

        }
        if(kadi.isChecked()){
            key="Item5";
            value="Kadi Rice";
            data = reference.child(key);
            data.setValue(value);
        }
        if (momos.isChecked()) {
            key = "Item6";
            value = "Momos";
            data = reference.child(key);
            data.setValue(value);

        }
    }
}
