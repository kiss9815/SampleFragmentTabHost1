package com.example.tacademy.samplefragmenttabhost1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment {


    public Tab1Fragment() {
        // Required empty public constructor
    }

    FragmentTabHost tabHost;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        tabHost = (FragmentTabHost)view.findViewById(R.id.tabHost);
        tabHost.setup(getContext(), getChildFragmentManager(), android.R.id.tabcontent);

        tabHost.addTab(tabHost.newTabSpec("child1").setIndicator("CHILD1"), Child1Tab1Fragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("child2").setIndicator("CHILD2"), Child2Tab1Fragment.class, null);
        return view;
    }

}
