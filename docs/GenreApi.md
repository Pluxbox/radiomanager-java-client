# GenreApi

All URIs are relative to *https://staging.radiomanager.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGenreById**](GenreApi.md#getGenreById) | **GET** /genres/{id} | Get genre by id
[**listGenres**](GenreApi.md#listGenres) | **GET** /genres | List all genres.


<a name="getGenreById"></a>
# **getGenreById**
> GenreResult getGenreById(id, externalStationId)

Get genre by id

Get genre by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.GenreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

GenreApi apiInstance = new GenreApi();
Long id = 789L; // Long | ID of Genre **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    GenreResult result = apiInstance.getGenreById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenreApi#getGenreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Genre **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**GenreResult**](GenreResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listGenres"></a>
# **listGenres**
> GenreResults listGenres(page, parentId, programId, broadcastId, externalStationId)

List all genres.

List all genres.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.GenreApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

GenreApi apiInstance = new GenreApi();
Long page = 789L; // Long | Current page *(Optional)*
Long parentId = 789L; // Long | Search on Parent ID of Genre *(Optional)*
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    GenreResults result = apiInstance.listGenres(page, parentId, programId, broadcastId, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenreApi#listGenres");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **parentId** | **Long**| Search on Parent ID of Genre *(Optional)* | [optional]
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**GenreResults**](GenreResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

