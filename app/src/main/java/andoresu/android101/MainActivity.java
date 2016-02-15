package andoresu.android101;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s = (Spinner) findViewById(R.id.ageSpinner);
        String age[] = new String[20];
        for (int i=0 ; i < 20 ; i++){
            age[i] = i+18+"";
        }
        ArrayAdapter<String> ages = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, age);
        s.setAdapter(ages);
    }


    public void cambiarPantalla(View view) {

        Intent i = new Intent(this, Main2Activity.class);

        EditText et = (EditText) findViewById(R.id.tbName);
        String name = et.getText().toString();
        i.putExtra("Name",name);
        Spinner s = (Spinner) findViewById(R.id.ageSpinner);
        int years = Integer.parseInt(s.getSelectedItem().toString());
        i.putExtra("Years",years);
        startActivity(i);

    }
}
