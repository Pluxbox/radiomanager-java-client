# BlockApi

All URIs are relative to *https://staging.radiomanager.io/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBlockById**](BlockApi.md#getBlockById) | **GET** /blocks/{id} | Get block by id |
| [**getCurrentBlock**](BlockApi.md#getCurrentBlock) | **GET** /blocks/current | Get current Block |
| [**getNextBlock**](BlockApi.md#getNextBlock) | **GET** /blocks/next | Get upcoming Block |
| [**listBlocks**](BlockApi.md#listBlocks) | **GET** /blocks | Get a list of all blocks currently in your station. |


<a name="getBlockById"></a>
# **getBlockById**
> BlockResult getBlockById(id, externalStationId)

Get block by id

Get block by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BlockApi apiInstance = new BlockApi(defaultClient);
    Long id = 56L; // Long | ID of Block **(Required)**
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      BlockResult result = apiInstance.getBlockById(id, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getBlockById");
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
| **id** | **Long**| ID of Block **(Required)** | |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got Block by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getCurrentBlock"></a>
# **getCurrentBlock**
> BlockResult getCurrentBlock()

Get current Block

Get currently playing Block

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BlockApi apiInstance = new BlockApi(defaultClient);
    try {
      BlockResult result = apiInstance.getCurrentBlock();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getCurrentBlock");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got current Block |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getNextBlock"></a>
# **getNextBlock**
> BlockResult getNextBlock()

Get upcoming Block

Get currently upcoming Block

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BlockApi apiInstance = new BlockApi(defaultClient);
    try {
      BlockResult result = apiInstance.getNextBlock();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#getNextBlock");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BlockResult**](BlockResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got upcoming Block |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listBlocks"></a>
# **listBlocks**
> InlineResponse200 listBlocks(broadcastId, itemId, programId, startMin, startMax, page, limit, orderBy, orderDirection, externalStationId)

Get a list of all blocks currently in your station.

Get a list of all blocks currently in your station. This feature supports pagination and will give a maximum of 50 blocks back.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BlockApi apiInstance = new BlockApi(defaultClient);
    Long broadcastId = 56L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
    Long itemId = 56L; // Long | Search on Item ID *(Optional)* `(Relation)`
    Long programId = 56L; // Long | Search on Program ID *(Optional)* `(Relation)`
    OffsetDateTime startMin = OffsetDateTime.now(); // OffsetDateTime | Minimum start date *(Optional)*
    OffsetDateTime startMax = OffsetDateTime.now(); // OffsetDateTime | Maximum start date *(Optional)*
    Long page = 1L; // Long | Current page *(Optional)*
    Long limit = 56L; // Long | Results per page *(Optional)*
    String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      InlineResponse200 result = apiInstance.listBlocks(broadcastId, itemId, programId, startMin, startMax, page, limit, orderBy, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BlockApi#listBlocks");
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
| **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional] |
| **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional] |
| **page** | **Long**| Current page *(Optional)* | [optional] [default to 1] |
| **limit** | **Long**| Results per page *(Optional)* | [optional] |
| **orderBy** | **String**| Field to order the results *(Optional)* | [optional] |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got all Blocks |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

