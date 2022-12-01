# TagApi

All URIs are relative to *https://staging.radiomanager.io/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTag**](TagApi.md#createTag) | **POST** /tags | Create tag. |
| [**deleteTagById**](TagApi.md#deleteTagById) | **DELETE** /tags/{id} | Delete tag by id |
| [**getTagById**](TagApi.md#getTagById) | **GET** /tags/{id} | Get tags by id |
| [**listTags**](TagApi.md#listTags) | **GET** /tags | Get a list of all the tags currently in your station. |
| [**updateTagByID**](TagApi.md#updateTagByID) | **PATCH** /tags/{id} | Update tag by id |


<a name="createTag"></a>
# **createTag**
> InlineResponse2002 createTag(tagDataInput)

Create tag.

Create tag.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    TagApi apiInstance = new TagApi(defaultClient);
    TagDataInput tagDataInput = new TagDataInput(); // TagDataInput | Data **(Required)**
    try {
      InlineResponse2002 result = apiInstance.createTag(tagDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#createTag");
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
| **tagDataInput** | [**TagDataInput**](TagDataInput.md)| Data **(Required)** | |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Post Request Succesful |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="deleteTagById"></a>
# **deleteTagById**
> InlineResponse202 deleteTagById(id)

Delete tag by id

Delete tag by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    TagApi apiInstance = new TagApi(defaultClient);
    Long id = 56L; // Long | ID of Tag **(Required)**
    try {
      InlineResponse202 result = apiInstance.deleteTagById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#deleteTagById");
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
| **id** | **Long**| ID of Tag **(Required)** | |

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Request Succesful |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getTagById"></a>
# **getTagById**
> TagResult getTagById(id)

Get tags by id

Get tags by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    TagApi apiInstance = new TagApi(defaultClient);
    Long id = 56L; // Long | ID of Tag **(Required)**
    try {
      TagResult result = apiInstance.getTagById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#getTagById");
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
| **id** | **Long**| ID of Tag **(Required)** | |

### Return type

[**TagResult**](TagResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got Tag by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listTags"></a>
# **listTags**
> InlineResponse20012 listTags(programId, itemId, broadcastId, contactId, page, limit, orderBy, orderDirection, externalStationId)

Get a list of all the tags currently in your station.

Get a list of all the tags currently in your station. This feature supports pagination and will give a maximum results of 50 tags back.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    TagApi apiInstance = new TagApi(defaultClient);
    Long programId = 56L; // Long | Search on Program ID *(Optional)* `(Relation)`
    Long itemId = 56L; // Long | Search on Item ID *(Optional)* `(Relation)`
    Long broadcastId = 56L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
    Long contactId = 56L; // Long | Search on Contact ID *(Optional)* `(Relation)`
    Long page = 1L; // Long | Current page *(Optional)*
    Long limit = 56L; // Long | Results per page *(Optional)*
    String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      InlineResponse20012 result = apiInstance.listTags(programId, itemId, broadcastId, contactId, page, limit, orderBy, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#listTags");
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
| **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **contactId** | **Long**| Search on Contact ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **page** | **Long**| Current page *(Optional)* | [optional] [default to 1] |
| **limit** | **Long**| Results per page *(Optional)* | [optional] |
| **orderBy** | **String**| Field to order the results *(Optional)* | [optional] |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got all Tags |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateTagByID"></a>
# **updateTagByID**
> InlineResponse202 updateTagByID(id, tagDataInput)

Update tag by id

Update tag by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.TagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://staging.radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    TagApi apiInstance = new TagApi(defaultClient);
    Long id = 56L; // Long | ID of Tag **(Required)**
    TagDataInput tagDataInput = new TagDataInput(); // TagDataInput | Data *(Optional)*
    try {
      InlineResponse202 result = apiInstance.updateTagByID(id, tagDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagApi#updateTagByID");
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
| **id** | **Long**| ID of Tag **(Required)** | |
| **tagDataInput** | [**TagDataInput**](TagDataInput.md)| Data *(Optional)* | |

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request Succesful |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

