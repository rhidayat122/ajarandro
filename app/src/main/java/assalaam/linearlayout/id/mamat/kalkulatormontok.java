package assalaam.linearlayout.id.mamat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class kalkulatormontok extends AppCompatActivity {

    private float height;
    private float weight;
    private float Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulatormontok);

        Button hitung = (Button) findViewById(R.id.hitung);
        final EditText height_value = (EditText) findViewById(R.id.height);
        final EditText weight_value = (EditText) findViewById(R.id.weight);
        final TextView result = (TextView) findViewById((R.id.result));

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (height_value.getText().length()>0 && weight_value.getText().length()>0){
                    height = Float.parseFloat(height_value.getText().toString());
                    weight = Float.parseFloat(weight_value.getText().toString());
                    Hasil = KalkulasiPerhitungan(weight,height);

                    if (Hasil < 16) {
                        result.setText("Your BMI  "+Hasil+" (Sapu Nyere)");
                    } else if (Hasil <18.5) {
                        result.setText("Your BMI "+Hasil+" (Kurang Montok)");
                    } else if (Hasil <25) {
                        result.setText("Your BMI "+Hasil+" (Montok)");
                    } else if (Hasil <30) {
                        result.setText("Your BMI "+Hasil+" (Rada Montok)");
                    } else {
                        result.setText("Your BMI "+Hasil+ " (Over Montok)");
                    }
                }
            }
        });
    }

    private float KalkulasiPerhitungan(float weight, float height) {
        height = (height/100);
        return (float) (weight/(height*height));
    }
}
