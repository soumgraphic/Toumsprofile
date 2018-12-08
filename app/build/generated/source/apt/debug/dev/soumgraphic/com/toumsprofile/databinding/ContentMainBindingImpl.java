package dev.soumgraphic.com.toumsprofile.databinding;
import dev.soumgraphic.com.toumsprofile.R;
import dev.soumgraphic.com.toumsprofile.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContentMainBindingImpl extends ContentMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recycler_view, 11);
    }
    // views
    @NonNull
    private final android.support.v4.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.support.design.widget.FloatingActionButton mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mHandlersOnFollowingClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mHandlersOnFollowersClickedAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mHandlersOnPostsClickedAndroidViewViewOnClickListener;
    private OnLongClickListenerImpl mHandlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener;
    private OnClickListenerImpl3 mHandlersOnProfileFabClickedAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ContentMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ContentMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[1]
            , (android.support.v7.widget.RecyclerView) bindings[11]
            );
        this.mboundView0 = (android.support.v4.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView2 = (android.support.design.widget.FloatingActionButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.profileImage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.user == variableId) {
            setUser((dev.soumgraphic.com.toumsprofile.model.User) variable);
        }
        else if (BR.handlers == variableId) {
            setHandlers((dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable dev.soumgraphic.com.toumsprofile.model.User User) {
        updateRegistration(2, User);
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public void setHandlers(@Nullable dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers Handlers) {
        this.mHandlers = Handlers;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.handlers);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUserNumberOfFollowing((android.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 1 :
                return onChangeUserNumberOfPosts((android.databinding.ObservableField<java.lang.Long>) object, fieldId);
            case 2 :
                return onChangeUser((dev.soumgraphic.com.toumsprofile.model.User) object, fieldId);
            case 3 :
                return onChangeUserNumberOfFollowers((android.databinding.ObservableField<java.lang.Long>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUserNumberOfFollowing(android.databinding.ObservableField<java.lang.Long> UserNumberOfFollowing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserNumberOfPosts(android.databinding.ObservableField<java.lang.Long> UserNumberOfPosts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUser(dev.soumgraphic.com.toumsprofile.model.User User, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.profileImage) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        else if (fieldId == BR.name) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        else if (fieldId == BR.about) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        else if (fieldId == BR.numberOfFollowers) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeUserNumberOfFollowers(android.databinding.ObservableField<java.lang.Long> UserNumberOfFollowers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userName = null;
        android.databinding.ObservableField<java.lang.Long> userNumberOfFollowing = null;
        java.lang.Long userNumberOfPostsGet = null;
        long androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowersGet = 0L;
        java.lang.String bindingUtilsConvertToSuffixUserNumberOfFollowing = null;
        java.lang.String userProfileImage = null;
        android.databinding.ObservableField<java.lang.Long> userNumberOfPosts = null;
        java.lang.String userAbout = null;
        java.lang.Long userNumberOfFollowersGet = null;
        long androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowingGet = 0L;
        android.view.View.OnClickListener handlersOnFollowingClickedAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener handlersOnFollowersClickedAndroidViewViewOnClickListener = null;
        long androidDatabindingViewDataBindingSafeUnboxUserNumberOfPostsGet = 0L;
        java.lang.Long userNumberOfFollowingGet = null;
        dev.soumgraphic.com.toumsprofile.model.User user = mUser;
        android.view.View.OnClickListener handlersOnPostsClickedAndroidViewViewOnClickListener = null;
        dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers handlers = mHandlers;
        android.view.View.OnLongClickListener handlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener = null;
        java.lang.String bindingUtilsConvertToSuffixUserNumberOfFollowers = null;
        android.view.View.OnClickListener handlersOnProfileFabClickedAndroidViewViewOnClickListener = null;
        android.databinding.ObservableField<java.lang.Long> userNumberOfFollowers = null;
        java.lang.String bindingUtilsConvertToSuffixUserNumberOfPosts = null;

        if ((dirtyFlags & 0x1efL) != 0) {


            if ((dirtyFlags & 0x144L) != 0) {

                    if (user != null) {
                        // read user.name
                        userName = user.getName();
                    }
            }
            if ((dirtyFlags & 0x105L) != 0) {

                    if (user != null) {
                        // read user.numberOfFollowing
                        userNumberOfFollowing = user.getNumberOfFollowing();
                    }
                    updateRegistration(0, userNumberOfFollowing);


                    if (userNumberOfFollowing != null) {
                        // read user.numberOfFollowing.get()
                        userNumberOfFollowingGet = userNumberOfFollowing.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(user.numberOfFollowing.get())
                    androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowingGet = android.databinding.ViewDataBinding.safeUnbox(userNumberOfFollowingGet);


                    // read BindingUtils.convertToSuffix(android.databinding.ViewDataBinding.safeUnbox(user.numberOfFollowing.get()))
                    bindingUtilsConvertToSuffixUserNumberOfFollowing = dev.soumgraphic.com.toumsprofile.utils.BindingUtils.convertToSuffix(androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowingGet);
            }
            if ((dirtyFlags & 0x124L) != 0) {

                    if (user != null) {
                        // read user.profileImage
                        userProfileImage = user.getProfileImage();
                    }
            }
            if ((dirtyFlags & 0x106L) != 0) {

                    if (user != null) {
                        // read user.numberOfPosts
                        userNumberOfPosts = user.getNumberOfPosts();
                    }
                    updateRegistration(1, userNumberOfPosts);


                    if (userNumberOfPosts != null) {
                        // read user.numberOfPosts.get()
                        userNumberOfPostsGet = userNumberOfPosts.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(user.numberOfPosts.get())
                    androidDatabindingViewDataBindingSafeUnboxUserNumberOfPostsGet = android.databinding.ViewDataBinding.safeUnbox(userNumberOfPostsGet);


                    // read BindingUtils.convertToSuffix(android.databinding.ViewDataBinding.safeUnbox(user.numberOfPosts.get()))
                    bindingUtilsConvertToSuffixUserNumberOfPosts = dev.soumgraphic.com.toumsprofile.utils.BindingUtils.convertToSuffix(androidDatabindingViewDataBindingSafeUnboxUserNumberOfPostsGet);
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (user != null) {
                        // read user.about
                        userAbout = user.getAbout();
                    }
            }
            if ((dirtyFlags & 0x10cL) != 0) {

                    if (user != null) {
                        // read user.numberOfFollowers
                        userNumberOfFollowers = user.getNumberOfFollowers();
                    }
                    updateRegistration(3, userNumberOfFollowers);


                    if (userNumberOfFollowers != null) {
                        // read user.numberOfFollowers.get()
                        userNumberOfFollowersGet = userNumberOfFollowers.get();
                    }


                    // read android.databinding.ViewDataBinding.safeUnbox(user.numberOfFollowers.get())
                    androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowersGet = android.databinding.ViewDataBinding.safeUnbox(userNumberOfFollowersGet);


                    // read BindingUtils.convertToSuffix(android.databinding.ViewDataBinding.safeUnbox(user.numberOfFollowers.get()))
                    bindingUtilsConvertToSuffixUserNumberOfFollowers = dev.soumgraphic.com.toumsprofile.utils.BindingUtils.convertToSuffix(androidDatabindingViewDataBindingSafeUnboxUserNumberOfFollowersGet);
            }
        }
        if ((dirtyFlags & 0x110L) != 0) {



                if (handlers != null) {
                    // read handlers::onFollowingClicked
                    handlersOnFollowingClickedAndroidViewViewOnClickListener = (((mHandlersOnFollowingClickedAndroidViewViewOnClickListener == null) ? (mHandlersOnFollowingClickedAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mHandlersOnFollowingClickedAndroidViewViewOnClickListener).setValue(handlers));
                    // read handlers::onFollowersClicked
                    handlersOnFollowersClickedAndroidViewViewOnClickListener = (((mHandlersOnFollowersClickedAndroidViewViewOnClickListener == null) ? (mHandlersOnFollowersClickedAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mHandlersOnFollowersClickedAndroidViewViewOnClickListener).setValue(handlers));
                    // read handlers::onPostsClicked
                    handlersOnPostsClickedAndroidViewViewOnClickListener = (((mHandlersOnPostsClickedAndroidViewViewOnClickListener == null) ? (mHandlersOnPostsClickedAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mHandlersOnPostsClickedAndroidViewViewOnClickListener).setValue(handlers));
                    // read handlers::onProfileImageLongPressed
                    handlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener = (((mHandlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener == null) ? (mHandlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener = new OnLongClickListenerImpl()) : mHandlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener).setValue(handlers));
                    // read handlers::onProfileFabClicked
                    handlersOnProfileFabClickedAndroidViewViewOnClickListener = (((mHandlersOnProfileFabClickedAndroidViewViewOnClickListener == null) ? (mHandlersOnProfileFabClickedAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mHandlersOnProfileFabClickedAndroidViewViewOnClickListener).setValue(handlers));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x105L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, bindingUtilsConvertToSuffixUserNumberOfFollowing);
        }
        if ((dirtyFlags & 0x110L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(handlersOnProfileFabClickedAndroidViewViewOnClickListener);
            this.mboundView5.setOnClickListener(handlersOnPostsClickedAndroidViewViewOnClickListener);
            this.mboundView7.setOnClickListener(handlersOnFollowersClickedAndroidViewViewOnClickListener);
            this.mboundView9.setOnClickListener(handlersOnFollowingClickedAndroidViewViewOnClickListener);
            this.profileImage.setOnLongClickListener(handlersOnProfileImageLongPressedAndroidViewViewOnLongClickListener);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, userName);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userAbout);
        }
        if ((dirtyFlags & 0x106L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, bindingUtilsConvertToSuffixUserNumberOfPosts);
        }
        if ((dirtyFlags & 0x10cL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, bindingUtilsConvertToSuffixUserNumberOfFollowers);
        }
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            dev.soumgraphic.com.toumsprofile.model.User.loadImage(this.profileImage, userProfileImage);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value;
        public OnClickListenerImpl setValue(dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onFollowingClicked(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value;
        public OnClickListenerImpl1 setValue(dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onFollowersClicked(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value;
        public OnClickListenerImpl2 setValue(dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onPostsClicked(arg0); 
        }
    }
    public static class OnLongClickListenerImpl implements android.view.View.OnLongClickListener{
        private dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value;
        public OnLongClickListenerImpl setValue(dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onLongClick(android.view.View arg0) {
            return this.value.onProfileImageLongPressed(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value;
        public OnClickListenerImpl3 setValue(dev.soumgraphic.com.toumsprofile.view.MainActivity.MyClickHandlers value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onProfileFabClicked(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user.numberOfFollowing
        flag 1 (0x2L): user.numberOfPosts
        flag 2 (0x3L): user
        flag 3 (0x4L): user.numberOfFollowers
        flag 4 (0x5L): handlers
        flag 5 (0x6L): user.profileImage
        flag 6 (0x7L): user.name
        flag 7 (0x8L): user.about
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}