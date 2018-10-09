// By Luke Minsuk Kim 
package edu.stanford.cs108.colorpicker;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar red;
    SeekBar green;
    SeekBar blue;
    TextView color;
    TextView tv;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button)findViewById(R.id.button3);
        color = (TextView)findViewById(R.id.textView19);
        tv = (TextView)findViewById(R.id.textView20);
        red = (SeekBar)findViewById(R.id.seekBar9);
        green = (SeekBar)findViewById(R.id.seekBar10);
        blue = (SeekBar)findViewById(R.id.seekBar11);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rval = red.getProgress();
                int gval = green.getProgress();
                int bval = blue.getProgress();
                tv.setText("Red: " + rval + " Green: " + gval + " Blue: " + bval);
                color.setBackgroundColor(Color.rgb(rval,gval,bval));
            }
        });
    }
}
