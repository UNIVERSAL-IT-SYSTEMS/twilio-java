package com.twilio.sdk.verbs;

/*
Copyright (c) 2008-2015 Twilio, Inc.

Permission is hereby granted, free of charge, to any person
obtaining a copy of this software and associated documentation
files (the "Software"), to deal in the Software without
restriction, including without limitation the rights to use,
copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the
Software is furnished to do so, subject to the following
conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.
*/

/**
 * The Class Conference.
 */
public class Conference extends Verb {

    /* Constants */

    public static final String BEEP_TRUE = "true";
    public static final String BEEP_FALSE = "false";
    public static final String BEEP_ONEXIT = "onExit";
    public static final String BEEP_ONENTER = "onEnter";

    /**
     * Instantiates a new conference.
     *
     * @param name the name
     */
    public Conference(final String name) {
        super(V_CONFERENCE, name);
        allowedVerbs = null;
    }

    /**
     * Sets the boolean.
     *
     * @param attr the attr
     * @param bool the bool
     */
    private void setBoolean(final String attr, final Boolean bool) {
        if (bool) {
            set(attr, "true");
        } else {
            set(attr, "false");
        }
    }

    /**
     * Sets the muted.
     *
     * @param bool the new muted
     */
    public void setMuted(final Boolean bool) {
        setBoolean("muted", bool);
    }

    /**
     * Sets the beep behavior. <ul> <li>"true" - beep on enter and exit</li> <li>"false" - no beep</li> <li>"onEnter" -
     * beep on enter</li> <li>"onExit" - beep on exit</li> </ul>
     *
     * @param value the new beep behavior
     */
    public void setBeep(final String value) {
        set("beep", value);
    }

    /**
     * Sets the start conference on enter.
     *
     * @param bool the new start conference on enter
     */
    public void setStartConferenceOnEnter(final Boolean bool) {
        setBoolean("startConferenceOnEnter", bool);
    }

    /**
     * Sets the end conference on exit.
     *
     * @param bool the new end conference on exit
     */
    public void setEndConferenceOnExit(final Boolean bool) {
        setBoolean("endConferenceOnExit", bool);
    }

    /**
     * Sets the wait method.
     *
     * @param method the new wait method
     */
    public void setWaitMethod(final String method) {
        set("waitMethod", method);
    }

    /**
     * Sets the wait url.
     *
     * @param url the new wait url
     */
    public void setWaitUrl(final String url) {
        set("waitUrl", url);
    }

    /**
     * Sets the maximum number of participants you want to allow
     *
     * @param i the new maxParticipants value
     */
    public void setMaxParticipants(final int i) {
        set("maxParticipants", Integer.toString(i));
    }

}

