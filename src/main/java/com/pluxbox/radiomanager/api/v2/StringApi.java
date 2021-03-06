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


import com.pluxbox.radiomanager.api.models.NotFound;
import com.pluxbox.radiomanager.api.models.TextString;
import com.pluxbox.radiomanager.api.models.TooManyRequests;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringApi {
    private ApiClient apiClient;

    public StringApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StringApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getStringsByName
     * @param name Name of Strings **(Required)** (required)
     * @param fullModel Full model or content only **(Required)** (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getStringsByNameCall(String name, Boolean fullModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/strings/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (fullModel != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("full_model", fullModel));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getStringsByNameValidateBeforeCall(String name, Boolean fullModel, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling getStringsByName(Async)");
        }
        
        // verify the required parameter 'fullModel' is set
        if (fullModel == null) {
            throw new ApiException("Missing the required parameter 'fullModel' when calling getStringsByName(Async)");
        }
        

        com.squareup.okhttp.Call call = getStringsByNameCall(name, fullModel, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get Strings (formatted)
     * Get Strings (formatted)
     * @param name Name of Strings **(Required)** (required)
     * @param fullModel Full model or content only **(Required)** (required)
     * @return TextString
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TextString getStringsByName(String name, Boolean fullModel) throws ApiException {
        ApiResponse<TextString> resp = getStringsByNameWithHttpInfo(name, fullModel);
        return resp.getData();
    }

    /**
     * Get Strings (formatted)
     * Get Strings (formatted)
     * @param name Name of Strings **(Required)** (required)
     * @param fullModel Full model or content only **(Required)** (required)
     * @return ApiResponse&lt;TextString&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TextString> getStringsByNameWithHttpInfo(String name, Boolean fullModel) throws ApiException {
        com.squareup.okhttp.Call call = getStringsByNameValidateBeforeCall(name, fullModel, null, null);
        Type localVarReturnType = new TypeToken<TextString>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Strings (formatted) (asynchronously)
     * Get Strings (formatted)
     * @param name Name of Strings **(Required)** (required)
     * @param fullModel Full model or content only **(Required)** (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getStringsByNameAsync(String name, Boolean fullModel, final ApiCallback<TextString> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getStringsByNameValidateBeforeCall(name, fullModel, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TextString>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
