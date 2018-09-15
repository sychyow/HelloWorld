package org.supremus.sych.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = findViewById(R.id.title_id);
        Bundle ext = this.getIntent().getExtras();
        if (ext==null) return;
        StringBuilder sb = new StringBuilder();
        for (String key: ext.keySet()) {
            sb.append(key);
            sb.append(":");
            sb.append(ext.get(key));
            sb.append("\n");
        }
        title.setText(sb.toString());
    }
}
