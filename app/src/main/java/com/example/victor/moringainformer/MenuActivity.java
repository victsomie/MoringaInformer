package com.example.victor.moringainformer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Create the reference to the ListView in the menu Layout
        ListView menuList = (ListView) findViewById(R.id.ListView_menu);

        // Create an array of strings and populate it with the items from the
        // string array declared in strings.xml
        String[] items= getResources().getStringArray(R.array.menu_items);


        // Create an array adapter to create the menu with the list items being
        // laid out as per list_item.xml and the item names from the items[]
        // array created above
        ArrayAdapter<String> adapt =  new ArrayAdapter<String>(this, R.layout.list_item, items);
        menuList.setAdapter(adapt);



        // make the menu items actionable by declaring an onclick listener for
        // each of them.// Use "Toast" to display the name of the menu item for a short period
        // on the screen in a message box
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked,
                                    int position, long id) {
/*
                //***===**==** This is the Toast Activity BEGIN/*
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(),
                        ((TextView) itemClicked).getText(), Toast.LENGTH_SHORT)
                        .show();
                //***===**==** This is the Toast Activity END
                */

                //&&&&&&&&&&&&&&&&&&&&& START What to do with the list view items &&&&&&&&&&&&&&&&&&&&&&&&&


                TextView textview = (TextView) itemClicked;
                String strText = textview.getText().toString();
                switch(position){
                    case 0:
// When clicked, show a toast with the TextView text
                        Toast.makeText(getApplicationContext(), strText,
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
// When clicked, show a toast with the TextView text
                        Toast.makeText(getApplicationContext(), strText,
                                Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 3:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 4:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 5:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 6:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 7:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    case 8:
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://www.moringaschool.com/")));
                        break;
                    default:
// When clicked, show a toast with the TextView text
                        Toast.makeText(getApplicationContext(), strText,
                                Toast.LENGTH_SHORT).show();
                        break;
                }



                // &&&&&&&&&&&&&&&&&&&&& END What to do with the list view items &&&&&&&&&&&&&&&&&&&&&&&&&

            }
        });


    }
}
