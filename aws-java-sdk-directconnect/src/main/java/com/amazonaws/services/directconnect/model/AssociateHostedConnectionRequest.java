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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateHostedConnection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateHostedConnectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted connection.
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The ID of the interconnect or the LAG.
     * </p>
     */
    private String parentConnectionId;

    /**
     * <p>
     * The ID of the hosted connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the hosted connection.
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the hosted connection.
     * </p>
     * 
     * @return The ID of the hosted connection.
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the hosted connection.
     * </p>
     * 
     * @param connectionId
     *        The ID of the hosted connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateHostedConnectionRequest withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The ID of the interconnect or the LAG.
     * </p>
     * 
     * @param parentConnectionId
     *        The ID of the interconnect or the LAG.
     */

    public void setParentConnectionId(String parentConnectionId) {
        this.parentConnectionId = parentConnectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or the LAG.
     * </p>
     * 
     * @return The ID of the interconnect or the LAG.
     */

    public String getParentConnectionId() {
        return this.parentConnectionId;
    }

    /**
     * <p>
     * The ID of the interconnect or the LAG.
     * </p>
     * 
     * @param parentConnectionId
     *        The ID of the interconnect or the LAG.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateHostedConnectionRequest withParentConnectionId(String parentConnectionId) {
        setParentConnectionId(parentConnectionId);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getParentConnectionId() != null)
            sb.append("ParentConnectionId: ").append(getParentConnectionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateHostedConnectionRequest == false)
            return false;
        AssociateHostedConnectionRequest other = (AssociateHostedConnectionRequest) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getParentConnectionId() == null ^ this.getParentConnectionId() == null)
            return false;
        if (other.getParentConnectionId() != null && other.getParentConnectionId().equals(this.getParentConnectionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getParentConnectionId() == null) ? 0 : getParentConnectionId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateHostedConnectionRequest clone() {
        return (AssociateHostedConnectionRequest) super.clone();
    }

}
