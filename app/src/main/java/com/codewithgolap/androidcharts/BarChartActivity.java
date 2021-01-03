package com.codewithgolap.androidcharts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        setTitle("Bar Chart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        BarChart barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(2010,350));
        entries.add(new BarEntry(2011,475));
        entries.add(new BarEntry(2012,570));
        entries.add(new BarEntry(2013,650));
        entries.add(new BarEntry(2014,211));
        entries.add(new BarEntry(2015,855));
        entries.add(new BarEntry(2016,360));
        entries.add(new BarEntry(2017,660));

        BarDataSet barDataSet = new BarDataSet(entries, "Entries");
        barDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);

        barChart.setFitBars(true);
        barChart.setData(barData);
        barChart.getDescription().setText("Custom Bar Chart Example");
        barChart.animateY(2000);
    }
}