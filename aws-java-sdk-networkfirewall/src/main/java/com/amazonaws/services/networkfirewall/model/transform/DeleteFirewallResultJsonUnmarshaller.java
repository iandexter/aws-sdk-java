/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeleteFirewallResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteFirewallResultJsonUnmarshaller implements Unmarshaller<DeleteFirewallResult, JsonUnmarshallerContext> {

    public DeleteFirewallResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeleteFirewallResult deleteFirewallResult = new DeleteFirewallResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return deleteFirewallResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Firewall", targetDepth)) {
                    context.nextToken();
                    deleteFirewallResult.setFirewall(FirewallJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FirewallStatus", targetDepth)) {
                    context.nextToken();
                    deleteFirewallResult.setFirewallStatus(FirewallStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deleteFirewallResult;
    }

    private static DeleteFirewallResultJsonUnmarshaller instance;

    public static DeleteFirewallResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteFirewallResultJsonUnmarshaller();
        return instance;
    }
}
