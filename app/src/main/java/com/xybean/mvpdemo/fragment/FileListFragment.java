package com.xybean.mvpdemo.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xybean.mvpdemo.R;

/**
 * Author @xybean on 2018/6/20.
 */
public class FileListFragment extends Fragment {

    private RecyclerView recyclerView;
    private TextView tvCount;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_file_list, null);
        recyclerView = root.findViewById(R.id.rl_file);
        tvCount = root.findViewById(R.id.tv_count);

        return root;
    }

}
