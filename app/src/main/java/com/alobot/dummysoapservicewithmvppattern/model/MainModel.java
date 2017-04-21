package com.alobot.dummysoapservicewithmvppattern.model;

import com.alobot.dummysoapservicewithmvppattern.model.pojos.Annotation;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Comment;
import com.alobot.dummysoapservicewithmvppattern.model.utils.Xml;

public class MainModel {
    public String commentPojo2Xml(Comment comment) {
        return Xml.commentSerializer(comment).toString();
    }

    public String annotationPojo2Xml(Annotation annotation) {
        return Xml.annotationSerializer(annotation).toString();
    }
}
