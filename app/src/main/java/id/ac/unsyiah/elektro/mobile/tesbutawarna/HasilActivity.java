package id.ac.unsyiah.elektro.mobile.tesbutawarna;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class HasilActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent hasilIntent = getIntent();
        Integer hasilStr1 = hasilIntent.getIntExtra("pointHasil1",1);
        Integer hasilStr2 = hasilIntent.getIntExtra("pointHasil2",1);
        Integer hasilStr3 = hasilIntent.getIntExtra("pointHasil3",1);
        Integer hasilStr4 = hasilIntent.getIntExtra("pointHasil4",1);
        Integer hasilStr5 = hasilIntent.getIntExtra("pointHasil5",1);
        Integer hasilStr6 = hasilIntent.getIntExtra("pointHasil6",1);
        Integer hasilStr7 = hasilIntent.getIntExtra("pointHasil7",1);
        Integer hasilStr8 = hasilIntent.getIntExtra("pointHasil8",1);
        Integer hasilStr9 = hasilIntent.getIntExtra("pointHasil9",1);
        Integer hasilStr10 = hasilIntent.getIntExtra("pointHasil10",1);
        Integer hasilStr11 = hasilIntent.getIntExtra("pointHasil11",1);



        TextView hasilView = (TextView) findViewById(R.id.txtHasil);
        int total = hasilStr1 + hasilStr2  + hasilStr3 + hasilStr4 + hasilStr5
                + hasilStr6 +hasilStr7 + hasilStr8 + hasilStr9 + hasilStr10 + hasilStr11;

        String pesan;

        if(total >= 7){
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
