package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Soal5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal5);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal5, menu);
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

    public void onClickBtnNext5(View v) {
        EditText periksaAnsTxt = (EditText) findViewById(R.id.et);

        int periksaAns = Integer.valueOf(periksaAnsTxt.getText().toString());
        Intent hasilIntent = new Intent(this, Soal6.class);

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


        int hasilBNormal = 0;
        int hasilBMerahHijau = 0;
        int hasilBTotal = 0;


        if (periksaAns == 57){
            hasilBNormal = (1+hasilBNormal);
            hasilIntent.putExtra("hasilBNormal5",hasilBNormal);


        }else if (periksaAns == 35){
            hasilBMerahHijau = (1+hasilBMerahHijau);
            hasilIntent.putExtra("hasilBMerahHijau5", hasilBMerahHijau);

        }else {
            hasilBTotal = (1+hasilBTotal);
            hasilIntent.putExtra("hasilTotal5", hasilBTotal);
        }
        startActivity(hasilIntent);
        finish();
    }
    public void onBackPressed(){
        return ;
    }
}
