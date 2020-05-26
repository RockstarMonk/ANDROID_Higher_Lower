package com.myapp.shashwat.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randno;

    public void clickguess(View view){
        EditText inputno = findViewById(R.id.inputno);
        String nostr = inputno.getText().toString();
        int userno = Integer.parseInt(nostr);
        if(userno>randno)
            Toast.makeText(this, "Lower!", Toast.LENGTH_LONG).show();
        else if(userno<randno)
            Toast.makeText(this, "Higher!", Toast.LENGTH_LONG).show();
        else if(userno == randno)
            Toast.makeText(this, "You got it!", Toast.LENGTH_LONG).show();
        Log.i("Entered Number:", inputno.getText().toString());
        Log.i("Random Number:", Integer.toString(randno));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randno = rand.nextInt(20)+1;
    }
}
