# ModelTypeApi

All URIs are relative to *https://staging.radiomanager.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getModelTypeById**](ModelTypeApi.md#getModelTypeById) | **GET** /model_types/{id} | Get modelType by id
[**listModelTypes**](ModelTypeApi.md#listModelTypes) | **GET** /model_types | Get all modelTypes.


<a name="getModelTypeById"></a>
# **getModelTypeById**
> ModelTypeResult getModelTypeById(id, externalStationId)

Get modelType by id

Get modelType by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ModelTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ModelTypeApi apiInstance = new ModelTypeApi();
Long id = 789L; // Long | ID of ModelType **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ModelTypeResult result = apiInstance.getModelTypeById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelTypeApi#getModelTypeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of ModelType **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ModelTypeResult**](ModelTypeResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listModelTypes"></a>
# **listModelTypes**
> ModelTypeResults listModelTypes(page, model, programId, broadcastId, itemId, campaignId, presenterId, contactId, externalStationId)

Get all modelTypes.

List all modelTypes.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ModelTypeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ModelTypeApi apiInstance = new ModelTypeApi();
Long page = 789L; // Long | Current page *(Optional)*
String model = "model_example"; // String | 
Long programId = 789L; // Long | Search on Program ID *(Optional)*
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)*
Long itemId = 789L; // Long | Search on Item ID *(Optional)*
Long campaignId = 789L; // Long | Search on Campaign ID *(Optional)*
Long presenterId = 789L; // Long | Search on Presenter ID *(Optional)*
Long contactId = 789L; // Long | Search on Contact ID *(Optional)*
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ModelTypeResults result = apiInstance.listModelTypes(page, model, programId, broadcastId, itemId, campaignId, presenterId, contactId, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ModelTypeApi#listModelTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **model** | **String**|  | [optional] [enum: broadcast, program, item, campaign, presenter, contact, external]
 **programId** | **Long**| Search on Program ID *(Optional)* | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* | [optional]
 **itemId** | **Long**| Search on Item ID *(Optional)* | [optional]
 **campaignId** | **Long**| Search on Campaign ID *(Optional)* | [optional]
 **presenterId** | **Long**| Search on Presenter ID *(Optional)* | [optional]
 **contactId** | **Long**| Search on Contact ID *(Optional)* | [optional]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ModelTypeResults**](ModelTypeResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

