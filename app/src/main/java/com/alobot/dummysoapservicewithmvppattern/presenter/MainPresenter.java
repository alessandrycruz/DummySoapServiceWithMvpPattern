package com.alobot.dummysoapservicewithmvppattern.presenter;

import com.alobot.dummysoapservicewithmvppattern.model.MainModel;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Annotation;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Comment;
import com.alobot.dummysoapservicewithmvppattern.model.tasks.Taskset;
import com.alobot.dummysoapservicewithmvppattern.model.tasks.interfaces.Base_Interface;
import com.alobot.dummysoapservicewithmvppattern.presenter.interfaces.Presenter_Interface;
import com.alobot.dummysoapservicewithmvppattern.view.interfaces.View_Interface;

public class MainPresenter implements Presenter_Interface {
    private View_Interface mView_Interface;
    private MainModel mMainModel;
    private Taskset mTaskset;

    public MainPresenter(View_Interface view_Interface) {
        this.mView_Interface = view_Interface;
        this.mMainModel = new MainModel();
        mTaskset = new Taskset();
    }

    @Override
    public void onCreate() {
        mMainModel = new MainModel();
        mTaskset = new Taskset();
    }

    @Override
    public void onStart() {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void onStop() {
    }

    @Override
    public void onDestroy() {
    }

    public void onSendAnnotationClick(Annotation annotation) {
        final String xml = mMainModel.annotationPojo2Xml(annotation);

        if (xml != null && !xml.isEmpty()) {
            // Send Annotation Task
            mTaskset.executeSendAnnotation_Task(new Base_Interface() {
                @Override
                public void onSuccess() {
                    mView_Interface.onXmlSerializerOK(xml);
                }

                @Override
                public void onError(int status) {
                    mView_Interface.onXmlSerilizerError();
                }
            });
        } else {
            mView_Interface.onXmlSerilizerError();
        }
    }

    public void onSendCommentClick(Comment comment) {
        final String xml = mMainModel.commentPojo2Xml(comment);

        if (xml != null && !xml.isEmpty()) {
            // Send Comment Task
            mTaskset.executeSendComment_Task(new Base_Interface() {
                @Override
                public void onSuccess() {
                    mView_Interface.onXmlSerializerOK(xml);
                }

                @Override
                public void onError(int status) {
                    mView_Interface.onXmlSerilizerError();
                }
            });
        } else {
            mView_Interface.onXmlSerilizerError();
        }
    }
}