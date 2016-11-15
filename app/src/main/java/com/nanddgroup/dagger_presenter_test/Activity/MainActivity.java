package com.nanddgroup.dagger_presenter_test.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nanddgroup.dagger_presenter_test.App;
import com.nanddgroup.dagger_presenter_test.View.IMainActivityView;
import com.nanddgroup.dagger_presenter_test.Presenter.MainActivityPresenter;
import com.nanddgroup.dagger_presenter_test.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements IMainActivityView {
    @Inject
    MainActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.getApp(this).getComponent().inject(this);

        mainActivityPresenter.bind(this);
        mainActivityPresenter.someAction();
    }

    @Override
    protected void onDestroy() {
        mainActivityPresenter.unbind();
        super.onDestroy();
    }

    @Override
    public void doSmthInMainActivity() {
        Toast.makeText(getApplicationContext(), "toast from doSmthInMainActivity()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String string) {

    }
}
