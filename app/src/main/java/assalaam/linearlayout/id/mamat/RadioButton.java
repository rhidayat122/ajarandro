package assalaam.linearlayout.id.mamat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RadioButton extends Activity implements RadioGroup.OnCheckedChangeListener {
    /** Called when the activity is firs called */

RadioGroup orientation;
        RadioGroup gravity;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        orientation = (RadioGroup) findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity = (RadioGroup) findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
        }

public void onCheckedChanged(RadioGroup group,
        int checkid) {
        switch (checkid) {
        case R.id.horizontal:
        orientation.setOrientation(LinearLayout.HORIZONTAL);
        break;
        case R.id.vertical:
        orientation.setOrientation(LinearLayout.VERTICAL);
        break;
        case R.id.kiri:
        gravity.setGravity(Gravity.LEFT);
        break;
        case R.id.kanan:
        gravity.setGravity(Gravity.RIGHT);
        break;
        case R.id.tengah:
        gravity.setGravity(Gravity.CENTER);
        break;
        }
        }
        }