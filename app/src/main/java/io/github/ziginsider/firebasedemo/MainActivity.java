package io.github.ziginsider.firebasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {

    EditText input_name, input_email;
    private ListView list_data;
    private ProgressBar circular_progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Firebase demo");
        setSupportActionBar(toolbar);

        //Control
        circular_progress = (ProgressBar) findViewById(R.id.circular_progress);
        input_name = (EditText) findViewById(R.id.name);
        input_email = (EditText) findViewById(R.id.email);
        list_data = (ListView) findViewById(R.id.list_data);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
