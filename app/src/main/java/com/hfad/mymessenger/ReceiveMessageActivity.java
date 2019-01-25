package com.hfad.mymessenger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class ReceiveMessageActivity extends Activity {
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        String messageText = getIntent().getStringExtra(EXTRA_MESSAGE);
        TextView  messageView = findViewById(R.id.message);
        messageView.setText(messageText);

    }
}
