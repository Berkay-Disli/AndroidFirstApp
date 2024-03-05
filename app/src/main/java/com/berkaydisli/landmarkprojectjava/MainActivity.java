package com.berkaydisli.landmarkprojectjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.berkaydisli.landmarkprojectjava.databinding.ActivityDetailsBinding;
import com.berkaydisli.landmarkprojectjava.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Landmark> landmarkArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        landmarkArrayList = new ArrayList<>();

        Landmark emirgan = new Landmark("Emirgan", "Love it", R.drawable.emirgan);
        Landmark cekmekoy = new Landmark("Çekmeköy", "I'm new here", R.drawable.cekmekoy);
        Landmark atasehir = new Landmark("Ataşehir", "Meh..", R.drawable.atasehir);

        landmarkArrayList.add(emirgan);
        landmarkArrayList.add(cekmekoy);
        landmarkArrayList.add(atasehir);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        LandmarkAdaptor landmarkAdaptor = new LandmarkAdaptor(landmarkArrayList);
        binding.recyclerView.setAdapter(landmarkAdaptor);

        /*
        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                landmarkArrayList.stream().map(landmark -> landmark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, landmarkArrayList.get(position).name, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("landmark", landmarkArrayList.get(position));
                startActivity(intent);
            }
        });
         */
    }
}