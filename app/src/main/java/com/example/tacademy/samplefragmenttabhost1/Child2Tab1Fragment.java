package com.example.tacademy.samplefragmenttabhost1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Child2Tab1Fragment extends Fragment {


    public Child2Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_child2_tab1, container, false);
    }

    @Override
    public void onResume() {//액션바의 text 바꾸는 법
        super.onResume();
        getActivity().setTitle("child2 이당");
    }

}
