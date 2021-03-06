package com.example.krunal.attendancesystem;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.example.krunal.attendancesystem.Adapters.GridViewAdapter;
import com.example.krunal.attendancesystem.Model.ImageItem;

import java.util.ArrayList;

public class Student_Grid extends ActionBarActivity {

    private GridView gridView;
    private GridViewAdapter gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__grid);


        gridView = (GridView) findViewById(R.id.gridView);
        gridAdapter = new GridViewAdapter(this, R.layout.grid_item_layout, getData());
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                try {
                    ImageItem item = (ImageItem) parent.getItemAtPosition(position);


                    //Create intent
                    Intent intent = new Intent(Student_Grid.this, Student_details.class);
                    intent.putExtra("title", item.getTitle());
                    intent.putExtra("image", item.getImage());

                    //Start details activity
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();

                }
            }
        });
    }


    // Prepare some dummy data for gridview
    private ArrayList<ImageItem> getData() {
        final ArrayList<ImageItem> imageItems = new ArrayList<>();
        TypedArray imgs = getResources().obtainTypedArray(R.array.image_ids);
        for (int i = 0; i < imgs.length(); i++) {
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), imgs.getResourceId(i, -1));
            imageItems.add(new ImageItem(bitmap, "Image#" + i));
        }
        return imageItems;
    }

}


