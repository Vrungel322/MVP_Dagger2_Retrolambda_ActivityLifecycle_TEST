package com.nanddgroup.dagger_presenter_test.Presenter;

import com.nanddgroup.dagger_presenter_test.View.IAppMainView;

/**
 * Created by Nikita on 01.11.2016.
 */
public interface IPesenter<V extends IAppMainView> {
    void bind(V view);

    void unbind();

}
