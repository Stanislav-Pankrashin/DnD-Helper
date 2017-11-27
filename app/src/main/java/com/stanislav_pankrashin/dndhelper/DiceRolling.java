package com.stanislav_pankrashin.dndhelper;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class DiceRolling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_rolling);
    }

    public void createButtonClicked(View v){
        this.displayModal("This is a test", "It worked!");

        //get the parent view
        LinearLayout parent = findViewById(R.id.characterContainer);
        int index = parent.getChildCount();

        this.inflateElement(parent, index);

    }

    //this method inflates a new element the character container
    public void inflateElement(LinearLayout parent, int index){
        LinearLayout newView = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.character_element, null);
        parent.addView(newView, index);
    }

    // This method creates and displays a modal window for the create new character button
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
