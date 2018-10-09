package com.shirish.hello;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {
  private Button b;
  EditText etname,etemail,etpassword;
  TextView tv;

 @Override
 protected void onCreate(Bundle savedInstanceState) { 
   super.onCreate(savedInstanceState); 
   setContentView(R.layout.activity_main);
   b=(Button)findViewById(R.id.click);
   tv=(TextView)findViewById(R.id.display);
   tv.setMovementMethod(new ScrollingMovementMethod())
 
   b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      etname=(EditText)findViewById(R.id.name);
      etemail=(EditText)findViewById(R.id.email);
      etpassword=(EditText)findViewById(R.id.password);
      tv.setText("Your Input: \n"+etname.getText().toString()+"\n"+etemail.getText().toString()+"\n"+etpassword.getText().toString()+"\nEnd.");
        }
     });
   }
}
