/*
 * Copyright (c) 2011 PonySDK
 *  Owners:
 *  Luciano Broussal  <luciano.broussal AT gmail.com>
 *  Mathieu Barbier   <mathieu.barbier AT gmail.com>
 *  Nicolas Ciaravola <nicolas.ciaravola.pro AT gmail.com>
 *
 *  WebSite:
 *  http://code.google.com/p/pony-sdk/
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.ponysdk.core.server.servlet;

import java.io.Reader;
import java.io.StringReader;

import org.eclipse.jetty.websocket.servlet.ServletUpgradeRequest;

public class PRequest {

    private final ServletUpgradeRequest request;

    private StringReader reader;

    public PRequest(final ServletUpgradeRequest request) {
        this.request = request;
    }

    public Reader getReader() {
        return reader;
    }

    public String getHeader(final String header) {
        return request.getHeader(header);
    }

    public String getRemoteAddr() {
        return request.getRemoteAddress();
    }

    public void setText(final String text) {
        reader = new StringReader(text);
    }

    public String getSessionId() {
        return request.getSession().getId();
    }

}