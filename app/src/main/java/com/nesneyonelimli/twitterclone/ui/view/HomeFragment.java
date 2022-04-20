package com.nesneyonelimli.twitterclone.ui.view;

import android.os.Binder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.nesneyonelimli.twitterclone.R;
import com.nesneyonelimli.twitterclone.databinding.FragmentHomeBinding;
import com.nesneyonelimli.twitterclone.ui.adapter.PostRecyclerAdapter;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private PostRecyclerAdapter recyclerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerAdapter = new PostRecyclerAdapter(getContext());
        binding.homeFragmentPostRecycleView.setAdapter(recyclerAdapter);
        binding.homeFragmentPostRecycleView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
    }
}
