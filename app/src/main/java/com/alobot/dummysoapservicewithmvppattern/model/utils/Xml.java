package com.alobot.dummysoapservicewithmvppattern.model.utils;

import com.alobot.dummysoapservicewithmvppattern.model.pojos.Annotation;
import com.alobot.dummysoapservicewithmvppattern.model.pojos.Comment;

import org.xmlpull.v1.XmlSerializer;

import java.io.StringWriter;

public class Xml {
    private static final String ENCODING = "UTF-8";
    private static final String FEATURE = "http://xmlpull.org/v1/doc/features.html#indent-output";
    private static final String NAMESPACE = "";
    private static final String COMMENTS_TAG = "comments";
    private static final String COMMENT_TAG = "comments";
    private static final String ID_TAG = "id";

    public static StringWriter commentSerializer(Comment comment) {
        XmlSerializer xmlSerializer = android.util.Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();

        try {
            xmlSerializer.setOutput(stringWriter);

            // Start Document
            xmlSerializer.startDocument(ENCODING, true);
            xmlSerializer.setFeature(FEATURE, true);

            xmlSerializer.startTag(NAMESPACE, COMMENTS_TAG);

            xmlSerializer.attribute(NAMESPACE, ID_TAG, comment.getId());

            xmlSerializer.startTag(NAMESPACE, COMMENT_TAG);
            xmlSerializer.text(comment.getComment());
            xmlSerializer.endTag(NAMESPACE, COMMENT_TAG);

            xmlSerializer.endTag(NAMESPACE, COMMENTS_TAG);

            xmlSerializer.endDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringWriter;
    }

    public static StringWriter annotationSerializer(Annotation annotation) {
        XmlSerializer xmlSerializer = android.util.Xml.newSerializer();
        StringWriter stringWriter = new StringWriter();

        try {
            xmlSerializer.setOutput(stringWriter);

            // Start Document
            xmlSerializer.startDocument(ENCODING, true);
            xmlSerializer.setFeature(FEATURE, true);

            xmlSerializer.startTag(NAMESPACE, COMMENTS_TAG);

            xmlSerializer.attribute(NAMESPACE, ID_TAG, annotation.getId());

            xmlSerializer.startTag(NAMESPACE, COMMENT_TAG);
            xmlSerializer.text(annotation.getAnnotation());
            xmlSerializer.endTag(NAMESPACE, COMMENT_TAG);

            xmlSerializer.endTag(NAMESPACE, COMMENTS_TAG);

            xmlSerializer.endDocument();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return stringWriter;
    }
}
