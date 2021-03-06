package com.stanislav_pankrashin.dndhelper;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

    }

    public void buttonClicked(View v) {
        int id = v.getId();
        Intent myIntent;

        switch (id) {
            case R.id.button1:
                myIntent = new Intent(MainPage.this, PointsBuyCalc.class);
                startActivity(myIntent);
                break;
            case R.id.button2:
                myIntent = new Intent(MainPage.this, DiceRolling.class);
                startActivity(myIntent);
                break;
            case R.id.button3:
                myIntent = new Intent(MainPage.this, LocationsAndPeople.class);
                startActivity(myIntent);
                break;
            case R.id.button4:
                String blurb1 = "DnD Helper was created by Stanislav Pankrashin,\n" +
                        "Stanislav was a student at the University of Auckland\n" +
                        "Now he works as a Software Developer\n\n" +
                        "Please send all suggestions or business requests to: \n" +
                        "Stasera2@gmail.com";

                displayModal("About The Author", blurb1);
                break;
            case R.id.button5:
                String blurb2 = "It's empty here right now....";

                displayModal("Legal", blurb2);
                break;
        }
    }


    private void displayModal(String title, String message) {
        // 1. Instantiate an AlertDialog.Builder with its constructor
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        // 2. Chain together various setter methods to set the dialog characteristics
        builder.setMessage(message)
                .setTitle(title);

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //do nothing
            }
        });

        // 3. Get the AlertDialog from create()
        AlertDialog dialog = builder.create();
        dialog.show();

    }
}
