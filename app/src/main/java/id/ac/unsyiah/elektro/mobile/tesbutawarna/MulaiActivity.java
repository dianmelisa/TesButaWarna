package id.ac.unsyiah.elektro.mobile.tesbutawarna;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


public class MulaiActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mulai, menu);
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

        int periksaAns1 = Integer.valueOf(String.valueOf(periksaAnsTxt.getText().toString()));
        Intent hasilIntent = new Intent(this, Soal2.class);
        int pointHasil;

        if (periksaAns1 == 12){
            pointHasil = 1;
            hasilIntent.putExtra("pointHasil",pointHasil);

        }else {
            pointHasil = 0;
            hasilIntent.putExtra("Jawaban", pointHasil);
        }
        startActivity(hasilIntent);
    }
}

