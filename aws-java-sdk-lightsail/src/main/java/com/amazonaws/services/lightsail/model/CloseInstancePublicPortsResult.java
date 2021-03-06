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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/CloseInstancePublicPorts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloseInstancePublicPortsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes the result of the action, such as the status of the request, the timestamp of the
     * request, and the resources affected by the request.
     * </p>
     */
    private Operation operation;

    /**
     * <p>
     * An object that describes the result of the action, such as the status of the request, the timestamp of the
     * request, and the resources affected by the request.
     * </p>
     * 
     * @param operation
     *        An object that describes the result of the action, such as the status of the request, the timestamp of the
     *        request, and the resources affected by the request.
     */

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * An object that describes the result of the action, such as the status of the request, the timestamp of the
     * request, and the resources affected by the request.
     * </p>
     * 
     * @return An object that describes the result of the action, such as the status of the request, the timestamp of
     *         the request, and the resources affected by the request.
     */

    public Operation getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * An object that describes the result of the action, such as the status of the request, the timestamp of the
     * request, and the resources affected by the request.
     * </p>
     * 
     * @param operation
     *        An object that describes the result of the action, such as the status of the request, the timestamp of the
     *        request, and the resources affected by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloseInstancePublicPortsResult withOperation(Operation operation) {
        setOperation(operation);
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
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloseInstancePublicPortsResult == false)
            return false;
        CloseInstancePublicPortsResult other = (CloseInstancePublicPortsResult) obj;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        return hashCode;
    }

    @Override
    public CloseInstancePublicPortsResult clone() {
        try {
            return (CloseInstancePublicPortsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
