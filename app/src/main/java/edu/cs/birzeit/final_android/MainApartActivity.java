package edu.cs.birzeit.final_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainApartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_apart);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                if(position == 0){
                    Intent intent = new Intent(MainApartActivity.this, ApartmentActivity.class);
                    startActivity(intent);
                } else if (position == 1){
                    Intent intent = new Intent(MainApartActivity.this, AddApartmentActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(MainApartActivity.this, RankApartmentActivity.class);
                    intent.putExtra("open_status_change", true);
                    startActivity(intent);
                }
            }
        };
        ListView listView = (ListView)findViewById(R.id.apartment_menu);
        listView.setOnItemClickListener(itemClickListener);
    }
}