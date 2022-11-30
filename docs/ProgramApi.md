# ProgramApi

All URIs are relative to *https://radiomanager.io/api/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProgram**](ProgramApi.md#createProgram) | **POST** /programs | Create program. |
| [**deleteProgramById**](ProgramApi.md#deleteProgramById) | **DELETE** /programs/{id} | Delete program by id |
| [**getProgramById**](ProgramApi.md#getProgramById) | **GET** /programs/{id} | Get program by id |
| [**listPrograms**](ProgramApi.md#listPrograms) | **GET** /programs | Get all programs. |
| [**updateProgramByID**](ProgramApi.md#updateProgramByID) | **PATCH** /programs/{id} | Update program by id |


<a name="createProgram"></a>
# **createProgram**
> InlineResponse2002 createProgram(programDataInput)

Create program.

Create program.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ProgramApi apiInstance = new ProgramApi(defaultClient);
    ProgramDataInput programDataInput = new ProgramDataInput(); // ProgramDataInput | Data **(Required)**
    try {
      InlineResponse2002 result = apiInstance.createProgram(programDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramApi#createProgram");
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
| **programDataInput** | [**ProgramDataInput**](ProgramDataInput.md)| Data **(Required)** | |

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

<a name="deleteProgramById"></a>
# **deleteProgramById**
> InlineResponse202 deleteProgramById(id)

Delete program by id

Delete program by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ProgramApi apiInstance = new ProgramApi(defaultClient);
    Long id = 56L; // Long | ID of program **(Required)**
    try {
      InlineResponse202 result = apiInstance.deleteProgramById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramApi#deleteProgramById");
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
| **id** | **Long**| ID of program **(Required)** | |

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

<a name="getProgramById"></a>
# **getProgramById**
> ProgramResult getProgramById(id, externalStationId)

Get program by id

Get program by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ProgramApi apiInstance = new ProgramApi(defaultClient);
    Long id = 56L; // Long | ID of Program **(Required)**
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      ProgramResult result = apiInstance.getProgramById(id, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramApi#getProgramById");
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
| **id** | **Long**| ID of Program **(Required)** | |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**ProgramResult**](ProgramResult.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got Program by id |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="listPrograms"></a>
# **listPrograms**
> InlineResponse20011 listPrograms(broadcastId, modelTypeId, tagId, presenterId, genreId, groupId, blockId, itemId, disabled, page, limit, orderBy, orderDirection, externalStationId)

Get all programs.

List all programs.

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ProgramApi apiInstance = new ProgramApi(defaultClient);
    Long broadcastId = 56L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
    Long modelTypeId = 56L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
    Long tagId = 56L; // Long | Search on Tag ID *(Optional)* `(Relation)`
    Long presenterId = 56L; // Long | Search on Presenter ID *(Optional)* `(Relation)`
    Long genreId = 56L; // Long | Search on Genre ID *(Optional)*
    Long groupId = 56L; // Long | Search on Group ID *(Optional)*
    Long blockId = 56L; // Long | Search on Block ID *(Optional)* `(Relation)`
    Long itemId = 56L; // Long | Search on Item ID *(Optional)* `(Relation)`
    Integer disabled = 56; // Integer | Search on Disabled status *(Optional)*
    Long page = 1L; // Long | Current page *(Optional)*
    Long limit = 56L; // Long | Results per page *(Optional)*
    String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
    String orderDirection = "asc"; // String | Direction of ordering *(Optional)*
    Long externalStationId = 56L; // Long | Query on a different (content providing) station *(Optional)*
    try {
      InlineResponse20011 result = apiInstance.listPrograms(broadcastId, modelTypeId, tagId, presenterId, genreId, groupId, blockId, itemId, disabled, page, limit, orderBy, orderDirection, externalStationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramApi#listPrograms");
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
| **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **presenterId** | **Long**| Search on Presenter ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **genreId** | **Long**| Search on Genre ID *(Optional)* | [optional] |
| **groupId** | **Long**| Search on Group ID *(Optional)* | [optional] |
| **blockId** | **Long**| Search on Block ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional] |
| **disabled** | **Integer**| Search on Disabled status *(Optional)* | [optional] |
| **page** | **Long**| Current page *(Optional)* | [optional] [default to 1] |
| **limit** | **Long**| Results per page *(Optional)* | [optional] |
| **orderBy** | **String**| Field to order the results *(Optional)* | [optional] |
| **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc] |
| **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional] |

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[API-Key](../README.md#API-Key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully got all programs |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |

<a name="updateProgramByID"></a>
# **updateProgramByID**
> InlineResponse202 updateProgramByID(id, programDataInput)

Update program by id

Update program by id

### Example
```java
// Import classes:
import com.pluxbox.radiomanager.api.invoker.ApiClient;
import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.invoker.Configuration;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.invoker.models.*;
import radiomanager.ProgramApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://radiomanager.io/api/v2");
    
    // Configure API key authorization: API-Key
    ApiKeyAuth API-Key = (ApiKeyAuth) defaultClient.getAuthentication("API-Key");
    API-Key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //API-Key.setApiKeyPrefix("Token");

    ProgramApi apiInstance = new ProgramApi(defaultClient);
    Long id = 56L; // Long | ID of Program **(Required)**
    ProgramDataInput programDataInput = new ProgramDataInput(); // ProgramDataInput | Data *(Optional)*
    try {
      InlineResponse202 result = apiInstance.updateProgramByID(id, programDataInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProgramApi#updateProgramByID");
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
| **id** | **Long**| ID of Program **(Required)** | |
| **programDataInput** | [**ProgramDataInput**](ProgramDataInput.md)| Data *(Optional)* | |

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

