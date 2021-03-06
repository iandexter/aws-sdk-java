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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains connection settings for the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerConnectionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerConnectionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is closed
     * by the load balancer.
     * </p>
     */
    private Integer idleTimeout;

    /**
     * <p>
     * The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is closed
     * by the load balancer.
     * </p>
     * 
     * @param idleTimeout
     *        The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is
     *        closed by the load balancer.
     */

    public void setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
    }

    /**
     * <p>
     * The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is closed
     * by the load balancer.
     * </p>
     * 
     * @return The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is
     *         closed by the load balancer.
     */

    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * <p>
     * The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is closed
     * by the load balancer.
     * </p>
     * 
     * @param idleTimeout
     *        The time, in seconds, that the connection can be idle (no data is sent over the connection) before it is
     *        closed by the load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerConnectionSettings withIdleTimeout(Integer idleTimeout) {
        setIdleTimeout(idleTimeout);
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
        if (getIdleTimeout() != null)
            sb.append("IdleTimeout: ").append(getIdleTimeout());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerConnectionSettings == false)
            return false;
        AwsElbLoadBalancerConnectionSettings other = (AwsElbLoadBalancerConnectionSettings) obj;
        if (other.getIdleTimeout() == null ^ this.getIdleTimeout() == null)
            return false;
        if (other.getIdleTimeout() != null && other.getIdleTimeout().equals(this.getIdleTimeout()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdleTimeout() == null) ? 0 : getIdleTimeout().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerConnectionSettings clone() {
        try {
            return (AwsElbLoadBalancerConnectionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerConnectionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
