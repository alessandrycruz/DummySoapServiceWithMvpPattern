package com.alobot.dummysoapservicewithmvppattern.model.tasks.interfaces;

public interface Base_Interface {
    void onSuccess();

    void onError(int status);
}
