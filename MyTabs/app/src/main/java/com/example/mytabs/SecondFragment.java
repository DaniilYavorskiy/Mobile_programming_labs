package com.example.mytabs;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SecondFragment extends Fragment implements AdapterView.OnItemClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second,container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] cars={"Toyota", "Hummer", "Lexus", "Cadillac", "KAMAZ", "Bugatti", "Porsche", "Газель"};

        ListView listView = (ListView)view.findViewById(R.id.lst);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, cars);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position==0){
            Toast.makeText(getActivity(), "Toyota", Toast.LENGTH_SHORT).show();
        }
        if (position==1){
            Toast.makeText(getActivity(), "Hummer", Toast.LENGTH_SHORT).show();
        }
        if (position==2){
            Toast.makeText(getActivity(), "Lexus", Toast.LENGTH_SHORT).show();
        }
        if (position==3){
            Toast.makeText(getActivity(), "Cadillac", Toast.LENGTH_SHORT).show();
        }
        if (position==4){
            Toast.makeText(getActivity(), "KAMAZ", Toast.LENGTH_SHORT).show();
        }
        if (position==5){
            Toast.makeText(getActivity(), "Bugatti", Toast.LENGTH_SHORT).show();
        }
        if (position==6){
            Toast.makeText(getActivity(), "Porsche", Toast.LENGTH_SHORT).show();
        }
        if (position==7){
            Toast.makeText(getActivity(), "Газель", Toast.LENGTH_SHORT).show();
        }
    }
}