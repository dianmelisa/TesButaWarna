package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class Soal3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal3);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_soal3, menu);
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

    public void onClick(View v) {
        EditText periksaAnsTxt = (EditText) findViewById(R.id.editTextInput);

        int periksaAns3 = Integer.valueOf(String.valueOf(periksaAnsTxt.getText().toString()));
        Intent hasilIntent = new Intent(this, HasilActivity.class);
        int pointHasil;

        if (periksaAns3 == 6){
            pointHasil = 1;
            hasilIntent.putExtra("pointHasil3",pointHasil);

        }else {
            pointHasil = 0;
            hasilIntent.putExtra("pointHasil3", pointHasil);
        }
        startActivity(hasilIntent);
    }

}
