// Main activity.java
package edu.stanford.cs108.page1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*public void changeText(View view) {
        TextView textView = (TextView) findViewById(R.id.textOutput);
        textView.setText("Go Stanford!");
    }*/
    public static final String  MESSAGE_EXTRA = "MESSAGE";
//    public static final String USE_ITALICS_EXTRA = "USE_ITALICS";
    public static final String USE_COLOR_EXTRA = "COLOR";

    public void onSubmit(View view){
        EditText msgEditText = (EditText)findViewById(R.id.inputText);
        RadioGroup colorGroup = (RadioGroup)findViewById(R.id.myRadioGroup);
        String msgString = msgEditText.getText().toString();
        int color = (colorGroup.getCheckedRadioButtonId() == R.id.redButton)? Color.RED : Color.BLUE;
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(MESSAGE_EXTRA,msgString);
        intent.putExtra(USE_COLOR_EXTRA,color);
        startActivity(intent);
    }
}

// SecondActivity.java
package edu.stanford.cs108.page1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String msgString = intent.getStringExtra(MainActivity.MESSAGE_EXTRA);
        // boolean useItalics = intent.getBooleanExtra(MainActivity.USE_ITALICS_EXTRA,false);
        int color = intent.getIntExtra(MainActivity.USE_COLOR_EXTRA,Color.BLACK);
        TextView out = (TextView)findViewById(R.id.output);
        out.setTextColor(color);
        out.setText(msgString);
    }


}

