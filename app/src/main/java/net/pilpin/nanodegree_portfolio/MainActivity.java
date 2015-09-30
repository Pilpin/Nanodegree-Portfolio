package net.pilpin.nanodegree_portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button app1 = (Button) findViewById(R.id.button1);
        app1.setOnClickListener(this);
        Button app2 = (Button) findViewById(R.id.button2);
        app2.setOnClickListener(this);
        Button app3 = (Button) findViewById(R.id.button3);
        app3.setOnClickListener(this);
        Button app4 = (Button) findViewById(R.id.button4);
        app4.setOnClickListener(this);
        Button app5 = (Button) findViewById(R.id.button5);
        app5.setOnClickListener(this);
        Button app6 = (Button) findViewById(R.id.button6);
        app6.setOnClickListener(this);

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

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "This button will launch " + ((Button) v).getText(), Toast.LENGTH_SHORT).show();
    }
}
