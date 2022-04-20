package com.nesneyonelimli.twitterclone.ui.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.nesneyonelimli.twitterclone.R;
import com.nesneyonelimli.twitterclone.databinding.ActivityApplicationBinding;

public class ApplicationActivity extends AppCompatActivity {
    private ActivityApplicationBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_application);
        binding.applicationToolbar.setTitle("Twitter Clone");
    }
}
