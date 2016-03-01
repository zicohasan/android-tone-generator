package com.github.axet.tonegenerator;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    int tone;
    TonesAdapter tones;
    ListView list;
    ToneGenerator generator = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = (ListView) findViewById(R.id.list);
        tones = new TonesAdapter(this, Arrays.asList(ToneArray.tones));
        list.setAdapter(tones);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                tone = position;
                load(position);
            }
        });

        findViewById(R.id.tone_prev).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tone = tone - 1;
                if (tone < 0)
                    tone = 0;
                load(tone);

                play();
            }
        });

        findViewById(R.id.tone_next).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tone = tone + 1;
                int max = ToneArray.tones.length - 1;
                if(tone >= max)
                    tone = max;
                load(tone);

                play();
            }
        });

        findViewById(R.id.tone_play).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
            }
        });

        load(tone);
    }

    void play() {
        generator.startTone(tone, 1000);
    }

    void load(int i) {
        tones.select(i);
        list.smoothScrollToPosition(i);

        Tone t = ToneArray.tones[i];
        TextView name = (TextView) findViewById(R.id.tone_name);
        TextView desc = (TextView) findViewById(R.id.tone_desc);
        name.setText(t.name.trim());
        desc.setText(t.description.trim());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
