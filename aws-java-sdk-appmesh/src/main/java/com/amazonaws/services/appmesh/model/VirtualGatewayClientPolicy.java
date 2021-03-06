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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents a client policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/VirtualGatewayClientPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayClientPolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS) client policy.
     * </p>
     */
    private VirtualGatewayClientPolicyTls tls;

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS) client policy.
     * </p>
     * 
     * @param tls
     *        A reference to an object that represents a Transport Layer Security (TLS) client policy.
     */

    public void setTls(VirtualGatewayClientPolicyTls tls) {
        this.tls = tls;
    }

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS) client policy.
     * </p>
     * 
     * @return A reference to an object that represents a Transport Layer Security (TLS) client policy.
     */

    public VirtualGatewayClientPolicyTls getTls() {
        return this.tls;
    }

    /**
     * <p>
     * A reference to an object that represents a Transport Layer Security (TLS) client policy.
     * </p>
     * 
     * @param tls
     *        A reference to an object that represents a Transport Layer Security (TLS) client policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VirtualGatewayClientPolicy withTls(VirtualGatewayClientPolicyTls tls) {
        setTls(tls);
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
        if (getTls() != null)
            sb.append("Tls: ").append(getTls());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VirtualGatewayClientPolicy == false)
            return false;
        VirtualGatewayClientPolicy other = (VirtualGatewayClientPolicy) obj;
        if (other.getTls() == null ^ this.getTls() == null)
            return false;
        if (other.getTls() != null && other.getTls().equals(this.getTls()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTls() == null) ? 0 : getTls().hashCode());
        return hashCode;
    }

    @Override
    public VirtualGatewayClientPolicy clone() {
        try {
            return (VirtualGatewayClientPolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.VirtualGatewayClientPolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
