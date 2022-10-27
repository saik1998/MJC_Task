package com.firstapp.mjc_task.ui.timesheet;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firstapp.mjc_task.R;
import com.firstapp.mjc_task.ui.ModelClass;
import com.firstapp.mjc_task.ui.adapter.AdapterClass;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class TimesheetFragment extends Fragment {

    Context context;
    List<ModelClass> modelClassList=new ArrayList<>();

    ModelClass modelClass;
    AdapterClass adapterClass;
    RecyclerView recyclerView;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_timesheet, container, false);

        recyclerView=root.findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));




        adapterClass = new AdapterClass(getContext(), modelClassList);
        recyclerView.setAdapter(adapterClass);


        loadData();

        return root;


    }

    private void loadData() {
        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
        ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
                ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
                ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
                ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);

        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
                ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);

        modelClass=new ModelClass("1234567","Hyderabad","533431","876543","27-10-22 10:00 Am","28-10-22 10:00 pm"
                ,"uyrutyrdfhcjgvjhfksjdluitsyfglhsekrjdhscigyfwghsfsdncwjfgw");

        modelClassList.add(modelClass);



    }

}