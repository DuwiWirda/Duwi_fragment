package com.duwi.project;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.duwi.project.R;

public class Fragment1 extends Fragment {
    View view;

    @Override
   public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                            Bundle savedInstanceState){
    view = inflater.inflate(R.layout.fragment_1, container, false);
    return view;
    }
}