/*
 * RadioManager
 * RadioManager
 *
 * OpenAPI spec version: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pluxbox.radiomanager.api.v2;

import com.pluxbox.radiomanager.api.invoker.ApiCallback;
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.ApiResponse;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.Pair;
import com.pluxbox.radiomanager.api.invoker.ProgressRequestBody;
import com.pluxbox.radiomanager.api.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.pluxbox.radiomanager.api.models.Forbidden;
import com.pluxbox.radiomanager.api.models.GenreResult;
import com.pluxbox.radiomanager.api.models.GenreResults;
import com.pluxbox.radiomanager.api.models.NotFound;
import com.pluxbox.radiomanager.api.models.TooManyRequests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreApi {
    private ApiClient apiClient;

    public GenreApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGenreById
     * @param id ID of Genre **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGenreByIdCall(Long id, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/genres/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (externalStationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "_external_station_id", externalStationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API Key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getGenreByIdValidateBeforeCall(Long id, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getGenreById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getGenreByIdCall(id, externalStationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get genre by id
     * Get genre by id
     * @param id ID of Genre **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return GenreResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenreResult getGenreById(Long id, Long externalStationId) throws ApiException {
        ApiResponse<GenreResult> resp = getGenreByIdWithHttpInfo(id, externalStationId);
        return resp.getData();
    }

    /**
     * Get genre by id
     * Get genre by id
     * @param id ID of Genre **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;GenreResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenreResult> getGenreByIdWithHttpInfo(Long id, Long externalStationId) throws ApiException {
        com.squareup.okhttp.Call call = getGenreByIdValidateBeforeCall(id, externalStationId, null, null);
        Type localVarReturnType = new TypeToken<GenreResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get genre by id (asynchronously)
     * Get genre by id
     * @param id ID of Genre **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGenreByIdAsync(Long id, Long externalStationId, final ApiCallback<GenreResult> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getGenreByIdValidateBeforeCall(id, externalStationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenreResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listGenres
     * @param page Current page *(Optional)* (optional)
     * @param parentId Search on Parent ID of Genre *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listGenresCall(Long page, Long parentId, Long programId, Long broadcastId, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/genres";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (parentId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parent_id", parentId));
        if (programId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "program_id", programId));
        if (broadcastId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "broadcast_id", broadcastId));
        if (externalStationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "_external_station_id", externalStationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "API Key" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listGenresValidateBeforeCall(Long page, Long parentId, Long programId, Long broadcastId, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listGenresCall(page, parentId, programId, broadcastId, externalStationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List all genres.
     * List all genres.
     * @param page Current page *(Optional)* (optional)
     * @param parentId Search on Parent ID of Genre *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return GenreResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GenreResults listGenres(Long page, Long parentId, Long programId, Long broadcastId, Long externalStationId) throws ApiException {
        ApiResponse<GenreResults> resp = listGenresWithHttpInfo(page, parentId, programId, broadcastId, externalStationId);
        return resp.getData();
    }

    /**
     * List all genres.
     * List all genres.
     * @param page Current page *(Optional)* (optional)
     * @param parentId Search on Parent ID of Genre *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;GenreResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GenreResults> listGenresWithHttpInfo(Long page, Long parentId, Long programId, Long broadcastId, Long externalStationId) throws ApiException {
        com.squareup.okhttp.Call call = listGenresValidateBeforeCall(page, parentId, programId, broadcastId, externalStationId, null, null);
        Type localVarReturnType = new TypeToken<GenreResults>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all genres. (asynchronously)
     * List all genres.
     * @param page Current page *(Optional)* (optional)
     * @param parentId Search on Parent ID of Genre *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listGenresAsync(Long page, Long parentId, Long programId, Long broadcastId, Long externalStationId, final ApiCallback<GenreResults> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listGenresValidateBeforeCall(page, parentId, programId, broadcastId, externalStationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GenreResults>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
