package com.example.lifecyclelog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.lifecyclelog.Util.LifecycleState.CALL_TO_SUPER;
import static com.example.lifecyclelog.Util.LifecycleState.RETURN_FROM_SUPER;
import static com.example.lifecyclelog.Util.recLifeCycle;

/**
 * Created by Vinh.Tran on 6/17/16.
 */
public class AFragment extends TestFragment {

    @Override
    public View
    onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        recLifeCycle(getClass(), CALL_TO_SUPER);
        View v = inflater.inflate(R.layout.fragment_a, container, false);
        recLifeCycle(getClass(), RETURN_FROM_SUPER);
        return v;
    }
}
