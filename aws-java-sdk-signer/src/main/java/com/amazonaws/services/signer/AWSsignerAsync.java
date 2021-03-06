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
package com.amazonaws.services.signer;

import javax.annotation.Generated;

import com.amazonaws.services.signer.model.*;

/**
 * Interface for accessing signer asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.signer.AbstractAWSsignerAsync} instead.
 * </p>
 * <p>
 * <p>
 * With code signing for IoT, you can sign code that you create for any IoT device that is supported by Amazon Web
 * Services (AWS). Code signing is available through <a
 * href="http://docs.aws.amazon.com/freertos/latest/userguide/">Amazon FreeRTOS</a> and <a
 * href="http://docs.aws.amazon.com/iot/latest/developerguide/">AWS IoT Device Management</a>, and integrated with <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/">AWS Certificate Manager (ACM)</a>. In order to sign code, you
 * import a third-party code signing certificate with ACM that is used to sign updates in Amazon FreeRTOS and AWS IoT
 * Device Management. For general information about using code signing, see the <a
 * href="http://docs.aws.amazon.com/signer/latest/developerguide/Welcome.html">Code Signing for IoT Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSsignerAsync extends AWSsigner {

    /**
     * <p>
     * Changes the state of an <code>ACTIVE</code> signing profile to <code>CANCELED</code>. A canceled profile is still
     * viewable with the <code>ListSigningProfiles</code> operation, but it cannot perform new signing jobs, and is
     * deleted two years after cancelation.
     * </p>
     * 
     * @param cancelSigningProfileRequest
     * @return A Java Future containing the result of the CancelSigningProfile operation returned by the service.
     * @sample AWSsignerAsync.CancelSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/CancelSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest cancelSigningProfileRequest);

    /**
     * <p>
     * Changes the state of an <code>ACTIVE</code> signing profile to <code>CANCELED</code>. A canceled profile is still
     * viewable with the <code>ListSigningProfiles</code> operation, but it cannot perform new signing jobs, and is
     * deleted two years after cancelation.
     * </p>
     * 
     * @param cancelSigningProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSigningProfile operation returned by the service.
     * @sample AWSsignerAsyncHandler.CancelSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/CancelSigningProfile" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSigningProfileResult> cancelSigningProfileAsync(CancelSigningProfileRequest cancelSigningProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSigningProfileRequest, CancelSigningProfileResult> asyncHandler);

    /**
     * <p>
     * Returns information about a specific code signing job. You specify the job by using the <code>jobId</code> value
     * that is returned by the <a>StartSigningJob</a> operation.
     * </p>
     * 
     * @param describeSigningJobRequest
     * @return A Java Future containing the result of the DescribeSigningJob operation returned by the service.
     * @sample AWSsignerAsync.DescribeSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest describeSigningJobRequest);

    /**
     * <p>
     * Returns information about a specific code signing job. You specify the job by using the <code>jobId</code> value
     * that is returned by the <a>StartSigningJob</a> operation.
     * </p>
     * 
     * @param describeSigningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSigningJob operation returned by the service.
     * @sample AWSsignerAsyncHandler.DescribeSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/DescribeSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeSigningJobResult> describeSigningJobAsync(DescribeSigningJobRequest describeSigningJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSigningJobRequest, DescribeSigningJobResult> asyncHandler);

    /**
     * <p>
     * Returns information on a specific signing platform.
     * </p>
     * 
     * @param getSigningPlatformRequest
     * @return A Java Future containing the result of the GetSigningPlatform operation returned by the service.
     * @sample AWSsignerAsync.GetSigningPlatform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest getSigningPlatformRequest);

    /**
     * <p>
     * Returns information on a specific signing platform.
     * </p>
     * 
     * @param getSigningPlatformRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSigningPlatform operation returned by the service.
     * @sample AWSsignerAsyncHandler.GetSigningPlatform
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningPlatform" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSigningPlatformResult> getSigningPlatformAsync(GetSigningPlatformRequest getSigningPlatformRequest,
            com.amazonaws.handlers.AsyncHandler<GetSigningPlatformRequest, GetSigningPlatformResult> asyncHandler);

    /**
     * <p>
     * Returns information on a specific signing profile.
     * </p>
     * 
     * @param getSigningProfileRequest
     * @return A Java Future containing the result of the GetSigningProfile operation returned by the service.
     * @sample AWSsignerAsync.GetSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest getSigningProfileRequest);

    /**
     * <p>
     * Returns information on a specific signing profile.
     * </p>
     * 
     * @param getSigningProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSigningProfile operation returned by the service.
     * @sample AWSsignerAsyncHandler.GetSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/GetSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSigningProfileResult> getSigningProfileAsync(GetSigningProfileRequest getSigningProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetSigningProfileRequest, GetSigningProfileResult> asyncHandler);

    /**
     * <p>
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that code signing returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @return A Java Future containing the result of the ListSigningJobs operation returned by the service.
     * @sample AWSsignerAsync.ListSigningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest listSigningJobsRequest);

    /**
     * <p>
     * Lists all your signing jobs. You can use the <code>maxResults</code> parameter to limit the number of signing
     * jobs that are returned in the response. If additional jobs remain to be listed, code signing returns a
     * <code>nextToken</code> value. Use this value in subsequent calls to <code>ListSigningJobs</code> to fetch the
     * remaining values. You can continue calling <code>ListSigningJobs</code> with your <code>maxResults</code>
     * parameter and with new values that code signing returns in the <code>nextToken</code> parameter until all of your
     * signing jobs have been returned.
     * </p>
     * 
     * @param listSigningJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSigningJobs operation returned by the service.
     * @sample AWSsignerAsyncHandler.ListSigningJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningJobs" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSigningJobsResult> listSigningJobsAsync(ListSigningJobsRequest listSigningJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSigningJobsRequest, ListSigningJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all signing platforms available in code signing that match the request parameters. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @return A Java Future containing the result of the ListSigningPlatforms operation returned by the service.
     * @sample AWSsignerAsync.ListSigningPlatforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest listSigningPlatformsRequest);

    /**
     * <p>
     * Lists all signing platforms available in code signing that match the request parameters. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningPlatformsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSigningPlatforms operation returned by the service.
     * @sample AWSsignerAsyncHandler.ListSigningPlatforms
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningPlatforms" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSigningPlatformsResult> listSigningPlatformsAsync(ListSigningPlatformsRequest listSigningPlatformsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSigningPlatformsRequest, ListSigningPlatformsResult> asyncHandler);

    /**
     * <p>
     * Lists all available signing profiles in your AWS account. Returns only profiles with an <code>ACTIVE</code>
     * status unless the <code>includeCanceled</code> request field is set to <code>true</code>. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @return A Java Future containing the result of the ListSigningProfiles operation returned by the service.
     * @sample AWSsignerAsync.ListSigningProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest listSigningProfilesRequest);

    /**
     * <p>
     * Lists all available signing profiles in your AWS account. Returns only profiles with an <code>ACTIVE</code>
     * status unless the <code>includeCanceled</code> request field is set to <code>true</code>. If additional jobs
     * remain to be listed, code signing returns a <code>nextToken</code> value. Use this value in subsequent calls to
     * <code>ListSigningJobs</code> to fetch the remaining values. You can continue calling <code>ListSigningJobs</code>
     * with your <code>maxResults</code> parameter and with new values that code signing returns in the
     * <code>nextToken</code> parameter until all of your signing jobs have been returned.
     * </p>
     * 
     * @param listSigningProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSigningProfiles operation returned by the service.
     * @sample AWSsignerAsyncHandler.ListSigningProfiles
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListSigningProfiles" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSigningProfilesResult> listSigningProfilesAsync(ListSigningProfilesRequest listSigningProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSigningProfilesRequest, ListSigningProfilesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the tags associated with a signing profile resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSsignerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of the tags associated with a signing profile resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSsignerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a
     * pre-defined signing job. For more information, see <a
     * href="http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html"
     * >http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html</a>
     * </p>
     * 
     * @param putSigningProfileRequest
     * @return A Java Future containing the result of the PutSigningProfile operation returned by the service.
     * @sample AWSsignerAsync.PutSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest putSigningProfileRequest);

    /**
     * <p>
     * Creates a signing profile. A signing profile is a code signing template that can be used to carry out a
     * pre-defined signing job. For more information, see <a
     * href="http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html"
     * >http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html</a>
     * </p>
     * 
     * @param putSigningProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutSigningProfile operation returned by the service.
     * @sample AWSsignerAsyncHandler.PutSigningProfile
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/PutSigningProfile" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutSigningProfileResult> putSigningProfileAsync(PutSigningProfileRequest putSigningProfileRequest,
            com.amazonaws.handlers.AsyncHandler<PutSigningProfileRequest, PutSigningProfileResult> asyncHandler);

    /**
     * <p>
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
     * <code>ListSigningJobs</code> operation for two years after they are performed. Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create an Amazon S3 source bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/CreatingABucket.html">Create a Bucket</a> in the <i>Amazon
     * S3 Getting Started Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your S3 source bucket must be version enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify the name of the source and destination buckets when calling the <code>StartSigningJob</code>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also specify a request token that identifies your request to code signing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call the <a>DescribeSigningJob</a> and the <a>ListSigningJobs</a> actions after you call
     * <code>StartSigningJob</code>.
     * </p>
     * <p>
     * For a Java example that shows how to use this action, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/">http://docs.aws.amazon.com/acm/latest/userguide/</a>
     * </p>
     * 
     * @param startSigningJobRequest
     * @return A Java Future containing the result of the StartSigningJob operation returned by the service.
     * @sample AWSsignerAsync.StartSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest startSigningJobRequest);

    /**
     * <p>
     * Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
     * <code>ListSigningJobs</code> operation for two years after they are performed. Note the following requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You must create an Amazon S3 source bucket. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonS3/latest/gsg/CreatingABucket.html">Create a Bucket</a> in the <i>Amazon
     * S3 Getting Started Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Your S3 source bucket must be version enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must create an S3 destination bucket. Code signing uses your S3 destination bucket to write your signed code.
     * </p>
     * </li>
     * <li>
     * <p>
     * You specify the name of the source and destination buckets when calling the <code>StartSigningJob</code>
     * operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * You must also specify a request token that identifies your request to code signing.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can call the <a>DescribeSigningJob</a> and the <a>ListSigningJobs</a> actions after you call
     * <code>StartSigningJob</code>.
     * </p>
     * <p>
     * For a Java example that shows how to use this action, see <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/">http://docs.aws.amazon.com/acm/latest/userguide/</a>
     * </p>
     * 
     * @param startSigningJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSigningJob operation returned by the service.
     * @sample AWSsignerAsyncHandler.StartSigningJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/StartSigningJob" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartSigningJobResult> startSigningJobAsync(StartSigningJobRequest startSigningJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartSigningJobRequest, StartSigningJobResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. You specify the signing profile using its Amazon
     * Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSsignerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a signing profile. Tags are labels that you can use to identify and organize your AWS
     * resources. Each tag consists of a key and an optional value. You specify the signing profile using its Amazon
     * Resource Name (ARN). You specify the tag by using a key-value pair.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSsignerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Remove one or more tags from a signing profile. Specify a list of tag keys to remove the tags.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSsignerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Remove one or more tags from a signing profile. Specify a list of tag keys to remove the tags.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSsignerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
