# BroadcastApi

All URIs are relative to *https://staging.radiomanager.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBroadcast**](BroadcastApi.md#createBroadcast) | **POST** /broadcasts | Create broadcast.
[**deleteBroadcastById**](BroadcastApi.md#deleteBroadcastById) | **DELETE** /broadcasts/{id} | Delete broadcast by id
[**getBroadcastById**](BroadcastApi.md#getBroadcastById) | **GET** /broadcasts/{id} | Get broadcast by id
[**getCurrentBroadcast**](BroadcastApi.md#getCurrentBroadcast) | **GET** /broadcasts/current | Get current Broadcast
[**getDailyEPG**](BroadcastApi.md#getDailyEPG) | **GET** /broadcasts/epg/daily | Get daily EPG
[**getEPGByDate**](BroadcastApi.md#getEPGByDate) | **GET** /broadcasts/epg | Get EPG by date
[**getNextBroadcast**](BroadcastApi.md#getNextBroadcast) | **GET** /broadcasts/next | Get next Broadcast
[**getWeeklyEPG**](BroadcastApi.md#getWeeklyEPG) | **GET** /broadcasts/epg/weekly | Get weekly EPG
[**listBroadcasts**](BroadcastApi.md#listBroadcasts) | **GET** /broadcasts | Get all broadcasts.
[**printBroadcastById**](BroadcastApi.md#printBroadcastById) | **GET** /broadcasts/print/{id} | Print Broadcast by id
[**updateBroadcastByID**](BroadcastApi.md#updateBroadcastByID) | **PATCH** /broadcasts/{id} | Update broadcast by id


<a name="createBroadcast"></a>
# **createBroadcast**
> PostSuccess createBroadcast(data)

Create broadcast.

Create broadcast.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
BroadcastDataInput data = new BroadcastDataInput(); // BroadcastDataInput | Data **(Required)**
try {
    PostSuccess result = apiInstance.createBroadcast(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#createBroadcast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**BroadcastDataInput**](BroadcastDataInput.md)| Data **(Required)** |

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBroadcastById"></a>
# **deleteBroadcastById**
> Success deleteBroadcastById(id)

Delete broadcast by id

Delete broadcast by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
Long id = 789L; // Long | ID of Broadcast **(Required)**
try {
    Success result = apiInstance.deleteBroadcastById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#deleteBroadcastById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Broadcast **(Required)** |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBroadcastById"></a>
# **getBroadcastById**
> BroadcastResult getBroadcastById(id, externalStationId)

Get broadcast by id

Get broadcast by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
Long id = 789L; // Long | ID of Broadcast **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    BroadcastResult result = apiInstance.getBroadcastById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getBroadcastById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Broadcast **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**BroadcastResult**](BroadcastResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentBroadcast"></a>
# **getCurrentBroadcast**
> Broadcast getCurrentBroadcast()

Get current Broadcast

Get current Broadcast

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
try {
    Broadcast result = apiInstance.getCurrentBroadcast();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getCurrentBroadcast");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Broadcast**](Broadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDailyEPG"></a>
# **getDailyEPG**
> EPGBroadcast getDailyEPG(date)

Get daily EPG

Get current Broadcast

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Date *(Optional)*
try {
    EPGBroadcast result = apiInstance.getDailyEPG(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getDailyEPG");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **OffsetDateTime**| Date *(Optional)* | [optional]

### Return type

[**EPGBroadcast**](EPGBroadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getEPGByDate"></a>
# **getEPGByDate**
> EPGBroadcast getEPGByDate(date)

Get EPG by date

Get EPG by date

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
OffsetDateTime date = new OffsetDateTime(); // OffsetDateTime | Date *(Optional)*
try {
    EPGBroadcast result = apiInstance.getEPGByDate(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getEPGByDate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **OffsetDateTime**| Date *(Optional)* | [optional]

### Return type

[**EPGBroadcast**](EPGBroadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNextBroadcast"></a>
# **getNextBroadcast**
> Broadcast getNextBroadcast()

Get next Broadcast

Get next Broadcast

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
try {
    Broadcast result = apiInstance.getNextBroadcast();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getNextBroadcast");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Broadcast**](Broadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWeeklyEPG"></a>
# **getWeeklyEPG**
> EPGBroadcast getWeeklyEPG(date)

Get weekly EPG

Get weekly EPG

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
String date = "date_example"; // String | Date *(Optional)*
try {
    EPGBroadcast result = apiInstance.getWeeklyEPG(date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#getWeeklyEPG");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **String**| Date *(Optional)* | [optional]

### Return type

[**EPGBroadcast**](EPGBroadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listBroadcasts"></a>
# **listBroadcasts**
> BroadcastResults listBroadcasts(page, startMin, startMax, modelTypeId, tagId, presenterId, itemId, blockId, genreId, programId, externalStationId)

Get all broadcasts.

List all broadcasts.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
Long page = 1L; // Long | Current page *(Optional)*
OffsetDateTime startMin = new OffsetDateTime(); // OffsetDateTime | Minimum start date *(Optional)*
OffsetDateTime startMax = new OffsetDateTime(); // OffsetDateTime | Maximum start date *(Optional)*
Long modelTypeId = 789L; // Long | Search on ModelType ID *(Optional)*
Long tagId = 789L; // Long | Search on Tag ID *(Optional)* `(Relation)`
Long presenterId = 789L; // Long | Search on Presenter ID *(Optional)* `(Relation)`
Long itemId = 789L; // Long | Search on Item ID *(Optional)* `(Relation)`
Long blockId = 789L; // Long | Search on Block ID *(Optional)* `(Relation)`
Long genreId = 789L; // Long | Search on Genre ID *(Optional)* `(Relation)`
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    BroadcastResults result = apiInstance.listBroadcasts(page, startMin, startMax, modelTypeId, tagId, presenterId, itemId, blockId, genreId, programId, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#listBroadcasts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional] [default to 1]
 **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional]
 **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* | [optional]
 **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **presenterId** | **Long**| Search on Presenter ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **blockId** | **Long**| Search on Block ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **genreId** | **Long**| Search on Genre ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**BroadcastResults**](BroadcastResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="printBroadcastById"></a>
# **printBroadcastById**
> EPGBroadcast printBroadcastById(id, programId, presenterId, tagId)

Print Broadcast by id

Print Broadcast by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
Long id = 789L; // Long | ID of Broadcast **(Required)**
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
Long presenterId = 789L; // Long | Search on Presenter ID *(Optional)* `(Relation)`
Long tagId = 789L; // Long | Search on Tag ID *(Optional)* `(Relation)`
try {
    EPGBroadcast result = apiInstance.printBroadcastById(id, programId, presenterId, tagId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#printBroadcastById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Broadcast **(Required)** |
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **presenterId** | **Long**| Search on Presenter ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional]

### Return type

[**EPGBroadcast**](EPGBroadcast.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateBroadcastByID"></a>
# **updateBroadcastByID**
> Success updateBroadcastByID(id, data)

Update broadcast by id

Update broadcast by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.BroadcastApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

BroadcastApi apiInstance = new BroadcastApi();
Long id = 789L; // Long | ID of Broadcast **(Required)**
BroadcastDataInput data = new BroadcastDataInput(); // BroadcastDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updateBroadcastByID(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BroadcastApi#updateBroadcastByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Broadcast **(Required)** |
 **data** | [**BroadcastDataInput**](BroadcastDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

