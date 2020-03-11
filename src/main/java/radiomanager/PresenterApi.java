/*
 * RadioManager
 * RadioManager
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package radiomanager;

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
import com.pluxbox.radiomanager.api.models.NotFound;
import com.pluxbox.radiomanager.api.models.PostSuccess;
import com.pluxbox.radiomanager.api.models.Presenter;
import com.pluxbox.radiomanager.api.models.PresenterDataInput;
import com.pluxbox.radiomanager.api.models.PresenterResult;
import com.pluxbox.radiomanager.api.models.PresenterResults;
import com.pluxbox.radiomanager.api.models.Success;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import com.pluxbox.radiomanager.api.models.UnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PresenterApi {
    private ApiClient localVarApiClient;

    public PresenterApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PresenterApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createPresenter
     * @param data Data **(Required)** (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a presenter </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPresenterCall(PresenterDataInput data, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/presenters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API-Key" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createPresenterValidateBeforeCall(PresenterDataInput data, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'data' is set
        if (data == null) {
            throw new ApiException("Missing the required parameter 'data' when calling createPresenter(Async)");
        }
        

        okhttp3.Call localVarCall = createPresenterCall(data, _callback);
        return localVarCall;

    }

    /**
     * Create presenter.
     * Create presenter.
     * @param data Data **(Required)** (required)
     * @return PostSuccess
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a presenter </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public PostSuccess createPresenter(PresenterDataInput data) throws ApiException {
        ApiResponse<PostSuccess> localVarResp = createPresenterWithHttpInfo(data);
        return localVarResp.getData();
    }

    /**
     * Create presenter.
     * Create presenter.
     * @param data Data **(Required)** (required)
     * @return ApiResponse&lt;PostSuccess&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a presenter </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PostSuccess> createPresenterWithHttpInfo(PresenterDataInput data) throws ApiException {
        okhttp3.Call localVarCall = createPresenterValidateBeforeCall(data, null);
        Type localVarReturnType = new TypeToken<PostSuccess>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create presenter. (asynchronously)
     * Create presenter.
     * @param data Data **(Required)** (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully created a presenter </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createPresenterAsync(PresenterDataInput data, final ApiCallback<PostSuccess> _callback) throws ApiException {

        okhttp3.Call localVarCall = createPresenterValidateBeforeCall(data, _callback);
        Type localVarReturnType = new TypeToken<PostSuccess>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deletePresenterById
     * @param id id of presenter (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePresenterByIdCall(Long id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/presenters/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API-Key" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deletePresenterByIdValidateBeforeCall(Long id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePresenterById(Async)");
        }
        

        okhttp3.Call localVarCall = deletePresenterByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete presenter by id
     * Delete presenter by id
     * @param id id of presenter (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public Success deletePresenterById(Long id) throws ApiException {
        ApiResponse<Success> localVarResp = deletePresenterByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Delete presenter by id
     * Delete presenter by id
     * @param id id of presenter (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> deletePresenterByIdWithHttpInfo(Long id) throws ApiException {
        okhttp3.Call localVarCall = deletePresenterByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete presenter by id (asynchronously)
     * Delete presenter by id
     * @param id id of presenter (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully deleted presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deletePresenterByIdAsync(Long id, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = deletePresenterByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPresenterById
     * @param id id of Presenter (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPresenterByIdCall(Long id, Long externalStationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/presenters/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (externalStationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("_external_station_id", externalStationId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API-Key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPresenterByIdValidateBeforeCall(Long id, Long externalStationId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getPresenterById(Async)");
        }
        

        okhttp3.Call localVarCall = getPresenterByIdCall(id, externalStationId, _callback);
        return localVarCall;

    }

    /**
     * Get presenter by id
     * Get presenter by id
     * @param id id of Presenter (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return PresenterResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public PresenterResult getPresenterById(Long id, Long externalStationId) throws ApiException {
        ApiResponse<PresenterResult> localVarResp = getPresenterByIdWithHttpInfo(id, externalStationId);
        return localVarResp.getData();
    }

    /**
     * Get presenter by id
     * Get presenter by id
     * @param id id of Presenter (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;PresenterResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PresenterResult> getPresenterByIdWithHttpInfo(Long id, Long externalStationId) throws ApiException {
        okhttp3.Call localVarCall = getPresenterByIdValidateBeforeCall(id, externalStationId, null);
        Type localVarReturnType = new TypeToken<PresenterResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get presenter by id (asynchronously)
     * Get presenter by id
     * @param id id of Presenter (required)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPresenterByIdAsync(Long id, Long externalStationId, final ApiCallback<PresenterResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPresenterByIdValidateBeforeCall(id, externalStationId, _callback);
        Type localVarReturnType = new TypeToken<PresenterResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listPresenters
     * @param page Current page *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param modelTypeId Search on ModelType ID (Optional) (optional)
     * @param limit Results per page *(Optional)* (optional)
     * @param orderBy Field to order the results *(Optional)* (optional)
     * @param orderDirection Direction of ordering *(Optional)* (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got all presenters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPresentersCall(Long page, Long programId, Long broadcastId, Long modelTypeId, Long limit, String orderBy, String orderDirection, Long externalStationId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/presenters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (programId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("program_id", programId));
        }

        if (broadcastId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("broadcast_id", broadcastId));
        }

        if (modelTypeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("model_type_id", modelTypeId));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order-by", orderBy));
        }

        if (orderDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order-direction", orderDirection));
        }

        if (externalStationId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("_external_station_id", externalStationId));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API-Key" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listPresentersValidateBeforeCall(Long page, Long programId, Long broadcastId, Long modelTypeId, Long limit, String orderBy, String orderDirection, Long externalStationId, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = listPresentersCall(page, programId, broadcastId, modelTypeId, limit, orderBy, orderDirection, externalStationId, _callback);
        return localVarCall;

    }

    /**
     * Get all presenters.
     * List all presenters.
     * @param page Current page *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param modelTypeId Search on ModelType ID (Optional) (optional)
     * @param limit Results per page *(Optional)* (optional)
     * @param orderBy Field to order the results *(Optional)* (optional)
     * @param orderDirection Direction of ordering *(Optional)* (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return PresenterResults
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got all presenters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public PresenterResults listPresenters(Long page, Long programId, Long broadcastId, Long modelTypeId, Long limit, String orderBy, String orderDirection, Long externalStationId) throws ApiException {
        ApiResponse<PresenterResults> localVarResp = listPresentersWithHttpInfo(page, programId, broadcastId, modelTypeId, limit, orderBy, orderDirection, externalStationId);
        return localVarResp.getData();
    }

    /**
     * Get all presenters.
     * List all presenters.
     * @param page Current page *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param modelTypeId Search on ModelType ID (Optional) (optional)
     * @param limit Results per page *(Optional)* (optional)
     * @param orderBy Field to order the results *(Optional)* (optional)
     * @param orderDirection Direction of ordering *(Optional)* (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @return ApiResponse&lt;PresenterResults&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got all presenters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PresenterResults> listPresentersWithHttpInfo(Long page, Long programId, Long broadcastId, Long modelTypeId, Long limit, String orderBy, String orderDirection, Long externalStationId) throws ApiException {
        okhttp3.Call localVarCall = listPresentersValidateBeforeCall(page, programId, broadcastId, modelTypeId, limit, orderBy, orderDirection, externalStationId, null);
        Type localVarReturnType = new TypeToken<PresenterResults>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all presenters. (asynchronously)
     * List all presenters.
     * @param page Current page *(Optional)* (optional)
     * @param programId Search on Program ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param broadcastId Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; (optional)
     * @param modelTypeId Search on ModelType ID (Optional) (optional)
     * @param limit Results per page *(Optional)* (optional)
     * @param orderBy Field to order the results *(Optional)* (optional)
     * @param orderDirection Direction of ordering *(Optional)* (optional)
     * @param externalStationId Query on a different (content providing) station *(Optional)* (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully got all presenters </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listPresentersAsync(Long page, Long programId, Long broadcastId, Long modelTypeId, Long limit, String orderBy, String orderDirection, Long externalStationId, final ApiCallback<PresenterResults> _callback) throws ApiException {

        okhttp3.Call localVarCall = listPresentersValidateBeforeCall(page, programId, broadcastId, modelTypeId, limit, orderBy, orderDirection, externalStationId, _callback);
        Type localVarReturnType = new TypeToken<PresenterResults>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updatePresenterByID
     * @param id id of Presenter (required)
     * @param data Data *(Optional)* (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePresenterByIDCall(Long id, PresenterDataInput data, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = data;

        // create path and map variables
        String localVarPath = "/presenters/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "API-Key" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updatePresenterByIDValidateBeforeCall(Long id, PresenterDataInput data, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updatePresenterByID(Async)");
        }
        

        okhttp3.Call localVarCall = updatePresenterByIDCall(id, data, _callback);
        return localVarCall;

    }

    /**
     * Update presenter by id
     * Update presenter by id
     * @param id id of Presenter (required)
     * @param data Data *(Optional)* (optional)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public Success updatePresenterByID(Long id, PresenterDataInput data) throws ApiException {
        ApiResponse<Success> localVarResp = updatePresenterByIDWithHttpInfo(id, data);
        return localVarResp.getData();
    }

    /**
     * Update presenter by id
     * Update presenter by id
     * @param id id of Presenter (required)
     * @param data Data *(Optional)* (optional)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> updatePresenterByIDWithHttpInfo(Long id, PresenterDataInput data) throws ApiException {
        okhttp3.Call localVarCall = updatePresenterByIDValidateBeforeCall(id, data, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update presenter by id (asynchronously)
     * Update presenter by id
     * @param id id of Presenter (required)
     * @param data Data *(Optional)* (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully updated Presenter by id </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updatePresenterByIDAsync(Long id, PresenterDataInput data, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = updatePresenterByIDValidateBeforeCall(id, data, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
