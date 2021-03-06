package id.ac.unsyiah.elektro.mobile.tesbutawarna;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class HasilActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        Intent hasilIntent = getIntent();
        Integer hasilNormal1 = hasilIntent.getIntExtra("hasilBNormal1",0);
        Integer hasilNormal2 = hasilIntent.getIntExtra("hasilBNormal2",0);
        Integer hasilNormal3 = hasilIntent.getIntExtra("hasilBNormal3",0);
        Integer hasilNormal4 = hasilIntent.getIntExtra("hasilBNormal4",0);
        Integer hasilNormal5 = hasilIntent.getIntExtra("hasilBNormal5",0);
        Integer hasilNormal6 = hasilIntent.getIntExtra("hasilBNormal6",0);
        Integer hasilNormal7 = hasilIntent.getIntExtra("hasilBNormal7",0);
        Integer hasilNormal8 = hasilIntent.getIntExtra("hasilBNormal8",0);
        Integer hasilNormal9 = hasilIntent.getIntExtra("hasilBNormal9",0);
        Integer hasilNormal10 = hasilIntent.getIntExtra("hasilBNormal10",0);

        Integer hasilTotal1 = hasilIntent.getIntExtra("hasilBTotal1",0);
        Integer hasilTotal2 = hasilIntent.getIntExtra("hasilBTotal2",0);
        Integer hasilTotal3 = hasilIntent.getIntExtra("hasilBTotal3",0);
        Integer hasilTotal4 = hasilIntent.getIntExtra("hasilBTotal4",0);
        Integer hasilTotal5 = hasilIntent.getIntExtra("hasilBTotal5",0);
        Integer hasilTotal6 = hasilIntent.getIntExtra("hasilBTotal6",0);
        Integer hasilTotal7 = hasilIntent.getIntExtra("hasilBTotal7",0);
        Integer hasilTotal8 = hasilIntent.getIntExtra("hasilBTotal8",0);
        Integer hasilTotal9 = hasilIntent.getIntExtra("hasilBTotal9",0);
        Integer hasilTotal10 = hasilIntent.getIntExtra("hasilBTotal10",0);

        Integer hasilMerahHijau1 = hasilIntent.getIntExtra("hasilBMerahHijau1",0);
        Integer hasilMerahHijau2 = hasilIntent.getIntExtra("hasilBMerahHijau2",0);
        Integer hasilMerahHijau3 = hasilIntent.getIntExtra("hasilBMerahHijau3",0);
        Integer hasilMerahHijau4 = hasilIntent.getIntExtra("hasilBMerahHijau4",0);
        Integer hasilMerahHijau5 = hasilIntent.getIntExtra("hasilBMerahHijau5",0);
        Integer hasilMerahHijau6 = hasilIntent.getIntExtra("hasilBMerahHijau6",0);
        Integer hasilMerahHijau7 = hasilIntent.getIntExtra("hasilBMerahHijau7",0);
        Integer hasilMerahHijau8 = hasilIntent.getIntExtra("hasilBMerahHijau8",0);
        Integer hasilMerahHijau9 = hasilIntent.getIntExtra("hasilBMerahHijau9",0);
        Integer hasilMerahHijau10 = hasilIntent.getIntExtra("hasilBMerahHijau10",0);


        TextView hasilNormalView = (TextView) findViewById(R.id.txtNormal);
        TextView hasilMerahHijauView = (TextView) findViewById(R.id.txtMerahHijau);
        TextView hasilTotalView = (TextView) findViewById(R.id.txtTotal);



        double bNormal = (hasilNormal1 + hasilNormal2 + hasilNormal3 + hasilNormal4 + hasilNormal5
                + hasilNormal6 + hasilNormal7 + hasilNormal8 + hasilNormal9 + hasilNormal10)*10;
        String bNormalStr = String.valueOf(bNormal);

        double bMerahHijau = (hasilMerahHijau1 + hasilMerahHijau2 +  hasilMerahHijau3 +  hasilMerahHijau4 +
                hasilMerahHijau5 +  hasilMerahHijau6 + hasilMerahHijau7 + hasilMerahHijau8 + hasilMerahHijau9 +
                hasilMerahHijau10 )*10;
        String bMerahHijauStr = String.valueOf(bMerahHijau);

        double bTotal = (hasilTotal1 + hasilTotal2 + hasilTotal3 + hasilTotal4 + hasilTotal5 + hasilTotal6 +
                hasilTotal7 + hasilTotal8 + hasilTotal9 + hasilTotal10)*10;
        String bTotalStr = String.valueOf(bTotal);


        hasilNormalView.setText("Normal : " + bNormalStr + '%');
        hasilMerahHijauView.setText("Buta Warna Merah + Hijau : " + bMerahHijauStr + '%');
        hasilTotalView.setText("Buta Warna Total : " + bTotalStr + '%');

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

    public void onClickBacktoMenu(View v){
        Intent intentToMenu = new Intent(this, MainActivity.class);
        startActivity(intentToMenu);
    }




}
