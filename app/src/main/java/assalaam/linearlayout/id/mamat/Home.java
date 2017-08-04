package assalaam.linearlayout.id.mamat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.*;
import android.widget.Button;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button lls = (Button) findViewById(R.id.picker);
        lls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View picker) {
                Intent myIntent = new
                        Intent(picker.getContext(), picker.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button call = (Button) findViewById(R.id.RadioButton);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RadioButton) {
                Intent myIntent = new
                        Intent(RadioButton.getContext(), RadioButton.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button rela = (Button) findViewById(R.id.LinearLayout);
        rela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LinearLayout) {
                Intent myIntent = new
                        Intent(LinearLayout.getContext(), LinearLayout.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button uh = (Button) findViewById(R.id.AutoCompleteSederhana);
        uh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View AutocompleteSederhana) {
                Intent myIntent = new
                        Intent(AutocompleteSederhana.getContext(), AutocompleteSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ih = (Button) findViewById(R.id.checkbox);
        ih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View checkbox) {
                Intent myIntent = new
                        Intent(checkbox.getContext(), checkbox.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button eh = (Button) findViewById(R.id.KotakDialog);
        eh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View KotakDialog) {
                Intent myIntent = new
                        Intent(KotakDialog.getContext(), KotakDialog.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button oh = (Button) findViewById(R.id.MengenalSelectionSederhana);
        oh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View MengenalSelectionWidget) {
                Intent myIntent = new
                        Intent(MengenalSelectionWidget.getContext(), MengenalSelectionWidget.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button ah = (Button) findViewById(R.id.CallActivity);
        ah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View CallActivity) {
                Intent myIntent = new
                        Intent(CallActivity.getContext(), CallActivity.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button bo = (Button) findViewById(R.id.MenampilkanGambar);
        bo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View MenampilkanGambar) {
                Intent myIntent = new
                        Intent(MenampilkanGambar.getContext(), MenampilkanGambar.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button bi = (Button) findViewById(R.id.RelativeLayoutSederhana);
        bi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View RelativeLayoutSederhana) {
                Intent myIntent = new
                        Intent(RelativeLayoutSederhana.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button be = (Button) findViewById(R.id.LayoutTable);
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View LayoutTable) {
                Intent myIntent = new
                        Intent(LayoutTable.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button bu = (Button) findViewById(R.id.playingAudio);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View playingAudio) {
                Intent myIntent = new
                        Intent(playingAudio.getContext(), playingAudio.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button te = (Button) findViewById(R.id.kalkulatormontok);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View kalkulatormontok) {
                Intent myIntent = new
                        Intent(kalkulatormontok.getContext(), kalkulatormontok.class);
                startActivityForResult(myIntent, 0);

            }
        });

        Button uy = (Button) findViewById(R.id.webview);
        uy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View kalkulatormontok) {
                Intent myIntent = new
                        Intent(kalkulatormontok.getContext(), WView.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
