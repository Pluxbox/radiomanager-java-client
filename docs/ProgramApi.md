# ProgramApi

All URIs are relative to *https://radiomanager.io/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProgram**](ProgramApi.md#createProgram) | **POST** /programs | Create program.
[**deleteProgramById**](ProgramApi.md#deleteProgramById) | **DELETE** /programs/{id} | Delete program by id
[**getProgramById**](ProgramApi.md#getProgramById) | **GET** /programs/{id} | Get program by id
[**listPrograms**](ProgramApi.md#listPrograms) | **GET** /programs | Get all programs.
[**updateProgramByID**](ProgramApi.md#updateProgramByID) | **PATCH** /programs/{id} | Update program by id


<a name="createProgram"></a>
# **createProgram**
> PostSuccess createProgram(data)

Create program.

Create program.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ProgramApi apiInstance = new ProgramApi();
ProgramDataInput data = new ProgramDataInput(); // ProgramDataInput | Data **(Required)**
try {
    PostSuccess result = apiInstance.createProgram(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramApi#createProgram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ProgramDataInput**](ProgramDataInput.md)| Data **(Required)** |

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProgramById"></a>
# **deleteProgramById**
> Success deleteProgramById(id)

Delete program by id

Delete program by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ProgramApi apiInstance = new ProgramApi();
Long id = 789L; // Long | ID of program **(Required)**
try {
    Success result = apiInstance.deleteProgramById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramApi#deleteProgramById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of program **(Required)** |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProgramById"></a>
# **getProgramById**
> ProgramResult getProgramById(id, externalStationId)

Get program by id

Get program by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ProgramApi apiInstance = new ProgramApi();
Long id = 789L; // Long | ID of Program **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ProgramResult result = apiInstance.getProgramById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramApi#getProgramById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Program **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ProgramResult**](ProgramResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPrograms"></a>
# **listPrograms**
> ProgramResults listPrograms(page, broadcastId, modelTypeId, tagId, presenterId, genreId, blockId, itemId, limit, orderBy, orderDirection, externalStationId)

Get all programs.

List all programs.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ProgramApi apiInstance = new ProgramApi();
Long page = 789L; // Long | Current page *(Optional)*
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
Long modelTypeId = 789L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
Long tagId = 789L; // Long | Search on Tag ID *(Optional)* `(Relation)`
Long presenterId = 789L; // Long | Search on Presenter ID *(Optional)* `(Relation)`
Long genreId = 789L; // Long | Search on Genre ID *(Optional)*
Long blockId = 789L; // Long | Search on Block ID *(Optional)* `(Relation)`
Long itemId = 789L; // Long | Search on Item ID *(Optional)* `(Relation)`
Long limit = 789L; // Long | Results per page *(Optional)*
String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
String orderDirection = "orderDirection_example"; // String | Direction of ordering *(Optional)*
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ProgramResults result = apiInstance.listPrograms(page, broadcastId, modelTypeId, tagId, presenterId, genreId, blockId, itemId, limit, orderBy, orderDirection, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramApi#listPrograms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **presenterId** | **Long**| Search on Presenter ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **genreId** | **Long**| Search on Genre ID *(Optional)* | [optional]
 **blockId** | **Long**| Search on Block ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **limit** | **Long**| Results per page *(Optional)* | [optional]
 **orderBy** | **String**| Field to order the results *(Optional)* | [optional]
 **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ProgramResults**](ProgramResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProgramByID"></a>
# **updateProgramByID**
> Success updateProgramByID(id, data)

Update program by id

Update program by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ProgramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ProgramApi apiInstance = new ProgramApi();
Long id = 789L; // Long | ID of Program **(Required)**
ProgramDataInput data = new ProgramDataInput(); // ProgramDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updateProgramByID(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProgramApi#updateProgramByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Program **(Required)** |
 **data** | [**ProgramDataInput**](ProgramDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

