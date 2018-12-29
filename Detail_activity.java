package com.hfad.fragment_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class Detail_activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activity);
        Workout_detail_fragment frag = (Workout_detail_fragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);
    }
}
