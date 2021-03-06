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
package com.amazonaws.services.ecs.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.ecs.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DockerVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DockerVolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> SCOPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("scope").build();
    private static final MarshallingInfo<Boolean> AUTOPROVISION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoprovision").build();
    private static final MarshallingInfo<String> DRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("driver").build();
    private static final MarshallingInfo<Map> DRIVEROPTS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("driverOpts").build();
    private static final MarshallingInfo<Map> LABELS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("labels").build();

    private static final DockerVolumeConfigurationMarshaller instance = new DockerVolumeConfigurationMarshaller();

    public static DockerVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DockerVolumeConfiguration dockerVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (dockerVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(dockerVolumeConfiguration.getScope(), SCOPE_BINDING);
            protocolMarshaller.marshall(dockerVolumeConfiguration.getAutoprovision(), AUTOPROVISION_BINDING);
            protocolMarshaller.marshall(dockerVolumeConfiguration.getDriver(), DRIVER_BINDING);
            protocolMarshaller.marshall(dockerVolumeConfiguration.getDriverOpts(), DRIVEROPTS_BINDING);
            protocolMarshaller.marshall(dockerVolumeConfiguration.getLabels(), LABELS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
