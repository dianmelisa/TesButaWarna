package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class HasilActivity extends ActionBarActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        Intent hasilIntent = getIntent();
        String hasilStr1 = hasilIntent.getStringExtra("pointHasil1");
        String hasilStr2 = hasilIntent.getStringExtra("pointHasil2");
        String hasilStr3 = hasilIntent.getStringExtra("pointHasil3");

        TextView hasilView = (TextView) findViewById(R.id.txtHasil);
        int angka1 = Integer.valueOf(String.valueOf(hasilStr1));
        int angka2 = Integer.valueOf(String.valueOf(hasilStr2));
        int angka3 = Integer.valueOf(String.valueOf(hasilStr3));
        int total = angka1 + angka2 + angka3;

        String pesan;

        if(total >= 2){
            pesan = "Tidak Buta Warna";

        }
        else {
            pesan = "Penglihatan Terganggu";
        }
        hasilView.setText(pesan);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hasil, menu);
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
