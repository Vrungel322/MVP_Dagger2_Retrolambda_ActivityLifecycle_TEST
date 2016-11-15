package com.nanddgroup.dagger_presenter_test.Presenter;

import android.content.Context;
import android.widget.Toast;

import com.nanddgroup.dagger_presenter_test.View.IMainActivityView;

import javax.inject.Inject;

/**
 * Created by Nikita on 01.11.2016.
 */

public class MainActivityPresenter extends BasePresenter<IMainActivityView> implements IMainActivityPresenter {

    private Context context;

    @Inject
    public MainActivityPresenter(Context context) {
        this.context = context;
    }

    @Override
    public void someAction(){
        Toast.makeText(context, "toast from someAction() with injected context", Toast.LENGTH_SHORT).show();
        getView().doSmthInMainActivity();
    }
}
