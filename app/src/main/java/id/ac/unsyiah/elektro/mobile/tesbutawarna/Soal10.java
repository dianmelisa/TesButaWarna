package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Soal10 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal10);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal10, menu);
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

    public void onClickBtnNext10(View v) {
        EditText periksaAnsTxt = (EditText) findViewById(R.id.et);

        int periksaAns = Integer.valueOf(periksaAnsTxt.getText().toString());
        Intent hasilIntent = new Intent(this, HasilActivity.class);

        hasilIntent.putExtra("hasilBNormal1", getIntent().getIntExtra("hasilBNormal1", 0));
        hasilIntent.putExtra("hasilBTotal1", getIntent().getIntExtra("hasilBTotal1", 0));
        hasilIntent.putExtra("hasilBMerahHijau1",getIntent().getIntExtra("hasilBMerahHijau1",0));
        hasilIntent.putExtra("hasilBNormal2", getIntent().getIntExtra("hasilBNormal2", 0));
        hasilIntent.putExtra("hasilBTotal2", getIntent().getIntExtra("hasilBTotal2", 0));
        hasilIntent.putExtra("hasilBMerahHijau2",getIntent().getIntExtra("hasilBMerahHijau2",0));
        hasilIntent.putExtra("hasilBNormal3", getIntent().getIntExtra("hasilBNormal3", 0));
        hasilIntent.putExtra("hasilBTotal3", getIntent().getIntExtra("hasilBTotal3", 0));
        hasilIntent.putExtra("hasilBMerahHijau3",getIntent().getIntExtra("hasilBMerahHijau3",0));
        hasilIntent.putExtra("hasilBNormal4", getIntent().getIntExtra("hasilBNormal4", 0));
        hasilIntent.putExtra("hasilBTotal4", getIntent().getIntExtra("hasilBTotal4", 0));
        hasilIntent.putExtra("hasilBMerahHijau4",getIntent().getIntExtra("hasilBMerahHijau4",0));
        hasilIntent.putExtra("hasilBNormal5", getIntent().getIntExtra("hasilBNormal5", 0));
        hasilIntent.putExtra("hasilBTotal5", getIntent().getIntExtra("hasilBTotal5", 0));
        hasilIntent.putExtra("hasilBMerahHijau5",getIntent().getIntExtra("hasilBMerahHijau5",0));
        hasilIntent.putExtra("hasilBNormal6", getIntent().getIntExtra("hasilBNormal6", 0));
        hasilIntent.putExtra("hasilBTotal6", getIntent().getIntExtra("hasilBTotal6", 0));
        hasilIntent.putExtra("hasilBMerahHijau6",getIntent().getIntExtra("hasilBMerahHijau6",0));
        hasilIntent.putExtra("hasilBNormal7", getIntent().getIntExtra("hasilBNormal7", 0));
        hasilIntent.putExtra("hasilBTotal7", getIntent().getIntExtra("hasilBTotal7", 0));
        hasilIntent.putExtra("hasilBMerahHijau7",getIntent().getIntExtra("hasilBMerahHijau7",0));
        hasilIntent.putExtra("hasilBNormal8", getIntent().getIntExtra("hasilBNormal8", 0));
        hasilIntent.putExtra("hasilBTotal8", getIntent().getIntExtra("hasilBTotal8", 0));
        hasilIntent.putExtra("hasilBMerahHijau8",getIntent().getIntExtra("hasilBMerahHijau8",0));
        hasilIntent.putExtra("hasilBNormal9", getIntent().getIntExtra("hasilBNormal9", 0));
        hasilIntent.putExtra("hasilBTotal9", getIntent().getIntExtra("hasilBTota9", 0));
        hasilIntent.putExtra("hasilBMerahHijau9",getIntent().getIntExtra("hasilBMerahHijau9",0));


        int hasilBNormal = 0;
        int hasilBMerahHijau = 0;
        int hasilBTotal = 0;


        if (periksaAns == 2){
            hasilBNormal = (1+hasilBNormal);
            hasilIntent.putExtra("hasilBNormal10",hasilBNormal);

        }else {
            hasilBMerahHijau = (1+hasilBMerahHijau);
            hasilIntent.putExtra("hasilBMerahHijau10",hasilBMerahHijau);

            hasilBTotal = (1+hasilBTotal);
            hasilIntent.putExtra("hasilTotal10", hasilBTotal);
        }
        startActivity(hasilIntent);
        finish();
    }
    public void onBackPressed(){
        return ;
    }
}
