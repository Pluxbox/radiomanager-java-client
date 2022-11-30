# BroadcastApi

All URIs are relative to *https://radiomanager.io/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBroadcast**](BroadcastApi.md#createBroadcast) | **POST** /broadcasts | Create broadcast. |
| [**deleteBroadcastById**](BroadcastApi.md#deleteBroadcastById) | **DELETE** /broadcasts/{id} | Delete broadcast by id |
| [**getBroadcastById**](BroadcastApi.md#getBroadcastById) | **GET** /broadcasts/{id} | Get broadcast by id |
| [**getCurrentBroadcast**](BroadcastApi.md#getCurrentBroadcast) | **GET** /broadcasts/current | Get current Broadcast |
| [**getDailyEPG**](BroadcastApi.md#getDailyEPG) | **GET** /broadcasts/epg/daily | Get daily EPG |
| [**getEPGByDate**](BroadcastApi.md#getEPGByDate) | **GET** /broadcasts/epg | Get EPG by date |
| [**getNextBroadcast**](BroadcastApi.md#getNextBroadcast) | **GET** /broadcasts/next | Get next Broadcast |
| [**getWeeklyEPG**](BroadcastApi.md#getWeeklyEPG) | **GET** /broadcasts/epg/weekly | Get weekly EPG |
| [**listBroadcasts**](BroadcastApi.md#listBroadcasts) | **GET** /broadcasts | Get all broadcasts. |
| [**printBroadcastById**](BroadcastApi.md#printBroadcastById) | **GET** /broadcasts/print/{id} | Print broadcast by id with template |
| [**updateBroadcastByID**](BroadcastApi.md#updateBroadcastByID) | **PATCH** /broadcasts/{id} | Update broadcast by id |


<a name="createBroadcast"></a>
# **createBroadcast**
> InlineResponse2002 createBroadcast(broadcastDataInput)

Create broadcast.

Create broadcast.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    BroadcastDataInput broadcastDataInput = new BroadcastDataInput(); // BroadcastDataInput | Data **(Required)**
    try {
      InlineResponse2002 result = apiInstance.createBroadcast(broadcastDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#createBroadcast");
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
| **broadcastDataInput** | [**BroadcastDataInput**](BroadcastDataInput.md)| Data **(Required)** | |

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

<a name="deleteBroadcastById"></a>
# **deleteBroadcastById**
> InlineResponse202 deleteBroadcastById(id)

Delete broadcast by id

Delete broadcast by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Long id = 56L; // Long | ID of Broadcast **(Required)**
    try {
      InlineResponse202 result = apiInstance.deleteBroadcastById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#deleteBroadcastById");
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
| **id** | **Long**| ID of Broadcast **(Required)** | |

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

<a name="getBroadcastById"></a>
# **getBroadcastById**
> BroadcastResult getBroadcastById(id, externalStationId)

Get broadcast by id

Get broadcast by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Long id = 56L; // Long | ID of Broadcast **(Required)**
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      BroadcastResult result = apiInstance.getBroadcastById(id, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getBroadcastById");
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
| **id** | **Long**| ID of Broadcast **(Required)** | |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got Broadcast by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getCurrentBroadcast"></a>
# **getCurrentBroadcast**
> BroadcastResult getCurrentBroadcast(withunpublished)

Get current Broadcast

Get currently playing Broadcast

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Boolean withunpublished = true; // Boolean | Show Unpublished *(Optional)*
    try {
      BroadcastResult result = apiInstance.getCurrentBroadcast(withunpublished);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getCurrentBroadcast");
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
| **withunpublished** | **Boolean**| Show Unpublished *(Optional)* | [optional] |

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got current Broadcast |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getDailyEPG"></a>
# **getDailyEPG**
> EPGResults getDailyEPG(date, withunpublished)

Get daily EPG

Get a list of broadcasts as Programming guide for 1 day

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | Date *(Optional)*
    Boolean withunpublished = true; // Boolean | Show Unpublished *(Optional)*
    try {
      EPGResults result = apiInstance.getDailyEPG(date, withunpublished);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getDailyEPG");
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
| **date** | **OffsetDateTime**| Date *(Optional)* | [optional] |
| **withunpublished** | **Boolean**| Show Unpublished *(Optional)* | [optional] |

### Return type

[**EPGResults**](EPGResults.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got EPG |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getEPGByDate"></a>
# **getEPGByDate**
> EPGResults getEPGByDate(date, withunpublished)

Get EPG by date

Get a list of broadcasts as Programming guide, seperated per day

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    OffsetDateTime date = OffsetDateTime.now(); // OffsetDateTime | Date *(Optional)*
    Boolean withunpublished = true; // Boolean | Show Unpublished *(Optional)*
    try {
      EPGResults result = apiInstance.getEPGByDate(date, withunpublished);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getEPGByDate");
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
| **date** | **OffsetDateTime**| Date *(Optional)* | [optional] |
| **withunpublished** | **Boolean**| Show Unpublished *(Optional)* | [optional] |

### Return type

[**EPGResults**](EPGResults.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got EPG |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getNextBroadcast"></a>
# **getNextBroadcast**
> BroadcastResult getNextBroadcast(withunpublished)

Get next Broadcast

Get currently upcoming Broadcast

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Boolean withunpublished = true; // Boolean | Show Unpublished *(Optional)*
    try {
      BroadcastResult result = apiInstance.getNextBroadcast(withunpublished);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getNextBroadcast");
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
| **withunpublished** | **Boolean**| Show Unpublished *(Optional)* | [optional] |

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got next Broadcast |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="getWeeklyEPG"></a>
# **getWeeklyEPG**
> EPGResults getWeeklyEPG(date, withunpublished)

Get weekly EPG

Get a list of broadcasts as Programming guide for 7 days, seperated per day

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    LocalDate date = LocalDate.now(); // LocalDate | Date *(Optional)*
    Boolean withunpublished = true; // Boolean | Show Unpublished *(Optional)*
    try {
      EPGResults result = apiInstance.getWeeklyEPG(date, withunpublished);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#getWeeklyEPG");
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
| **date** | **LocalDate**| Date *(Optional)* | [optional] |
| **withunpublished** | **Boolean**| Show Unpublished *(Optional)* | [optional] |

### Return type

[**EPGResults**](EPGResults.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got EPG |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listBroadcasts"></a>
# **listBroadcasts**
> InlineResponse2001 listBroadcasts(programId, blockId, modelTypeId, tagId, presenterId, genreId, groupId, itemId, plannedInEpg, startMin, startMax, page, limit, orderBy, orderDirection, externalStationId)

Get all broadcasts.

List all broadcasts.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Long programId = 56L; // Long | Search on Program ID *(Optional)* `(Relation)`
    Long blockId = 56L; // Long | Search on Block ID *(Optional)* `(Relation)`
    Long modelTypeId = 56L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
    Long tagId = 56L; // Long | Search on Tag ID *(Optional)* `(Relation)`
    Long presenterId = 56L; // Long | Search on Presenter ID *(Optional)* `(Relation)`
    Long genreId = 56L; // Long | Search on Genre ID *(Optional)* `(Relation)`
    Long groupId = 56L; // Long | Search on Group ID *(Optional)* `(Relation)`
    Long itemId = 56L; // Long | Search on Item ID *(Optional)* `(Relation)`
    Long plannedInEpg = 56L; // Long | Checks if item is in EPG *(Optional)*
    OffsetDateTime startMin = OffsetDateTime.now(); // OffsetDateTime | Minimum start date *(Optional)*
    OffsetDateTime startMax = OffsetDateTime.now(); // OffsetDateTime | Maximum start date *(Optional)*
    Long page = 1L; // Long | Current page *(Optional)*
    Long limit = 56L; // Long | Results per page *(Optional)*
    String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      InlineResponse2001 result = apiInstance.listBroadcasts(programId, blockId, modelTypeId, tagId, presenterId, genreId, groupId, itemId, plannedInEpg, startMin, startMax, page, limit, orderBy, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#listBroadcasts");
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
| **blockId** | **Long**| Search on Block ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **presenterId** | **Long**| Search on Presenter ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **genreId** | **Long**| Search on Genre ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **groupId** | **Long**| Search on Group ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **plannedInEpg** | **Long**| Checks if item is in EPG *(Optional)* | [optional] |
| **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional] |
| **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional] |
| **page** | **Long**| Current page *(Optional)* | [optional] [default to 1] |
| **limit** | **Long**| Results per page *(Optional)* | [optional] |
| **orderBy** | **String**| Field to order the results *(Optional)* | [optional] |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got all broadcasts |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="printBroadcastById"></a>
# **printBroadcastById**
> InlineResponse2003 printBroadcastById(id, templateId)

Print broadcast by id with template

Download a rundown in printable format as HTML inside the JSON repsonse

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Long id = 56L; // Long | ID of Broadcast **(Required)**
    Long templateId = 56L; // Long | The print template to be used *(Optional)*
    try {
      InlineResponse2003 result = apiInstance.printBroadcastById(id, templateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#printBroadcastById");
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
| **id** | **Long**| ID of Broadcast **(Required)** | |
| **templateId** | **Long**| The print template to be used *(Optional)* | [optional] |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully printed Broadcast by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateBroadcastByID"></a>
# **updateBroadcastByID**
> InlineResponse202 updateBroadcastByID(id, broadcastDataInput)

Update broadcast by id

Update broadcast by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.BroadcastApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    BroadcastApi apiInstance = new BroadcastApi(defaultClient);
    Long id = 56L; // Long | ID of Broadcast **(Required)**
    BroadcastDataInput broadcastDataInput = new BroadcastDataInput(); // BroadcastDataInput | Data *(Optional)*
    try {
      InlineResponse202 result = apiInstance.updateBroadcastByID(id, broadcastDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BroadcastApi#updateBroadcastByID");
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
| **id** | **Long**| ID of Broadcast **(Required)** | |
| **broadcastDataInput** | [**BroadcastDataInput**](BroadcastDataInput.md)| Data *(Optional)* | [optional] |

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

