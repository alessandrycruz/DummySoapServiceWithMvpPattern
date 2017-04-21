package com.alobot.dummysoapservicewithmvppattern.model.tasks;

import android.os.AsyncTask;

import com.alobot.dummysoapservicewithmvppattern.model.tasks.interfaces.Base_Interface;

public class SendAnnotation_Task extends AsyncTask<Void, Void, Integer> {
    private Base_Interface mBase_Interface;

    public SendAnnotation_Task(Base_Interface base_Interface) {
        this.mBase_Interface = base_Interface;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(Void... params) {
        // SOAP WEB SERVICE API OF CHOICE
        return 0;
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(Integer status) {
        super.onPostExecute(status);

        if (status == 0) {
            mBase_Interface.onSuccess();
        } else {
            mBase_Interface.onError(status);
        }
    }
}
