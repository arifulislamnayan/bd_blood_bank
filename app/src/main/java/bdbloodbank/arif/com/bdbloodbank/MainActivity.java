package bdbloodbank.arif.com.bdbloodbank;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {



    String [] division =new String[]  {"Barisal", "Chittagong","Dhaka","Khulna","Rajshahi","Rangpur","Sylhet"};
    String [] divBangla = new String[] {"খুলনা বিভাগ","ঢাকা বিভাগ","চট্টগ্রাম বিভাগ","বরিশাল বিভাগ ","রাজশাহী বিভাগ ", "রংপুর বিভাগ ", "সিলেট বিভাগ "};

    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tvItem,divBangla);
        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, division);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        String div = l.getItemAtPosition(position).toString();
        if(div.equals("বরিশাল বিভাগ "))
        {
            startActivity( new Intent(this, BarisalActivity.class));

        }
        if(div.equals("চট্টগ্রাম বিভাগ"))
        {
            startActivity( new Intent(this, ChittagongActivity.class));

        }
        if(div.equals("ঢাকা বিভাগ"))
        {
            startActivity( new Intent(this,DhakaActivity.class));
            //Toast.makeText(getApplicationContext(),"Barisal",Toast.LENGTH_SHORT).show();
        }
        if(div.equals("খুলনা বিভাগ"))
        {
            startActivity( new Intent(this, KhulnaActivity.class));
            //Toast.makeText(getApplicationContext(),"Barisal",Toast.LENGTH_SHORT).show();
        }
        if(div.equals("রাজশাহী বিভাগ "))
        {
            startActivity( new Intent(this, RajshahiActivity.class));
            //Toast.makeText(getApplicationContext(),"Barisal",Toast.LENGTH_SHORT).show();
        }
        if(div.equals("রংপুর বিভাগ " ))
        {
            startActivity( new Intent(this, RangpurActivity.class));
            //Toast.makeText(getApplicationContext(),"Barisal",Toast.LENGTH_SHORT).show();
        }
        if(div.equals("সিলেট বিভাগ "))
        {
            startActivity( new Intent(this, SylhetActivity.class));
            //Toast.makeText(getApplicationContext(),"Barisal",Toast.LENGTH_SHORT).show();
        }

        //Toast.makeText(getApplicationContext(),"You have selected "+division[position]+" division ",Toast.LENGTH_SHORT).show();
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
