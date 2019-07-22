package com.example.amst3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.EventLog;
import android.widget.Adapter;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class calendarActivity extends AppCompatActivity {
    private CalendarView calendarView;
    private ListView listView;
    private EventAdapter adapter;
    private ArrayList<Event> listEvents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        listView = (ListView) findViewById(R.id.listView);
        adapter = new EventAdapter(listEvents,this);
        listView.setAdapter(adapter);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast
                if((year==2019)&&((month+1)==7)&&(dayOfMonth==23)){
                    listEvents.clear();
                    updateItems();
                    adapter.notifyDataSetChanged();
                }
                else{
                    listEvents.clear();
                    adapter.notifyDataSetChanged();
                }
                Toast.makeText(getApplicationContext(), dayOfMonth + "/" + (month+1) + "/" + year, Toast.LENGTH_SHORT).show();
            }
        });

    }

        private void updateItems(){
            listEvents.add(new Event("22:00", "1h00", "Entrega de deber de PST", "ESPOL"));
        }
}
