package dev.soumgraphic.com.toumsprofile.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import dev.soumgraphic.com.toumsprofile.model.Post;

public abstract class PostRowItemBinding extends ViewDataBinding {
  @NonNull
  public final ImageView thumbnail;

  @Bindable
  protected Post mPost;

  protected PostRowItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView thumbnail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.thumbnail = thumbnail;
  }

  public abstract void setPost(@Nullable Post post);

  @Nullable
  public Post getPost() {
    return mPost;
  }

  @NonNull
  public static PostRowItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostRowItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostRowItemBinding>inflate(inflater, dev.soumgraphic.com.toumsprofile.R.layout.post_row_item, root, attachToRoot, component);
  }

  @NonNull
  public static PostRowItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static PostRowItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<PostRowItemBinding>inflate(inflater, dev.soumgraphic.com.toumsprofile.R.layout.post_row_item, null, false, component);
  }

  public static PostRowItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static PostRowItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (PostRowItemBinding)bind(component, view, dev.soumgraphic.com.toumsprofile.R.layout.post_row_item);
  }
}
