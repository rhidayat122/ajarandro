package assalaam.linearlayout.id.mamat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CallActivity2 extends AppCompatActivity {
    /** Called when the activity is First created */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);

        Button prev = (Button) findViewById(R.id.Button02);
        prev.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent();
                       setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
