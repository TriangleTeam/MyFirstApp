package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.view.Window;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("Method onCreate called------------");
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    protected void onStart(){
        super.onStart();
        System.out.println("Method onStart called---------");
    }
    protected  void onResume(){
        super.onResume();
        System.out.println("Method onResume called------------");
    }
    protected void onPause(){
        super.onPause();
        System.out.println("Method onPause called--------------");
    }

    protected void onStop(){
        super.onStop();
        System.out.println("Method onStop called----------------");
    }

    protected void onRestart(){
        super.onRestart();
        System.out.println("Mehod onRestart called----------------");
    }

    protected void onDestroy(){
        super.onDestroy();
        System.out.println("Method onDestory called---------");
    }
//    Called when the user taps the send button
    public void sendMessage(View view){
        // Do something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
