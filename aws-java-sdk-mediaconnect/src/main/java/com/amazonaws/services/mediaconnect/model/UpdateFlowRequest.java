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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request to update flow.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/UpdateFlow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFlowRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The flow that you want to update. */
    private String flowArn;

    private UpdateFailoverConfig sourceFailoverConfig;

    /**
     * The flow that you want to update.
     * 
     * @param flowArn
     *        The flow that you want to update.
     */

    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The flow that you want to update.
     * 
     * @return The flow that you want to update.
     */

    public String getFlowArn() {
        return this.flowArn;
    }

    /**
     * The flow that you want to update.
     * 
     * @param flowArn
     *        The flow that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowRequest withFlowArn(String flowArn) {
        setFlowArn(flowArn);
        return this;
    }

    /**
     * @param sourceFailoverConfig
     */

    public void setSourceFailoverConfig(UpdateFailoverConfig sourceFailoverConfig) {
        this.sourceFailoverConfig = sourceFailoverConfig;
    }

    /**
     * @return
     */

    public UpdateFailoverConfig getSourceFailoverConfig() {
        return this.sourceFailoverConfig;
    }

    /**
     * @param sourceFailoverConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFlowRequest withSourceFailoverConfig(UpdateFailoverConfig sourceFailoverConfig) {
        setSourceFailoverConfig(sourceFailoverConfig);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFlowArn() != null)
            sb.append("FlowArn: ").append(getFlowArn()).append(",");
        if (getSourceFailoverConfig() != null)
            sb.append("SourceFailoverConfig: ").append(getSourceFailoverConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFlowRequest == false)
            return false;
        UpdateFlowRequest other = (UpdateFlowRequest) obj;
        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        if (other.getSourceFailoverConfig() == null ^ this.getSourceFailoverConfig() == null)
            return false;
        if (other.getSourceFailoverConfig() != null && other.getSourceFailoverConfig().equals(this.getSourceFailoverConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        hashCode = prime * hashCode + ((getSourceFailoverConfig() == null) ? 0 : getSourceFailoverConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFlowRequest clone() {
        return (UpdateFlowRequest) super.clone();
    }

}
