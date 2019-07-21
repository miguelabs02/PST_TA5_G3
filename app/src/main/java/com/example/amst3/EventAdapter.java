package com.example.amst3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends BaseAdapter {
    private ArrayList<Event> listEvents;
    private Context context;

    public EventAdapter(ArrayList<Event> listEvents, Context context) {
        this.listEvents = listEvents;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listEvents.size();
    }

    @Override
    public Object getItem(int position) {
        return listEvents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Event item = (Event) getItem(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.event,null);
        TextView hour = (TextView) convertView.findViewById(R.id.hourTxt);
        TextView timeRequired = (TextView) convertView.findViewById(R.id.timeRequiredTxt);
        TextView description = (TextView) convertView.findViewById(R.id.eventTxt);
        TextView place = (TextView) convertView.findViewById(R.id.placeTxt);
        hour.setText(item.getHour());
        timeRequired.setText(item.getTimeRequired());
        description.setText(item.getDescription());
        place.setText(item.getPlace());

        return convertView;
    }
}
