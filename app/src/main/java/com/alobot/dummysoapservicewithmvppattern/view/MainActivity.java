package com.alobot.dummysoapservicewithmvppattern.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.alobot.dummysoapservicewithmvppattern.R;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Annotation;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Comment;
import com.alobot.dummysoapservicewithmvppattern.presenter.MainPresenter;
import com.alobot.dummysoapservicewithmvppattern.view.interfaces.View_Interface;

public class MainActivity extends AppCompatActivity implements View_Interface {
    private static String TAG = MainActivity.class.getSimpleName();

    private EditText mEditTextAnnotation;
    private EditText mEditTextComment;
    private MainPresenter mMainPresenter = new MainPresenter(this);
    private TextView mTextViewXml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewXml = (TextView) findViewById(R.id.text_view_xml);
        mEditTextAnnotation = (EditText) findViewById(R.id.edit_text_annotation);
        mEditTextComment = (EditText) findViewById(R.id.edit_text_comment);

        mMainPresenter.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();

        mMainPresenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        mMainPresenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        mMainPresenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();

        mMainPresenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mMainPresenter.onDestroy();
    }

    public void onSendAnnotationClick(View view) {
        mMainPresenter.onSendAnnotationClick(new Annotation("1", mEditTextAnnotation.getText().toString()));
    }

    public void onSendCommentClick(View view) {
        mMainPresenter.onSendCommentClick(new Comment("1", mEditTextComment.getText().toString()));
    }

    @Override
    public void onXmlSerializerOK(String xml) {
        mTextViewXml.setText(xml);
    }

    @Override
    public void onXmlSerilizerError() {
        Toast.makeText(getApplicationContext(), "Some error.", Toast.LENGTH_SHORT).show();
    }
}
