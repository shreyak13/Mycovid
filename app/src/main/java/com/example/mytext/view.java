package com.example.mytext;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class view extends AppCompatActivity {
    private ImageView dimageView;
    TextView textView,textView1,textView2,textView3,textView4;
    View v;

   FirebaseDatabase fbase;
   DatabaseReference dref;
   String dataid;
   holddata data;

    RecyclerView recyclerViewsSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);



        Bundle extras = getIntent().getExtras();






       dimageView =findViewById(R.id.imageView1);
        textView=findViewById(R.id.sname);
        textView1=findViewById(R.id.stype);
        textView2=findViewById(R.id.sbed);
        textView3=findViewById(R.id.saddress);
        textView4=findViewById(R.id.scontact);
        String name = extras.getString("Name");
        String bed = extras.getString("bed");
        String type = extras.getString("type");
        String address = extras.getString("address");
        String contact = extras.getString("contact");

        textView.setText(name);
        textView1.setText(type);
        textView2.setText(bed);
        textView3.setText(address);
        textView4.setText(contact);

      //  holddata Holdata=(holddata)bundle.putSerializable("key");
       // textView.setText(Holdata.getName());




       // fbase=FirebaseDatabase.getInstance();
        //dref=fbase.getReference("Hospitals");

       // dataid=getIntent().getStringExtra("id");

       // loadhospital(dataid);



      //  textView.setText(getIntent().getStringExtra("name"));
       // textView1.setText(getIntent().getStringExtra("type"));


      /*  DatabaseReference databaseReference= FirebaseDatabase.getInstance().getReference().child("Hospitals");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                holddata holddatab=snapshot.getValue(holddata.class);
                textView2.setText(holddatab.getBed());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });





*/

    }

    /*private void loadhospital(String dataid) {
        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                data=snapshot.child(dataid).getValue(holddata.class);
               // Picasso.with(getBaseContext()).load(data.getImage()).into(dimageView);
                textView2.setText(data.getBed());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }*/

}