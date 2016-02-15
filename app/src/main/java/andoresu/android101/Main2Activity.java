package andoresu.android101;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name = getIntent().getStringExtra("Name");
        int years = getIntent().getIntExtra("Years",0);
        TextView t = (TextView) findViewById(R.id.tvBienvenida);
        t.setText("Bienvenido " + name + " con " + years + " años de edad.");
    }




    public void volverPantalla1(View view) {
        Intent i = new Intent(this,  MainActivity.class);
        i.putExtra("VALOR", 2);
        startActivity(i);

    }
}
