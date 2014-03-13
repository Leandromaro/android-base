package com.flatsoft.base.utils;

import com.crittercism.app.Crittercism;

import timber.log.Timber;

/**
 * Created by adelnizamutdinov on 03/03/2014
 */
public class TimberCrashReportingTree extends Timber.HollowTree {
    @Override public void e(Throwable t, String message, Object... args) {
        Crittercism.logHandledException(t);
    }
}