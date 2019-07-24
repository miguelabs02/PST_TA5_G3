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
    /**

     *La clase event adapter tiene como parametro una lista de eventos *que se pueden desplegar el mismo dia, así mismo como un *contexto. *Esta clase extiende de BaseAdapter, el cual tiene
     *metodos *abstractos que debemos sobreescribir.

     **/
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
    /**

     *getView nos permite colocar de manera visible el evento que nos *encontramos en la ListView, y así asignar la hora, el tiempo de *requisición, la descripción y el lugar

     *El metodo retorna una vista.

     **/
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
