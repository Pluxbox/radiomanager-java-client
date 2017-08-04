# BlockApi

All URIs are relative to *http://radiomanager.pb/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockById**](BlockApi.md#getBlockById) | **GET** /blocks/{id} | Get block by id
[**getCurrentBlock**](BlockApi.md#getCurrentBlock) | **GET** /blocks/current | Get current Block
[**getNextBlock**](BlockApi.md#getNextBlock) | **GET** /blocks/next | Get next Block
[**listBlocks**](BlockApi.md#listBlocks) | **GET** /blocks | Get a list of all blocks currently in your station.


<a name="getBlockById"></a>
# **getBlockById**
> BlockResult getBlockById(id, externalStationId)

Get block by id

Get block by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
Long id = 789L; // Long | ID of Block **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    BlockResult result = apiInstance.getBlockById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getBlockById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Block **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentBlock"></a>
# **getCurrentBlock**
> BlockResult getCurrentBlock()

Get current Block

Get current Block

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
try {
    BlockResult result = apiInstance.getCurrentBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getCurrentBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNextBlock"></a>
# **getNextBlock**
> BlockResult getNextBlock()

Get next Block

Get next Block

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
try {
    BlockResult result = apiInstance.getNextBlock();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#getNextBlock");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBlocks"></a>
# **listBlocks**
> BlockResults listBlocks(page, startMin, startMax, broadcastId, programId, itemId, externalStationId)

Get a list of all blocks currently in your station.

Get a list of all blocks currently in your station. This feature supports pagination and will give a maximum of 50 blocks back.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BlockApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BlockApi apiInstance = new BlockApi();
Long page = 1L; // Long | Current page *(Optional)*
OffsetDateTime startMin = new OffsetDateTime(); // OffsetDateTime | Minimum start date *(Optional)*
OffsetDateTime startMax = new OffsetDateTime(); // OffsetDateTime | Maximum start date *(Optional)*
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
Long itemId = 789L; // Long | Search on Item ID *(Optional)* `(Relation)`
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    BlockResults result = apiInstance.listBlocks(page, startMin, startMax, broadcastId, programId, itemId, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BlockApi#listBlocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional] [default to 1]
 **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional]
 **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**BlockResults**](BlockResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

