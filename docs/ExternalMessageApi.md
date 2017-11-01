# ExternalMessageApi

All URIs are relative to *https://staging.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queueExternalMessage**](ExternalMessageApi.md#queueExternalMessage) | **POST** /externalmessagequeue | Queue External Message.


<a name="queueExternalMessage"></a>
# **queueExternalMessage**
> Object queueExternalMessage(message)

Queue External Message.

Queue External Message.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ExternalMessageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ExternalMessageApi apiInstance = new ExternalMessageApi();
ExternalMessageQueueData message = new ExternalMessageQueueData(); // ExternalMessageQueueData | Data **(Required)**
try {
    Object result = apiInstance.queueExternalMessage(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExternalMessageApi#queueExternalMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**ExternalMessageQueueData**](ExternalMessageQueueData.md)| Data **(Required)** |

### Return type

**Object**

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

