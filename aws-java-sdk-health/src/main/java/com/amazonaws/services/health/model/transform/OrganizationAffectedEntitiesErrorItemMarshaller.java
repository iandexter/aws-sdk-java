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
package com.amazonaws.services.health.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationAffectedEntitiesErrorItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationAffectedEntitiesErrorItemMarshaller {

    private static final MarshallingInfo<String> AWSACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsAccountId").build();
    private static final MarshallingInfo<String> EVENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("eventArn").build();
    private static final MarshallingInfo<String> ERRORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("errorName").build();
    private static final MarshallingInfo<String> ERRORMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("errorMessage").build();

    private static final OrganizationAffectedEntitiesErrorItemMarshaller instance = new OrganizationAffectedEntitiesErrorItemMarshaller();

    public static OrganizationAffectedEntitiesErrorItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationAffectedEntitiesErrorItem organizationAffectedEntitiesErrorItem, ProtocolMarshaller protocolMarshaller) {

        if (organizationAffectedEntitiesErrorItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationAffectedEntitiesErrorItem.getAwsAccountId(), AWSACCOUNTID_BINDING);
            protocolMarshaller.marshall(organizationAffectedEntitiesErrorItem.getEventArn(), EVENTARN_BINDING);
            protocolMarshaller.marshall(organizationAffectedEntitiesErrorItem.getErrorName(), ERRORNAME_BINDING);
            protocolMarshaller.marshall(organizationAffectedEntitiesErrorItem.getErrorMessage(), ERRORMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
