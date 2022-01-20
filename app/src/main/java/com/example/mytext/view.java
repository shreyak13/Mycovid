package com.example.mytext;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class view extends hospital {
    private ImageView dimageView;
    TextView textView,textView1,textView2,textView3,textView4;
    View v;
    String s = getIntent().getStringExtra("key");
   FirebaseDatabase fbase;
   DatabaseReference dref;
   String dataid;
   holddata data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent=this.getIntent();
        Bundle bundle=intent.getExtras();

        dimageView =findViewById(R.id.imageView1);
        textView=findViewById(R.id.sname);
        textView1=findViewById(R.id.stype);
        textView2=findViewById(R.id.sbed);
        textView3=findViewById(R.id.saddress);
        textView4=findViewById(R.id.scontact);
       /* String name = getIntent().getStringExtra("Name");
        String bed = getIntent().getStringExtra("bed");
        String type = getIntent().getStringExtra("type");
        String address = getIntent().getStringExtra("address");
        String contact = getIntent().getStringExtra("contact");

        textView.setText(name);
        textView1.setText(type);
        textView2.setText(bed);
        textView3.setText(address);
        textView4.setText(contact);*/

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