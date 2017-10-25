# VisualSlideApi

All URIs are relative to *https://radiomanager.io/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVisualSlide**](VisualSlideApi.md#getVisualSlide) | **GET** /visual | Get Visual Slide Image as Base64


<a name="getVisualSlide"></a>
# **getVisualSlide**
> VisualResult getVisualSlide()

Get Visual Slide Image as Base64

Get Visual Slide Image as Base64

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.VisualSlideApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

VisualSlideApi apiInstance = new VisualSlideApi();
try {
    VisualResult result = apiInstance.getVisualSlide();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisualSlideApi#getVisualSlide");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**VisualResult**](VisualResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

