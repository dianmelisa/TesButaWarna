package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Soal2 extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal2, menu);
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
    public void onClickBtnNext2(View v) {
        EditText periksaAnsTxt = (EditText) findViewById(R.id.et);

        int periksaAns = Integer.valueOf(periksaAnsTxt.getText().toString());
        Intent hasilIntent = new Intent(this, Soal3.class);

        hasilIntent.putExtra("hasilBNormal1", getIntent().getIntExtra("hasilBNormal1", 0));
        hasilIntent.putExtra("hasilBTotal1", getIntent().getIntExtra("hasilBTotal1", 0));
        hasilIntent.putExtra("hasilBMerahHijau1",getIntent().getIntExtra("hasilBMerahHijau1",0));

        int hasilBNormal = 0;
        int hasilBMerahHijau = 0;
        int hasilBTotal = 0;


        if (periksaAns == 8){
            hasilBNormal = (1+ hasilBNormal);
            hasilIntent.putExtra("hasilBNormal2",hasilBNormal);


        }else if (periksaAns == 3){
            hasilBMerahHijau = (1+hasilBMerahHijau);
            hasilIntent.putExtra("hasilBMerahHijau2", hasilBMerahHijau);

        }else {
            hasilBTotal = (1+hasilBTotal);
            hasilIntent.putExtra("hasilTotal2", hasilBTotal);
        }
        startActivity(hasilIntent);
        finish();
    }

    public void onBackPressed(){
        return ;
    }
}
