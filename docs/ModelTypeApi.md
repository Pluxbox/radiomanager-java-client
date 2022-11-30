# ModelTypeApi

All URIs are relative to *https://radiomanager.io/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getModelTypeById**](ModelTypeApi.md#getModelTypeById) | **GET** /model_types/{id} | Get modelType by id |
| [**listModelTypes**](ModelTypeApi.md#listModelTypes) | **GET** /model_types | Get all modelTypes. |


<a name="getModelTypeById"></a>
# **getModelTypeById**
> ModelTypeResult getModelTypeById(id, orderDirection, externalStationId)

Get modelType by id

Get modelType by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ModelTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ModelTypeApi apiInstance = new ModelTypeApi(defaultClient);
    Long id = 56L; // Long | ID of ModelType **(Required)**
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      ModelTypeResult result = apiInstance.getModelTypeById(id, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelTypeApi#getModelTypeById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| ID of ModelType **(Required)** | |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**ModelTypeResult**](ModelTypeResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got ModelType by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listModelTypes"></a>
# **listModelTypes**
> InlineResponse2009 listModelTypes(programId, broadcastId, itemId, campaignId, presenterId, contactId, model, orderDirection, externalStationId)

Get all modelTypes.

List all modelTypes.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ModelTypeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ModelTypeApi apiInstance = new ModelTypeApi(defaultClient);
    Long programId = 56L; // Long | Search on Program ID *(Optional)*
    Long broadcastId = 56L; // Long | Search on Broadcast ID *(Optional)*
    Long itemId = 56L; // Long | Search on Item ID *(Optional)*
    Long campaignId = 56L; // Long | Search on Campaign ID *(Optional)*
    Long presenterId = 56L; // Long | Search on Presenter ID *(Optional)*
    Long contactId = 56L; // Long | Search on Contact ID *(Optional)*
    String model = "broadcast"; // String | Search Modeltypes for certain Model *(Optional)*
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      InlineResponse2009 result = apiInstance.listModelTypes(programId, broadcastId, itemId, campaignId, presenterId, contactId, model, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ModelTypeApi#listModelTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **programId** | **Long**| Search on Program ID *(Optional)* | [optional] |
| **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* | [optional] |
| **itemId** | **Long**| Search on Item ID *(Optional)* | [optional] |
| **campaignId** | **Long**| Search on Campaign ID *(Optional)* | [optional] |
| **presenterId** | **Long**| Search on Presenter ID *(Optional)* | [optional] |
| **contactId** | **Long**| Search on Contact ID *(Optional)* | [optional] |
| **model** | **String**| Search Modeltypes for certain Model *(Optional)* | [optional] [enum: broadcast, program, item, campaign, presenter, contact, external] |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got all modelTypes |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

