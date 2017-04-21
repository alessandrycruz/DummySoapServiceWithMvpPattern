package com.alobot.dummysoapservicewithmvppattern.model.tasks;

import android.os.AsyncTask;

import com.alobot.dummysoapservicewithmvppattern.model.tasks.interfaces.Base_Interface;

public class Taskset {
    public void executeSendComment_Task(final Base_Interface base_Interface) {
        new SendComment_Task(base_Interface).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    public void executeSendAnnotation_Task(final Base_Interface base_Interface){
        new SendAnnotation_Task(base_Interface).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }
}
