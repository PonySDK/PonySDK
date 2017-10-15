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

package com.ponysdk.core.model;

public enum ValueTypeModel {

    NULL(ValueTypeModel.NULL_SIZE),
    BOOLEAN(ValueTypeModel.BOOLEAN_SIZE),
    BYTE(ValueTypeModel.BYTE_SIZE),
    SHORT(ValueTypeModel.SHORT_SIZE),
    INTEGER(ValueTypeModel.INTEGER_SIZE),
    LONG(ValueTypeModel.LONG_SIZE),
    DOUBLE(ValueTypeModel.DOUBLE_SIZE),
    STRING(ValueTypeModel.STRING_SIZE),
    JSON_OBJECT(ValueTypeModel.JSON_OBJECT_SIZE);

    public static final int NULL_SIZE = 0;
    public static final int BOOLEAN_SIZE = 1;
    public static final int BYTE_SIZE = 1;
    public static final int SHORT_SIZE = 2;
    public static final int INTEGER_SIZE = 4;
    public static final int LONG_SIZE = 8;
    public static final int DOUBLE_SIZE = 16;
    public static final int STRING_SIZE = -1;
    public static final int JSON_OBJECT_SIZE = -1;

    private static final ValueTypeModel[] VALUES = ValueTypeModel.values();

    private final int size;

    ValueTypeModel(final int size) {
        this.size = size;
    }

    public final int getSize() {
        return size;
    }

    public final byte getValue() {
        return (byte) ordinal();
    }

    public static final ValueTypeModel fromRawValue(final byte rawValue) {
        return VALUES[rawValue];
    }

}