package dev.soumgraphic.com.toumsprofile.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import dev.soumgraphic.com.toumsprofile.model.User;
import dev.soumgraphic.com.toumsprofile.view.MainActivity;

public abstract class ContentMainBinding extends ViewDataBinding {
  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final RecyclerView recyclerView;

  @Bindable
  protected User mUser;

  @Bindable
  protected MainActivity.MyClickHandlers mHandlers;

  protected ContentMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView profileImage, RecyclerView recyclerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.profileImage = profileImage;
    this.recyclerView = recyclerView;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  public abstract void setHandlers(@Nullable MainActivity.MyClickHandlers handlers);

  @Nullable
  public MainActivity.MyClickHandlers getHandlers() {
    return mHandlers;
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentMainBinding>inflate(inflater, dev.soumgraphic.com.toumsprofile.R.layout.content_main, root, attachToRoot, component);
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ContentMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ContentMainBinding>inflate(inflater, dev.soumgraphic.com.toumsprofile.R.layout.content_main, null, false, component);
  }

  public static ContentMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ContentMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ContentMainBinding)bind(component, view, dev.soumgraphic.com.toumsprofile.R.layout.content_main);
  }
}
