# PresenterApi

All URIs are relative to *https://staging.radiomanager.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPresenter**](PresenterApi.md#createPresenter) | **POST** /presenters | Create presenter.
[**deletePresenterById**](PresenterApi.md#deletePresenterById) | **DELETE** /presenters/{id} | Delete presenter by id
[**getPresenterById**](PresenterApi.md#getPresenterById) | **GET** /presenters/{id} | Get presenter by id
[**listPresenters**](PresenterApi.md#listPresenters) | **GET** /presenters | Get all presenters.
[**updatePresenterByID**](PresenterApi.md#updatePresenterByID) | **PATCH** /presenters/{id} | Update presenter by id


<a name="createPresenter"></a>
# **createPresenter**
> PostSuccess createPresenter(data)

Create presenter.

Create presenter.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.PresenterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

PresenterApi apiInstance = new PresenterApi();
PresenterDataInput data = new PresenterDataInput(); // PresenterDataInput | Data **(Required)**
try {
    PostSuccess result = apiInstance.createPresenter(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenterApi#createPresenter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PresenterDataInput**](PresenterDataInput.md)| Data **(Required)** |

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePresenterById"></a>
# **deletePresenterById**
> Success deletePresenterById(id)

Delete presenter by id

Delete presenter by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.PresenterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

PresenterApi apiInstance = new PresenterApi();
Long id = 789L; // Long | id of presenter
try {
    Success result = apiInstance.deletePresenterById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenterApi#deletePresenterById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of presenter |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPresenterById"></a>
# **getPresenterById**
> PresenterResult getPresenterById(id, externalStationId)

Get presenter by id

Get presenter by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.PresenterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

PresenterApi apiInstance = new PresenterApi();
Long id = 789L; // Long | id of Presenter
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    PresenterResult result = apiInstance.getPresenterById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenterApi#getPresenterById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of Presenter |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**PresenterResult**](PresenterResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPresenters"></a>
# **listPresenters**
> PresenterResults listPresenters(page, modelTypeId, programId, broadcastId, externalStationId)

Get all presenters.

List all presenters.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.PresenterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

PresenterApi apiInstance = new PresenterApi();
Long page = 789L; // Long | Current page *(Optional)*
Long modelTypeId = 789L; // Long | Search on ModelType ID (Optional)
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    PresenterResults result = apiInstance.listPresenters(page, modelTypeId, programId, broadcastId, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenterApi#listPresenters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID (Optional) | [optional]
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**PresenterResults**](PresenterResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePresenterByID"></a>
# **updatePresenterByID**
> Success updatePresenterByID(id, data)

Update presenter by id

Update presenter by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.PresenterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

PresenterApi apiInstance = new PresenterApi();
Long id = 789L; // Long | id of Presenter
PresenterDataInput data = new PresenterDataInput(); // PresenterDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updatePresenterByID(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PresenterApi#updatePresenterByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of Presenter |
 **data** | [**PresenterDataInput**](PresenterDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

