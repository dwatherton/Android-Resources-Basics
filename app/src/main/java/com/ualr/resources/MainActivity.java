package com.ualr.resources;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

// TODO 4: Define the alternative resources needed to have different content and look n feel depending on the device language.

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.root_layout);
    }

    public void onLessonLearntClicked(View view) {
        // TODO 5: Get congrats_text resource -->
        String congratsMessage = getResources().getString(R.string.congrats_text);
        // TODO 6: Once congratsMessage is initialized, uncomment the two following lines
        // Snackbar snackbar = Snackbar.make(rootLayout, congratsMessage, Snackbar.LENGTH_LONG);
        // snackbar.show();
    }
}
