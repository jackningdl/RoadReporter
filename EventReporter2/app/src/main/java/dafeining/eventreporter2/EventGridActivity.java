package dafeining.eventreporter2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dafeining.eventreporter2.Fragments.CommentFragment;

public class EventGridActivity extends AppCompatActivity {

    int pos = 0;
    CommentFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_grid);

        Intent intent = getIntent();
        pos = intent.getIntExtra("position", 0);
        fragment = new CommentFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.grid_container, fragment).commit();
    }

    // 在所有的UI都出来以后才会被调用
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        fragment.onItemSelected(pos);
    }
}
