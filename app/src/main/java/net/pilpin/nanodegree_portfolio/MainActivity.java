package net.pilpin.nanodegree_portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button app1 = (Button) findViewById(R.id.button1);
        Button app2 = (Button) findViewById(R.id.button2);
        Button app3 = (Button) findViewById(R.id.button3);
        Button app4 = (Button) findViewById(R.id.button4);
        Button app5 = (Button) findViewById(R.id.button5);
        Button app6 = (Button) findViewById(R.id.button6);

    }

    public void launchApp(View v) {
        switch(v.getId()){
            case R.id.button1:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
