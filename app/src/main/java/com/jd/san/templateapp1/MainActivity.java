package com.jd.san.templateapp1;

import android.app.Activity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    String tag="MyClass MainActivity :- ";
    String mySMSMsg="Hi, This is Sandeep, Just saying Hello 123";
    String mySMSTo="09527018833";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hello 123

        setContentView(R.layout.activity_main);

        final Button button =(Button) findViewById(R.id.btnSendSMS);
        button.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v) {
                Log.d(tag, "In the onClick() method, about to call sendSMS");
                SmsManager sms = SmsManager.getDefault();
                Log.d(tag, "In the onClick() method, sending SMS");
                sms.sendTextMessage(mySMSTo, null, mySMSMsg, null, null);
                Log.d(tag, "In the onClick() method, sent SMS to"+mySMSTo+" Msg is : "+mySMSMsg);

            }
        });
        Log.d(tag, "In the onCreate() method, Finished setContentView");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
