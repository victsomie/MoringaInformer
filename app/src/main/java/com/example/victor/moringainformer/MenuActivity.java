package com.example.victor.moringainformer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Create the reference to specific items inside the ListView in the menu Layout

        ListView menuList = (ListView) findViewById(R.id.ListView_menu);

        // Create an array of strings and populate it with the items from the
        // string array declared in strings.xml
        String[] items= getResources().getStringArray(R.array.menu_items);


        // Create an array adapter to create the menu with the list items being
        // laid out as per list_item.xml and the item names from the items[]
        // array created above
        ArrayAdapter<String> adapt =  new ArrayAdapter<String>(this, R.layout.menu, items);
        menuList.setAdapter(adapt);






    }
}
