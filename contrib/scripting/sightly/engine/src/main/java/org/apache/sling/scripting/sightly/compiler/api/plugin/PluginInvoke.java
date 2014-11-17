/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.compiler.api.plugin;

import org.apache.sling.scripting.sightly.compiler.api.expression.Expression;
import org.apache.sling.scripting.sightly.compiler.api.expression.ExpressionNode;
import org.apache.sling.scripting.sightly.compiler.util.stream.PushStream;
import org.apache.sling.scripting.sightly.compiler.api.expression.Expression;
import org.apache.sling.scripting.sightly.compiler.util.stream.PushStream;

/**
 * General interface for plugins
 */
public interface PluginInvoke {

    void beforeElement(PushStream stream, String tagName);

    void beforeTagOpen(PushStream stream);

    void beforeAttributes(PushStream stream);

    void beforeAttribute(PushStream stream, String attributeName);

    void beforeAttributeValue(PushStream stream, String attributeName, ExpressionNode attributeValue);

    void afterAttributeValue(PushStream stream, String attributeName);

    void afterAttribute(PushStream stream, String attributeName);

    void onPluginCall(PushStream stream, PluginCallInfo callInfo, Expression expression);

    void afterAttributes(PushStream stream);

    void afterTagOpen(PushStream stream);

    void beforeChildren(PushStream stream);

    void afterChildren(PushStream stream);

    void beforeTagClose(PushStream stream, boolean isSelfClosing);

    void afterTagClose(PushStream stream, boolean isSelfClosing);

    void afterElement(PushStream stream);

}
