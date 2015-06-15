package bdbloodbank.arif.com.bdbloodbank;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DhakaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
    }
// call on Dhaka starts
public void callPhone_dhk1(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:028629042"));
    startActivity(callIntent);
}

public void callPhone_dhk2(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:029116563"));
    startActivity(callIntent);
}

public void callPhone_dhk3(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:028322987"));
    startActivity(callIntent);
}


public void callPhone_dhk4(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:029362573"));
    startActivity(callIntent);
}

public void callPhone_dhk5(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:028121497"));
    startActivity(callIntent);
}
public void callPhone_dhk6(View v)
{
    Intent callIntent = new Intent(Intent.ACTION_CALL);
    callIntent.setData(Uri.parse("tel:01819284878"));
    startActivity(callIntent);
}
    public void callPhone_dhk7(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0152423441"));
        startActivity(callIntent);
    }public void callPhone_dhk8(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:01819284878"));
        startActivity(callIntent);
    }public void callPhone_dhk9(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:091-54829"));
        startActivity(callIntent);
    }public void callPhone_dhk10(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:02-8621658"));
        startActivity(callIntent);
    }public void callPhone_dhk11(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:02-9668690"));
        startActivity(callIntent);
    }public void callPhone_dhk12(View v)
    {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:02-8317090"));
        startActivity(callIntent);
    }































































    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dhaka, menu);
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
