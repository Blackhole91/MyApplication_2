package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
        public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        }
        public void sendMessage(View view) {
            Intent intent = new Intent(this, Main2Activity.class);
            EditText editText = (EditText) findViewById(R.id.editText);
            String message = editText.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);

            

            if(message.contains("1")){
                startActivity(intent);
            }
            else {
                Toast.makeText(this, "keine Zahl von 1 bis 10 enthalten" + message, Toast.LENGTH_SHORT).show();
            }



    }



}


