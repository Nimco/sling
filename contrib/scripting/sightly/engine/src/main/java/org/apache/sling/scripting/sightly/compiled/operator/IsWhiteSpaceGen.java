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

package org.apache.sling.scripting.sightly.compiled.operator;

import org.apache.sling.scripting.sightly.compiled.ExpressionTranslator;
import org.apache.sling.scripting.sightly.compiled.GenHelper;
import org.apache.sling.scripting.sightly.compiled.JavaSource;
import org.apache.sling.scripting.sightly.compiled.SourceGenConstants;
import org.apache.sling.scripting.sightly.compiled.Type;
import org.apache.sling.scripting.sightly.compiled.ExpressionTranslator;
import org.apache.sling.scripting.sightly.compiled.JavaSource;
import org.apache.sling.scripting.sightly.compiled.SourceGenConstants;
import org.apache.sling.scripting.sightly.compiled.Type;

/**
 * Generator for IS_WHITESPACE operator
 */
public final class IsWhiteSpaceGen implements UnaryOpGen {

    public static final IsWhiteSpaceGen INSTANCE = new IsWhiteSpaceGen();

    private IsWhiteSpaceGen() {
    }

    @Override
    public Type returnType(Type operandType) {
        return Type.BOOLEAN;
    }

    @Override
    public void generate(JavaSource source, ExpressionTranslator visitor, TypedNode typedNode) {
        GenHelper.typeCoercion(source, visitor, typedNode, Type.STRING);
        source.startCall(SourceGenConstants.TRIM_METHOD, true)
                .endCall()
                .startCall(SourceGenConstants.STRING_EMPTY, true)
                .endCall();
    }
}
