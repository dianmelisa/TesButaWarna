package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Soal8 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal8);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal8, menu);
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

    public void onClickBtnNext8(View v) {
        EditText periksaAnsTxt = (EditText) findViewById(R.id.et);

        int periksaAns = Integer.valueOf(periksaAnsTxt.getText().toString());
        Intent hasilIntent = new Intent(this, Soal9.class);

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


        int hasilBNormal = 0;
        int hasilBMerahHijau = 0;
        int hasilBTotal = 0;


        if (periksaAns == 15){
            hasilBNormal = (1+hasilBNormal);
            hasilIntent.putExtra("hasilBNormal8",hasilBNormal);


        }else if (periksaAns == 17){
            hasilBMerahHijau = (1+hasilBMerahHijau);
            hasilIntent.putExtra("hasilBMerahHijau8", hasilBMerahHijau);

        }else {
            hasilBTotal = (1+hasilBTotal);
            hasilIntent.putExtra("hasilTotal8", hasilBTotal);
        }
        startActivity(hasilIntent);
        finish();
    }

    public void onBackPressed(){
        return ;
    }
}
