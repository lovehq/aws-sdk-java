/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListChildren" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListChildrenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or
     * digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     */
    private String parentId;
    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     */
    private String childType;
    /**
     * <p>
     * Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates that
     * there is more output available. Set it to the value of the previous call's <code>NextToken</code> response to
     * indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) Use this to limit the number of results you want included per page in the response. If you do not
     * include this parameter, it defaults to a value that is specific to the operation. If additional items exist
     * beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     * null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     * get the next part of the results. Note that Organizations might return fewer results than the maximum even when
     * there are more results available. You should check <code>NextToken</code> after every operation to ensure that
     * you receive all of the results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or
     * digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parentId
     *        The unique identifier (ID) for the parent root or OU whose children you want to list.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase
     *        letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and
     *        from 8 to 32 additional lowercase letters or digits.
     *        </p>
     *        </li>
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or
     * digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The unique identifier (ID) for the parent root or OU whose children you want to list.</p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase
     *         letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash
     *         and from 8 to 32 additional lowercase letters or digits.
     *         </p>
     *         </li>
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the parent root or OU whose children you want to list.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or
     * digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32
     * additional lowercase letters or digits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param parentId
     *        The unique identifier (ID) for the parent root or OU whose children you want to list.</p>
     *        <p>
     *        The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a parent ID string requires one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Root</b> - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Organizational unit (OU)</b> - A string that begins with "ou-" followed by from 4 to 32 lowercase
     *        letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and
     *        from 8 to 32 additional lowercase letters or digits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChildrenRequest withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * 
     * @param childType
     *        Filters the output to include only the specified child type.
     * @see ChildType
     */

    public void setChildType(String childType) {
        this.childType = childType;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * 
     * @return Filters the output to include only the specified child type.
     * @see ChildType
     */

    public String getChildType() {
        return this.childType;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * 
     * @param childType
     *        Filters the output to include only the specified child type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildType
     */

    public ListChildrenRequest withChildType(String childType) {
        setChildType(childType);
        return this;
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * 
     * @param childType
     *        Filters the output to include only the specified child type.
     * @see ChildType
     */

    public void setChildType(ChildType childType) {
        withChildType(childType);
    }

    /**
     * <p>
     * Filters the output to include only the specified child type.
     * </p>
     * 
     * @param childType
     *        Filters the output to include only the specified child type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChildType
     */

    public ListChildrenRequest withChildType(ChildType childType) {
        this.childType = childType.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates that
     * there is more output available. Set it to the value of the previous call's <code>NextToken</code> response to
     * indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates
     *        that there is more output available. Set it to the value of the previous call's <code>NextToken</code>
     *        response to indicate where the output should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates that
     * there is more output available. Set it to the value of the previous call's <code>NextToken</code> response to
     * indicate where the output should continue from.
     * </p>
     * 
     * @return Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates
     *         that there is more output available. Set it to the value of the previous call's <code>NextToken</code>
     *         response to indicate where the output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates that
     * there is more output available. Set it to the value of the previous call's <code>NextToken</code> response to
     * indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter if you receive a <code>NextToken</code> response in a previous request that indicates
     *        that there is more output available. Set it to the value of the previous call's <code>NextToken</code>
     *        response to indicate where the output should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChildrenRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) Use this to limit the number of results you want included per page in the response. If you do not
     * include this parameter, it defaults to a value that is specific to the operation. If additional items exist
     * beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     * null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     * get the next part of the results. Note that Organizations might return fewer results than the maximum even when
     * there are more results available. You should check <code>NextToken</code> after every operation to ensure that
     * you receive all of the results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Use this to limit the number of results you want included per page in the response. If you do
     *        not include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that Organizations might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Use this to limit the number of results you want included per page in the response. If you do not
     * include this parameter, it defaults to a value that is specific to the operation. If additional items exist
     * beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     * null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     * get the next part of the results. Note that Organizations might return fewer results than the maximum even when
     * there are more results available. You should check <code>NextToken</code> after every operation to ensure that
     * you receive all of the results.
     * </p>
     * 
     * @return (Optional) Use this to limit the number of results you want included per page in the response. If you do
     *         not include this parameter, it defaults to a value that is specific to the operation. If additional items
     *         exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a
     *         value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results. Note that Organizations might return fewer results
     *         than the maximum even when there are more results available. You should check <code>NextToken</code>
     *         after every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Use this to limit the number of results you want included per page in the response. If you do not
     * include this parameter, it defaults to a value that is specific to the operation. If additional items exist
     * beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     * null). Include that value as the <code>NextToken</code> request parameter in the next call to the operation to
     * get the next part of the results. Note that Organizations might return fewer results than the maximum even when
     * there are more results available. You should check <code>NextToken</code> after every operation to ensure that
     * you receive all of the results.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Use this to limit the number of results you want included per page in the response. If you do
     *        not include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the maximum you specify, the <code>NextToken</code> response element is present and has a
     *        value (is not null). Include that value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that Organizations might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListChildrenRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
        if (getChildType() != null)
            sb.append("ChildType: ").append(getChildType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListChildrenRequest == false)
            return false;
        ListChildrenRequest other = (ListChildrenRequest) obj;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getChildType() == null ^ this.getChildType() == null)
            return false;
        if (other.getChildType() != null && other.getChildType().equals(this.getChildType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getChildType() == null) ? 0 : getChildType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListChildrenRequest clone() {
        return (ListChildrenRequest) super.clone();
    }

}
