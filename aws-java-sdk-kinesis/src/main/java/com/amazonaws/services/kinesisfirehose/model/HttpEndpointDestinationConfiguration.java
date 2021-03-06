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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the configuration of the HTTP endpoint destination.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/HttpEndpointDestinationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpEndpointDestinationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of the HTTP endpoint selected as the destination.
     * </p>
     */
    private HttpEndpointConfiguration endpointConfiguration;
    /**
     * <p>
     * The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     * Firehose treats these options as hints, and it might choose to use more optimal values. The
     * <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify a
     * value for one of them, you must also provide a value for the other.
     * </p>
     */
    private HttpEndpointBufferingHints bufferingHints;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;
    /**
     * <p>
     * The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     * </p>
     */
    private HttpEndpointRequestConfiguration requestConfiguration;

    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     * endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint
     * destination.
     * </p>
     */
    private HttpEndpointRetryOptions retryOptions;
    /**
     * <p>
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint
     * destination. You can back up all documents (<code>AllData</code>) or only the documents that Kinesis Data
     * Firehose could not deliver to the specified HTTP endpoint destination (<code>FailedDataOnly</code>).
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationConfiguration s3Configuration;

    /**
     * <p>
     * The configuration of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param endpointConfiguration
     *        The configuration of the HTTP endpoint selected as the destination.
     */

    public void setEndpointConfiguration(HttpEndpointConfiguration endpointConfiguration) {
        this.endpointConfiguration = endpointConfiguration;
    }

    /**
     * <p>
     * The configuration of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @return The configuration of the HTTP endpoint selected as the destination.
     */

    public HttpEndpointConfiguration getEndpointConfiguration() {
        return this.endpointConfiguration;
    }

    /**
     * <p>
     * The configuration of the HTTP endpoint selected as the destination.
     * </p>
     * 
     * @param endpointConfiguration
     *        The configuration of the HTTP endpoint selected as the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withEndpointConfiguration(HttpEndpointConfiguration endpointConfiguration) {
        setEndpointConfiguration(endpointConfiguration);
        return this;
    }

    /**
     * <p>
     * The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     * Firehose treats these options as hints, and it might choose to use more optimal values. The
     * <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify a
     * value for one of them, you must also provide a value for the other.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     *        Firehose treats these options as hints, and it might choose to use more optimal values. The
     *        <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify
     *        a value for one of them, you must also provide a value for the other.
     */

    public void setBufferingHints(HttpEndpointBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    /**
     * <p>
     * The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     * Firehose treats these options as hints, and it might choose to use more optimal values. The
     * <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify a
     * value for one of them, you must also provide a value for the other.
     * </p>
     * 
     * @return The buffering options that can be used before data is delivered to the specified destination. Kinesis
     *         Data Firehose treats these options as hints, and it might choose to use more optimal values. The
     *         <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you
     *         specify a value for one of them, you must also provide a value for the other.
     */

    public HttpEndpointBufferingHints getBufferingHints() {
        return this.bufferingHints;
    }

    /**
     * <p>
     * The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     * Firehose treats these options as hints, and it might choose to use more optimal values. The
     * <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify a
     * value for one of them, you must also provide a value for the other.
     * </p>
     * 
     * @param bufferingHints
     *        The buffering options that can be used before data is delivered to the specified destination. Kinesis Data
     *        Firehose treats these options as hints, and it might choose to use more optimal values. The
     *        <code>SizeInMBs</code> and <code>IntervalInSeconds</code> parameters are optional. However, if you specify
     *        a value for one of them, you must also provide a value for the other.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withBufferingHints(HttpEndpointBufferingHints bufferingHints) {
        setBufferingHints(bufferingHints);
        return this;
    }

    /**
     * @param cloudWatchLoggingOptions
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * @return
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * @param cloudWatchLoggingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * <p>
     * The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     * </p>
     * 
     * @param requestConfiguration
     *        The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     */

    public void setRequestConfiguration(HttpEndpointRequestConfiguration requestConfiguration) {
        this.requestConfiguration = requestConfiguration;
    }

    /**
     * <p>
     * The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     * </p>
     * 
     * @return The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     */

    public HttpEndpointRequestConfiguration getRequestConfiguration() {
        return this.requestConfiguration;
    }

    /**
     * <p>
     * The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     * </p>
     * 
     * @param requestConfiguration
     *        The configuration of the requeste sent to the HTTP endpoint specified as the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withRequestConfiguration(HttpEndpointRequestConfiguration requestConfiguration) {
        setRequestConfiguration(requestConfiguration);
        return this;
    }

    /**
     * @param processingConfiguration
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * @return
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * @param processingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     * </p>
     * 
     * @param roleARN
     *        Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     * </p>
     * 
     * @return Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     * </p>
     * 
     * @param roleARN
     *        Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     * endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint
     * destination.
     * </p>
     * 
     * @param retryOptions
     *        Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     *        endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP
     *        endpoint destination.
     */

    public void setRetryOptions(HttpEndpointRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     * endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint
     * destination.
     * </p>
     * 
     * @return Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified
     *         HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified
     *         HTTP endpoint destination.
     */

    public HttpEndpointRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     * endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint
     * destination.
     * </p>
     * 
     * @param retryOptions
     *        Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP
     *        endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP
     *        endpoint destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withRetryOptions(HttpEndpointRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint
     * destination. You can back up all documents (<code>AllData</code>) or only the documents that Kinesis Data
     * Firehose could not deliver to the specified HTTP endpoint destination (<code>FailedDataOnly</code>).
     * </p>
     * 
     * @param s3BackupMode
     *        Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP
     *        endpoint destination. You can back up all documents (<code>AllData</code>) or only the documents that
     *        Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (
     *        <code>FailedDataOnly</code>).
     * @see HttpEndpointS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint
     * destination. You can back up all documents (<code>AllData</code>) or only the documents that Kinesis Data
     * Firehose could not deliver to the specified HTTP endpoint destination (<code>FailedDataOnly</code>).
     * </p>
     * 
     * @return Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP
     *         endpoint destination. You can back up all documents (<code>AllData</code>) or only the documents that
     *         Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (
     *         <code>FailedDataOnly</code>).
     * @see HttpEndpointS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint
     * destination. You can back up all documents (<code>AllData</code>) or only the documents that Kinesis Data
     * Firehose could not deliver to the specified HTTP endpoint destination (<code>FailedDataOnly</code>).
     * </p>
     * 
     * @param s3BackupMode
     *        Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP
     *        endpoint destination. You can back up all documents (<code>AllData</code>) or only the documents that
     *        Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (
     *        <code>FailedDataOnly</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpointS3BackupMode
     */

    public HttpEndpointDestinationConfiguration withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP endpoint
     * destination. You can back up all documents (<code>AllData</code>) or only the documents that Kinesis Data
     * Firehose could not deliver to the specified HTTP endpoint destination (<code>FailedDataOnly</code>).
     * </p>
     * 
     * @param s3BackupMode
     *        Describes the S3 bucket backup options for the data that Kinesis Data Firehose delivers to the HTTP
     *        endpoint destination. You can back up all documents (<code>AllData</code>) or only the documents that
     *        Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (
     *        <code>FailedDataOnly</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpEndpointS3BackupMode
     */

    public HttpEndpointDestinationConfiguration withS3BackupMode(HttpEndpointS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3Configuration
     */

    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    /**
     * @return
     */

    public S3DestinationConfiguration getS3Configuration() {
        return this.s3Configuration;
    }

    /**
     * @param s3Configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpEndpointDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        setS3Configuration(s3Configuration);
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
        if (getEndpointConfiguration() != null)
            sb.append("EndpointConfiguration: ").append(getEndpointConfiguration()).append(",");
        if (getBufferingHints() != null)
            sb.append("BufferingHints: ").append(getBufferingHints()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getRequestConfiguration() != null)
            sb.append("RequestConfiguration: ").append(getRequestConfiguration()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3Configuration() != null)
            sb.append("S3Configuration: ").append(getS3Configuration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpEndpointDestinationConfiguration == false)
            return false;
        HttpEndpointDestinationConfiguration other = (HttpEndpointDestinationConfiguration) obj;
        if (other.getEndpointConfiguration() == null ^ this.getEndpointConfiguration() == null)
            return false;
        if (other.getEndpointConfiguration() != null && other.getEndpointConfiguration().equals(this.getEndpointConfiguration()) == false)
            return false;
        if (other.getBufferingHints() == null ^ this.getBufferingHints() == null)
            return false;
        if (other.getBufferingHints() != null && other.getBufferingHints().equals(this.getBufferingHints()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getRequestConfiguration() == null ^ this.getRequestConfiguration() == null)
            return false;
        if (other.getRequestConfiguration() != null && other.getRequestConfiguration().equals(this.getRequestConfiguration()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3Configuration() == null ^ this.getS3Configuration() == null)
            return false;
        if (other.getS3Configuration() != null && other.getS3Configuration().equals(this.getS3Configuration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointConfiguration() == null) ? 0 : getEndpointConfiguration().hashCode());
        hashCode = prime * hashCode + ((getBufferingHints() == null) ? 0 : getBufferingHints().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getRequestConfiguration() == null) ? 0 : getRequestConfiguration().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3Configuration() == null) ? 0 : getS3Configuration().hashCode());
        return hashCode;
    }

    @Override
    public HttpEndpointDestinationConfiguration clone() {
        try {
            return (HttpEndpointDestinationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.HttpEndpointDestinationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
