package com.thealteria.lifecycleawareexample;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

class MainActivityObserver implements LifecycleObserver {
    private static String TAG = "MainActivityObserver";

    //observer class uses this annotation to keep track of lifecycle events
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreateEvent() {
        Log.i(TAG, "Observe ON_CREATE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStartEvent() {
        Log.i(TAG, "Observe ON_START");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResumeEvent() {
        Log.i(TAG, "Observe ON_RESUME");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPauseEvent() {
        Log.i(TAG, "Observe ON_PAUSE");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStopEvent() {
        Log.i(TAG, "Observe ON_STOP");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroyEvent() {
        Log.i(TAG, "Observe ON_DESTROY");
    }
}
