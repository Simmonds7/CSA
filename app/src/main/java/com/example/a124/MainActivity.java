package com.example.a124;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity","Audio playback interrupted");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final MediaPlayer mpA = MediaPlayer.create(this, R.raw.scalea);
        final MediaPlayer mpA2 = MediaPlayer.create(this, R.raw.scalea);
        final MediaPlayer mpB = MediaPlayer.create(this, R.raw.scaleb);
        final MediaPlayer mpB2 = MediaPlayer.create(this, R.raw.scaleb);
        final MediaPlayer mpBB = MediaPlayer.create(this, R.raw.scalebb);
        final MediaPlayer mpC = MediaPlayer.create(this, R.raw.scalec);
        final MediaPlayer mpCS = MediaPlayer.create(this, R.raw.scalecs);
        final MediaPlayer mpCS2 = MediaPlayer.create(this, R.raw.scalecs);
        final MediaPlayer mpD = MediaPlayer.create(this, R.raw.scaled);
        final MediaPlayer mpD2 = MediaPlayer.create(this, R.raw.scaled);
        final MediaPlayer mpDS = MediaPlayer.create(this, R.raw.scaleds);
        final MediaPlayer mpE = MediaPlayer.create(this, R.raw.scalee);
        final MediaPlayer mpF = MediaPlayer.create(this, R.raw.scalef);
        final MediaPlayer mpFS = MediaPlayer.create(this, R.raw.scalefs);
        final MediaPlayer mpG = MediaPlayer.create(this, R.raw.scaleg);
        final MediaPlayer mpGS = MediaPlayer.create(this, R.raw.scalegs);
        final MediaPlayer mpHE = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mpHE2 = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mpHE3 = MediaPlayer.create(this, R.raw.scalehighe);
        final MediaPlayer mpHF = MediaPlayer.create(this, R.raw.scalehighf);
        final MediaPlayer mpHFS = MediaPlayer.create(this, R.raw.scalehighfs);
        final MediaPlayer mpHFS2 = MediaPlayer.create(this, R.raw.scalehighfs);
        final MediaPlayer mpHG = MediaPlayer.create(this, R.raw.scalehighg);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.btn_button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpA.start();
                delayPlaying(WHOLE_NOTE);
                mpA2.start();
                delayPlaying(WHOLE_NOTE);
                mpHE.start();
                delayPlaying(WHOLE_NOTE);
                mpHE2.start();
                delayPlaying(WHOLE_NOTE);
                mpHFS.start();
                delayPlaying(WHOLE_NOTE);
                mpHFS2.start();
                delayPlaying(WHOLE_NOTE);
                mpHE3.start();
                delayPlaying(WHOLE_NOTE * 2);
                mpD.start();
                delayPlaying(WHOLE_NOTE);
                mpD2.start();
                delayPlaying(WHOLE_NOTE);
                mpCS.start();
                delayPlaying(WHOLE_NOTE);
                mpCS2.start();
                delayPlaying(WHOLE_NOTE);
                mpB.start();
                delayPlaying(WHOLE_NOTE);
                mpB2.start();
                delayPlaying(WHOLE_NOTE);
                mpA.start();
            }
        });
        Button bt2 = (Button) findViewById(R.id.btn_button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mpE.start();
                delayPlaying(WHOLE_NOTE/2);
                mpFS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpGS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpA.start();
                delayPlaying(WHOLE_NOTE/2);
                mpB.start();
                delayPlaying(WHOLE_NOTE/2);
                mpCS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpDS.start();
                delayPlaying(WHOLE_NOTE/2);
                mpHE.start();
            }
        });

    }
}
