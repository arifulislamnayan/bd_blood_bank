package bdbloodbank.arif.com.bdbloodbank;

import android.app.Activity;
import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;


public class BarisalActivity extends ListActivity {
    private String[] barisal_ad_array;
    private String[] barisal_contact;
    ArrayAdapter<String> adapter, contac_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);
        barisal_ad_array = getResources().getStringArray(R.array.barisal_bb_address);
        barisal_contact = getResources().getStringArray(R.array.barisal_bb_contact);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item_address, R.id.tvItem,barisal_ad_array);
        setListAdapter(adapter);
//        contac_adapter = new ArrayAdapter<String>(this,R.layout.list_address, R.id.tvcontact,barisal_contact);
//        setListAdapter(contac_adapter);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_barisal, menu);
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
