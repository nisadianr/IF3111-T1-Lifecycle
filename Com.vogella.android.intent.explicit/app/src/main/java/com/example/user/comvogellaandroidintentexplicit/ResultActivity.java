package com.example.user.comvogellaandroidintentexplicit;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extra=getIntent().getExtras();
        setContentView(R.layout.activity_result);
        TextView text=(TextView) findViewById(R.id.displayintentextra);
        text.setText(extra.getString("data"));
    }
}