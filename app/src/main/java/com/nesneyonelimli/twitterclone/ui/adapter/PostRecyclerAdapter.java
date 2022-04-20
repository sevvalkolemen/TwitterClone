package com.nesneyonelimli.twitterclone.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;

import com.nesneyonelimli.twitterclone.R;
import com.nesneyonelimli.twitterclone.databinding.RecyclerHomePostItemBinding;
import com.nesneyonelimli.twitterclone.ui.viewmodel.PostViewModel;

public class PostRecyclerAdapter extends RecyclerView.Adapter<PostRecyclerAdapter.ViewHolder> {
    private RecyclerHomePostItemBinding binding;

    private PostViewModel postViewModel;

    public PostRecyclerAdapter(Context context){
        postViewModel = new ViewModelProvider((ViewModelStoreOwner) context).get(PostViewModel.class);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.recycler_home_post_item,parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        postViewModel.toString();
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull RecyclerHomePostItemBinding binding) {
            super(binding.getRoot());
        }
    }
}
