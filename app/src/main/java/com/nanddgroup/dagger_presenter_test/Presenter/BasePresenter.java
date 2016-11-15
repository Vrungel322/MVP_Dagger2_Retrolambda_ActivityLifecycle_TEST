package com.nanddgroup.dagger_presenter_test.Presenter;

import android.support.annotation.Nullable;

import com.nanddgroup.dagger_presenter_test.View.IAppMainView;

/**
 * Created by Nikita on 01.11.2016.
 */

public abstract class BasePresenter<V extends IAppMainView> implements IPesenter<V> {
    @Nullable
    private V view;

    @Override
    public void bind(V view) {
        this.view = view;
    }

    @Override
    public void unbind() {
        this.view = null;
    }

    @Nullable
    public V getView() {
        return view;
    }
}
