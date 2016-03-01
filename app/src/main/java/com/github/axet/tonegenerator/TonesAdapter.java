package com.github.axet.tonegenerator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TonesAdapter extends ArrayAdapter<Tone> {
    int select = -1;

    public TonesAdapter(Context context, List<Tone> tones) {
        super(context, 0, tones);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Tone tone = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        if (select == position) {
            convertView.setBackgroundColor(0xff555555);
        } else {
            convertView.setBackgroundColor(0xffffffff);
        }

        // Lookup view for data population
        TextView number = (TextView) convertView.findViewById(R.id.item_number);
        TextView name = (TextView) convertView.findViewById(R.id.item_name);
        //TextView desc = (TextView) convertView.findViewById(R.id.item_desc);

        number.setText("" + tone.id);
        name.setText(tone.name.trim());
        //desc.setText(tone.description.trim());

        return convertView;
    }

    public void select(int i) {
        select = i;
        notifyDataSetChanged();
    }
}