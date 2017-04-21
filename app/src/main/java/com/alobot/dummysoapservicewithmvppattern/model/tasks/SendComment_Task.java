package com.alobot.dummysoapservicewithmvppattern.model.tasks;

import android.os.AsyncTask;

import com.alobot.dummysoapservicewithmvppattern.model.tasks.interfaces.Base_Interface;

public class SendComment_Task extends AsyncTask<Void, Void, Integer> {
    private Base_Interface mSendCommand_Interface;

    public SendComment_Task(Base_Interface sendCommand_Interface) {
        this.mSendCommand_Interface = sendCommand_Interface;
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
            mSendCommand_Interface.onSuccess();
        } else {
            mSendCommand_Interface.onError(status);
        }
    }
}
