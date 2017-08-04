package assalaam.linearlayout.id.mamat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import android.media.MediaPlayer;
import android.app.Activity;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class playingAudio extends AppCompatActivity {
    /** Called when the activity is first created. */
    private Button btnPlay;
    private Button btnPause;
    private Button btnStop;
    private MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        mp = new MediaPlayer();
        btnPlay = (Button) findViewById(R.id.btnPLAY);
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        stateAwal();

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                btnPlay.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }
    /** State Awal / Pertama Dijalankan */
    public void stateAwal(){
        btnPlay.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }
    /** Dijalankan Oleh Tombol Play */
    private void play() {
        /** Memanggil File MP3 "indonesiaraya.mp3" */
        mp = MediaPlayer.create(this, R.raw.udin);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /** Menjalankan Audio */
        mp.start();
        /** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
    /** Dijalankan Oleh Tombol Pause */
    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();
            }
        } else {
            if(mp!=null){
                mp.start();
            }
        }
    }
    /** Dijalankan Oleh Tombol Stop */
    public void stop(){
        mp.stop();
        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }
        stateAwal();
    }
}