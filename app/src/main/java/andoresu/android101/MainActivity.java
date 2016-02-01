package andoresu.android101;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int sw1 = 0;
    int sw2 = 0;

    public void cambiarColor2(View view) {
        Button btn1 = (Button) findViewById(R.id.btn1);
        if(sw1==0){
            btn1.setBackgroundColor(Color.BLACK);
            sw1=1;
        }else{
            btn1.setBackgroundColor(Color.BLUE);
            sw1=0;
        }

    }

    public void cambiarColor1(View view) {
        Button btn2 = (Button) findViewById(R.id.btn2);
        if(sw2==0){
            btn2.setBackgroundColor(Color.GREEN);
            sw2=1;
        }else{
            btn2.setBackgroundColor(Color.YELLOW);
            sw2=0;
        }
    }
}
