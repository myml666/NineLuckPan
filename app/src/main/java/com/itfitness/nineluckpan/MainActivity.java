package com.itfitness.nineluckpan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.itfitness.nineluckpan.widgei.NineLuckPan;

public class MainActivity extends AppCompatActivity {
    private NineLuckPan luckpan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        luckpan = (NineLuckPan) findViewById(R.id.luckpan);
        luckpan.setOnLuckPanAnimEndListener(new NineLuckPan.OnLuckPanAnimEndListener() {
            @Override
            public void onAnimEnd(int position, String msg) {
                Toast.makeText(MainActivity.this, "位置："+position+"提示信息："+msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
