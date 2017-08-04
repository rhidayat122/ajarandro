package assalaam.linearlayout.id.mamat;

import android.os.Bundle;
import android.app.Activity;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkbox extends Activity implements OnCheckedChangeListener {
    CheckBox cb;
    /** Called when the activity is first created. */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        cb=(CheckBox) findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);

    }
    public void onCheckedChanged (CompoundButton buttonView,
                                  boolean isChecked) {
        if (isChecked) {
            cb.setText("checkBox ini : Dicentang!");
        }
        else {
            cb.setText("checkBox ini : Tidak Dicentang ");
        }
    }
}