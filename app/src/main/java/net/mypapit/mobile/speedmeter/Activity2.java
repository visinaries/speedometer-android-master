package net.mypapit.mobile.speedmeter;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import cn.iwgang.countdownview.CountdownView;

public class Activity2 extends AppCompatActivity {

    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_2);

        timer = new Timer();


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), Final.class);
                startActivity(intent);
                finish();
            }
        }, 10000);

        CountdownView countDownTimer = (CountdownView) findViewById(R.id.countdownview);
        countDownTimer.start(10000);

    }

    public void clickexit(View view) {

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}
