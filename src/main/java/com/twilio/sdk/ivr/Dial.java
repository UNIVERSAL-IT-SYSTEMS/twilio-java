package com.twilio.sdk.ivr;

import com.google.common.xml.XmlEscapers;

import java.util.Map;

public class Dial extends Action {

    protected final String number;

    public Dial(final String number) {
        this.number = number;
    }

    @Override
    public String execute(final Map<String, String> context) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
               "<Response>\n" +
               "\t<Dial>" + XmlEscapers.xmlAttributeEscaper()
                                       .escape(number) + "</Dial>\n" +
               "</Response>";
    }
}
