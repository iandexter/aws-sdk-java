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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/CreateLogPattern"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLogPatternRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the resource group.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     */
    private String patternSetName;
    /**
     * <p>
     * The name of the log pattern.
     * </p>
     */
    private String patternName;
    /**
     * <p>
     * The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference
     * constructions are not supported.
     * </p>
     */
    private String pattern;
    /**
     * <p>
     * Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns are
     * sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of
     * rank <code>1</code> will be the first to get matched to a log line. A pattern of rank <code>1,000,000</code> will
     * be last to get matched. When you configure custom log patterns from the console, a <code>Low</code> severity
     * pattern translates to a <code>750,000</code> rank. A <code>Medium</code> severity pattern translates to a
     * <code>500,000</code> rank. And a <code>High</code> severity pattern translates to a <code>250,000</code> rank.
     * Rank values less than <code>1</code> or greater than <code>1,000,000</code> are reserved for AWS-provided
     * patterns.
     * </p>
     */
    private Integer rank;

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @return The name of the resource group.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * The name of the resource group.
     * </p>
     * 
     * @param resourceGroupName
     *        The name of the resource group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern set.
     */

    public void setPatternSetName(String patternSetName) {
        this.patternSetName = patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @return The name of the log pattern set.
     */

    public String getPatternSetName() {
        return this.patternSetName;
    }

    /**
     * <p>
     * The name of the log pattern set.
     * </p>
     * 
     * @param patternSetName
     *        The name of the log pattern set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternRequest withPatternSetName(String patternSetName) {
        setPatternSetName(patternSetName);
        return this;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern.
     */

    public void setPatternName(String patternName) {
        this.patternName = patternName;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @return The name of the log pattern.
     */

    public String getPatternName() {
        return this.patternName;
    }

    /**
     * <p>
     * The name of the log pattern.
     * </p>
     * 
     * @param patternName
     *        The name of the log pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternRequest withPatternName(String patternName) {
        setPatternName(patternName);
        return this;
    }

    /**
     * <p>
     * The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference
     * constructions are not supported.
     * </p>
     * 
     * @param pattern
     *        The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or
     *        backreference constructions are not supported.
     */

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * <p>
     * The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference
     * constructions are not supported.
     * </p>
     * 
     * @return The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or
     *         backreference constructions are not supported.
     */

    public String getPattern() {
        return this.pattern;
    }

    /**
     * <p>
     * The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or backreference
     * constructions are not supported.
     * </p>
     * 
     * @param pattern
     *        The log pattern. The pattern must be DFA compatible. Patterns that utilize forward lookahead or
     *        backreference constructions are not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternRequest withPattern(String pattern) {
        setPattern(pattern);
        return this;
    }

    /**
     * <p>
     * Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns are
     * sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of
     * rank <code>1</code> will be the first to get matched to a log line. A pattern of rank <code>1,000,000</code> will
     * be last to get matched. When you configure custom log patterns from the console, a <code>Low</code> severity
     * pattern translates to a <code>750,000</code> rank. A <code>Medium</code> severity pattern translates to a
     * <code>500,000</code> rank. And a <code>High</code> severity pattern translates to a <code>250,000</code> rank.
     * Rank values less than <code>1</code> or greater than <code>1,000,000</code> are reserved for AWS-provided
     * patterns.
     * </p>
     * 
     * @param rank
     *        Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns
     *        are sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A
     *        pattern of rank <code>1</code> will be the first to get matched to a log line. A pattern of rank
     *        <code>1,000,000</code> will be last to get matched. When you configure custom log patterns from the
     *        console, a <code>Low</code> severity pattern translates to a <code>750,000</code> rank. A
     *        <code>Medium</code> severity pattern translates to a <code>500,000</code> rank. And a <code>High</code>
     *        severity pattern translates to a <code>250,000</code> rank. Rank values less than <code>1</code> or
     *        greater than <code>1,000,000</code> are reserved for AWS-provided patterns.
     */

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * <p>
     * Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns are
     * sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of
     * rank <code>1</code> will be the first to get matched to a log line. A pattern of rank <code>1,000,000</code> will
     * be last to get matched. When you configure custom log patterns from the console, a <code>Low</code> severity
     * pattern translates to a <code>750,000</code> rank. A <code>Medium</code> severity pattern translates to a
     * <code>500,000</code> rank. And a <code>High</code> severity pattern translates to a <code>250,000</code> rank.
     * Rank values less than <code>1</code> or greater than <code>1,000,000</code> are reserved for AWS-provided
     * patterns.
     * </p>
     * 
     * @return Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns
     *         are sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A
     *         pattern of rank <code>1</code> will be the first to get matched to a log line. A pattern of rank
     *         <code>1,000,000</code> will be last to get matched. When you configure custom log patterns from the
     *         console, a <code>Low</code> severity pattern translates to a <code>750,000</code> rank. A
     *         <code>Medium</code> severity pattern translates to a <code>500,000</code> rank. And a <code>High</code>
     *         severity pattern translates to a <code>250,000</code> rank. Rank values less than <code>1</code> or
     *         greater than <code>1,000,000</code> are reserved for AWS-provided patterns.
     */

    public Integer getRank() {
        return this.rank;
    }

    /**
     * <p>
     * Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns are
     * sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A pattern of
     * rank <code>1</code> will be the first to get matched to a log line. A pattern of rank <code>1,000,000</code> will
     * be last to get matched. When you configure custom log patterns from the console, a <code>Low</code> severity
     * pattern translates to a <code>750,000</code> rank. A <code>Medium</code> severity pattern translates to a
     * <code>500,000</code> rank. And a <code>High</code> severity pattern translates to a <code>250,000</code> rank.
     * Rank values less than <code>1</code> or greater than <code>1,000,000</code> are reserved for AWS-provided
     * patterns.
     * </p>
     * 
     * @param rank
     *        Rank of the log pattern. Must be a value between <code>1</code> and <code>1,000,000</code>. The patterns
     *        are sorted by rank, so we recommend that you set your highest priority patterns with the lowest rank. A
     *        pattern of rank <code>1</code> will be the first to get matched to a log line. A pattern of rank
     *        <code>1,000,000</code> will be last to get matched. When you configure custom log patterns from the
     *        console, a <code>Low</code> severity pattern translates to a <code>750,000</code> rank. A
     *        <code>Medium</code> severity pattern translates to a <code>500,000</code> rank. And a <code>High</code>
     *        severity pattern translates to a <code>250,000</code> rank. Rank values less than <code>1</code> or
     *        greater than <code>1,000,000</code> are reserved for AWS-provided patterns.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogPatternRequest withRank(Integer rank) {
        setRank(rank);
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getPatternSetName() != null)
            sb.append("PatternSetName: ").append(getPatternSetName()).append(",");
        if (getPatternName() != null)
            sb.append("PatternName: ").append(getPatternName()).append(",");
        if (getPattern() != null)
            sb.append("Pattern: ").append(getPattern()).append(",");
        if (getRank() != null)
            sb.append("Rank: ").append(getRank());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLogPatternRequest == false)
            return false;
        CreateLogPatternRequest other = (CreateLogPatternRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getPatternSetName() == null ^ this.getPatternSetName() == null)
            return false;
        if (other.getPatternSetName() != null && other.getPatternSetName().equals(this.getPatternSetName()) == false)
            return false;
        if (other.getPatternName() == null ^ this.getPatternName() == null)
            return false;
        if (other.getPatternName() != null && other.getPatternName().equals(this.getPatternName()) == false)
            return false;
        if (other.getPattern() == null ^ this.getPattern() == null)
            return false;
        if (other.getPattern() != null && other.getPattern().equals(this.getPattern()) == false)
            return false;
        if (other.getRank() == null ^ this.getRank() == null)
            return false;
        if (other.getRank() != null && other.getRank().equals(this.getRank()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getPatternSetName() == null) ? 0 : getPatternSetName().hashCode());
        hashCode = prime * hashCode + ((getPatternName() == null) ? 0 : getPatternName().hashCode());
        hashCode = prime * hashCode + ((getPattern() == null) ? 0 : getPattern().hashCode());
        hashCode = prime * hashCode + ((getRank() == null) ? 0 : getRank().hashCode());
        return hashCode;
    }

    @Override
    public CreateLogPatternRequest clone() {
        return (CreateLogPatternRequest) super.clone();
    }

}
