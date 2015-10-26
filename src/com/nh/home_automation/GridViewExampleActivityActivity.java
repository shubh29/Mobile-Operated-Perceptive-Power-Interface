package com.nh.home_automation;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
 
public class GridViewExampleActivityActivity extends Activity {
    /** Called when the activity is first created. */
 
    private GridviewAdapter mAdapter;
    private ArrayList<String> listCountry;
    private ArrayList<Integer> listFlag;
 
    private GridView gridView;
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainold);
 
        prepareList();
 
        // prepared arraylist and passed it to the Adapter class
        mAdapter = new GridviewAdapter(this,listCountry, listFlag);
 
        // Set custom adapter to gridview
        gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(mAdapter);
 
        // Implement On Item click listener
        gridView.setOnItemClickListener(new OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                    long arg3) {
                Toast.makeText(GridViewExampleActivityActivity.this, mAdapter.getItem(position), Toast.LENGTH_SHORT).show();
            
               if(position==0)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,SMARTHOMEActivity.class);
            	   startActivity(i);             
            	   }
               if(position==1)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,BluetoothChat.class);
            	   startActivity(i);             
            	   }
               if(position==2)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,about.class);
            	   startActivity(i);            
            	   }
               if(position==3)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,help.class);
            	   startActivity(i);              
            	   }
               if(position==4)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,developer.class);
            	   startActivity(i);              
            	   }
               if(position==5)
               {
            	   Intent i=new Intent(GridViewExampleActivityActivity.this,contact.class);
            	   startActivity(i);               
            	   }
               
            }
            
        });
 
    }
 
    public void prepareList()
    {
          listCountry = new ArrayList<String>();
 
          listCountry.add("Bluetooth");
          listCountry.add("Control Devices");
          listCountry.add("About");
          listCountry.add("Help!");
          listCountry.add("Developers");
          listCountry.add("Contact");
          
 
          listFlag = new ArrayList<Integer>();
          listFlag.add(R.drawable.bt1);
          listFlag.add(R.drawable.home12345);
          listFlag.add(R.drawable.info123);
          listFlag.add(R.drawable.question123);
          listFlag.add(R.drawable.developers123);
          listFlag.add(R.drawable.emailicon123);
          
          
    }
}