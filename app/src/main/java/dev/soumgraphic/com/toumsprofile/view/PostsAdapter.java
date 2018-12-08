package dev.soumgraphic.com.toumsprofile.view;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import dev.soumgraphic.com.toumsprofile.R;
import dev.soumgraphic.com.toumsprofile.databinding.PostRowItemBinding;
import dev.soumgraphic.com.toumsprofile.model.Post;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private List<Post> postList;
    private LayoutInflater layoutInflater;
    private PostsAdapterListener listener;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private final PostRowItemBinding binding;

        public MyViewHolder(final PostRowItemBinding itemBinding){
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }

    public PostsAdapter(List<Post> postList, PostsAdapterListener listener){
        this.postList = postList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        PostRowItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.post_row_item,parent,false);

        return new MyViewHolder(binding);
    }

    public void onBindViewHolder(MyViewHolder holder, final int position){
        holder.binding.setPost(postList.get(position));
        holder.binding.thumbnail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (listener != null){
                    listener.onPostClicked(postList.get(position));
                }
            }
        });
    }

    public int getItemCount(){
        return postList.size();
    }

    public interface PostsAdapterListener {
        void onPostClicked(Post post);
    }


}
