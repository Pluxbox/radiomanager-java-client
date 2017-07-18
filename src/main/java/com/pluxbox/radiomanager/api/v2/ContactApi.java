/*
 * Pluxbox Radiomanager Client
 * Pluxbox RadioManager gives you the power, flexibility and speed you always wanted in a lightweight and easy-to-use web-based radio solution. With Pluxbox RadioManager you can organise your radio workflow and automate your omnichannel communication with your listeners. We offer wide range specialised services for the radio and connections like Hybrid Radio, Visual Radio, your website and social media without losing focus on your broadcast. For more information visit https://pluxbox.com
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


import com.pluxbox.radiomanager.api.models.ContactDataInput;
import com.pluxbox.radiomanager.api.models.ContactResult;
import com.pluxbox.radiomanager.api.models.ContactResults;
import com.pluxbox.radiomanager.api.models.Forbidden;
import com.pluxbox.radiomanager.api.models.NotFound;
import com.pluxbox.radiomanager.api.models.PostSuccess;
import com.pluxbox.radiomanager.api.models.Success;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import com.pluxbox.radiomanager.api.models.UnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactApi {
    private ApiClient apiClient;

    public ContactApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createContact
     * @param data Data **(Required)** (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createContactCall(ContactDataInput data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/contacts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createContactValidateBeforeCall(ContactDataInput data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createContact(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createContactCall(data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create contact.
     * Create contact.
     * @param data Data **(Required)** (required)
     * @return PostSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PostSuccess createContact(ContactDataInput data) throws ApiException {
        ApiResponse<PostSuccess> resp = createContactWithHttpInfo(data);
        return resp.getData();
    }

    /**
     * Create contact.
     * Create contact.
     * @param data Data **(Required)** (required)
     * @return ApiResponse&lt;PostSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PostSuccess> createContactWithHttpInfo(ContactDataInput data) throws ApiException {
        com.squareup.okhttp.Call call = createContactValidateBeforeCall(data, null, null);
        Type localVarReturnType = new TypeToken<PostSuccess>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create contact. (asynchronously)
     * Create contact.
     * @param data Data **(Required)** (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createContactAsync(ContactDataInput data, final ApiCallback<PostSuccess> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createContactValidateBeforeCall(data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PostSuccess>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteContactById
     * @param id ID of Contact **(Required)** (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteContactByIdCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/contacts/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteContactByIdValidateBeforeCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteContactById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteContactByIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete contact by id
     * Delete contact by id
     * @param id ID of Contact **(Required)** (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Success deleteContactById(Long id) throws ApiException {
        ApiResponse<Success> resp = deleteContactByIdWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Delete contact by id
     * Delete contact by id
     * @param id ID of Contact **(Required)** (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Success> deleteContactByIdWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteContactByIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete contact by id (asynchronously)
     * Delete contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteContactByIdAsync(Long id, final ApiCallback<Success> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteContactByIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getContactById
     * @param id ID of Contact **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getContactByIdCall(Long id, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/contacts/{id}"
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
    private com.squareup.okhttp.Call getContactByIdValidateBeforeCall(Long id, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getContactById(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getContactByIdCall(id, externalStationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get contact by id
     * Get contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ContactResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactResult getContactById(Long id, Long externalStationId) throws ApiException {
        ApiResponse<ContactResult> resp = getContactByIdWithHttpInfo(id, externalStationId);
        return resp.getData();
    }

    /**
     * Get contact by id
     * Get contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;ContactResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactResult> getContactByIdWithHttpInfo(Long id, Long externalStationId) throws ApiException {
        com.squareup.okhttp.Call call = getContactByIdValidateBeforeCall(id, externalStationId, null, null);
        Type localVarReturnType = new TypeToken<ContactResult>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get contact by id (asynchronously)
     * Get contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContactByIdAsync(Long id, Long externalStationId, final ApiCallback<ContactResult> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContactByIdValidateBeforeCall(id, externalStationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactResult>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listContacts
     * @param page Current page *(Optional)* (optional, default to 1)
     * @param modelTypeId Search on ModelType ID *(Optional)* (optional)
     * @param tagId Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param itemId Search on Item ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listContactsCall(Long page, Long modelTypeId, Long tagId, Long itemId, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/contacts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        if (modelTypeId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "model_type_id", modelTypeId));
        if (tagId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag_id", tagId));
        if (itemId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "item_id", itemId));
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
    private com.squareup.okhttp.Call listContactsValidateBeforeCall(Long page, Long modelTypeId, Long tagId, Long itemId, Long externalStationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = listContactsCall(page, modelTypeId, tagId, itemId, externalStationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all contacts.
     * List all contacts.
     * @param page Current page *(Optional)* (optional, default to 1)
     * @param modelTypeId Search on ModelType ID *(Optional)* (optional)
     * @param tagId Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param itemId Search on Item ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ContactResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactResults listContacts(Long page, Long modelTypeId, Long tagId, Long itemId, Long externalStationId) throws ApiException {
        ApiResponse<ContactResults> resp = listContactsWithHttpInfo(page, modelTypeId, tagId, itemId, externalStationId);
        return resp.getData();
    }

    /**
     * Get all contacts.
     * List all contacts.
     * @param page Current page *(Optional)* (optional, default to 1)
     * @param modelTypeId Search on ModelType ID *(Optional)* (optional)
     * @param tagId Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param itemId Search on Item ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;ContactResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactResults> listContactsWithHttpInfo(Long page, Long modelTypeId, Long tagId, Long itemId, Long externalStationId) throws ApiException {
        com.squareup.okhttp.Call call = listContactsValidateBeforeCall(page, modelTypeId, tagId, itemId, externalStationId, null, null);
        Type localVarReturnType = new TypeToken<ContactResults>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all contacts. (asynchronously)
     * List all contacts.
     * @param page Current page *(Optional)* (optional, default to 1)
     * @param modelTypeId Search on ModelType ID *(Optional)* (optional)
     * @param tagId Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param itemId Search on Item ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listContactsAsync(Long page, Long modelTypeId, Long tagId, Long itemId, Long externalStationId, final ApiCallback<ContactResults> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listContactsValidateBeforeCall(page, modelTypeId, tagId, itemId, externalStationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactResults>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateContactByID
     * @param id ID of Contact **(Required)** (required)
     * @param data Data *(Optional)* (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateContactByIDCall(Long id, ContactDataInput data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = data;
        
        // create path and map variables
        String localVarPath = "/contacts/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateContactByIDValidateBeforeCall(Long id, ContactDataInput data, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateContactByID(Async)");
        }
        
        
        com.squareup.okhttp.Call call = updateContactByIDCall(id, data, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update contact by id
     * Update contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param data Data *(Optional)* (optional)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Success updateContactByID(Long id, ContactDataInput data) throws ApiException {
        ApiResponse<Success> resp = updateContactByIDWithHttpInfo(id, data);
        return resp.getData();
    }

    /**
     * Update contact by id
     * Update contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param data Data *(Optional)* (optional)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Success> updateContactByIDWithHttpInfo(Long id, ContactDataInput data) throws ApiException {
        com.squareup.okhttp.Call call = updateContactByIDValidateBeforeCall(id, data, null, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update contact by id (asynchronously)
     * Update contact by id
     * @param id ID of Contact **(Required)** (required)
     * @param data Data *(Optional)* (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContactByIDAsync(Long id, ContactDataInput data, final ApiCallback<Success> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateContactByIDValidateBeforeCall(id, data, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}