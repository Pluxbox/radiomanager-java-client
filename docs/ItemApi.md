# ItemApi

All URIs are relative to *https://radiomanager.io/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createItem**](ItemApi.md#createItem) | **POST** /items | Create an new item.
[**currentItemPostStructure**](ItemApi.md#currentItemPostStructure) | **POST** /items/current/structure | Post a current playing item, keep structure
[**currentItemPostTiming**](ItemApi.md#currentItemPostTiming) | **POST** /items/current/timing | Post a current playing item
[**deleteItemById**](ItemApi.md#deleteItemById) | **DELETE** /items/{id} | Delete item by ID.
[**getCurrentItem**](ItemApi.md#getCurrentItem) | **GET** /items/current | Get current Item
[**getItemById**](ItemApi.md#getItemById) | **GET** /items/{id} | Get extended item details by ID.
[**listItems**](ItemApi.md#listItems) | **GET** /items | Get a list of all the items currently in your station.
[**playlistPostStructure**](ItemApi.md#playlistPostStructure) | **POST** /items/playlist/structure | Post a playlist, keep current structure
[**playlistPostTiming**](ItemApi.md#playlistPostTiming) | **POST** /items/playlist/timing | Post a playlist
[**updateItemById**](ItemApi.md#updateItemById) | **PATCH** /items/{id} | Update extended item details by ID.


<a name="createItem"></a>
# **createItem**
> PostSuccess createItem(data)

Create an new item.

Create item.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
ItemDataInput data = new ItemDataInput(); // ItemDataInput | Data *(Optional)*
try {
    PostSuccess result = apiInstance.createItem(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#createItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ItemDataInput**](ItemDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="currentItemPostStructure"></a>
# **currentItemPostStructure**
> Success currentItemPostStructure(data)

Post a current playing item, keep structure

Post a current playing item, keep structure

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
ImportItem data = new ImportItem(); // ImportItem | Data *(Optional)*
try {
    Success result = apiInstance.currentItemPostStructure(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#currentItemPostStructure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ImportItem**](ImportItem.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="currentItemPostTiming"></a>
# **currentItemPostTiming**
> Success currentItemPostTiming(data)

Post a current playing item

Post a current playing item

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
ImportItem data = new ImportItem(); // ImportItem | Data *(Optional)*
try {
    Success result = apiInstance.currentItemPostTiming(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#currentItemPostTiming");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ImportItem**](ImportItem.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteItemById"></a>
# **deleteItemById**
> Success deleteItemById(id)

Delete item by ID.

Delete item by id.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Long id = 789L; // Long | ID of Item **(Required)**
try {
    Success result = apiInstance.deleteItemById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#deleteItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Item **(Required)** |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCurrentItem"></a>
# **getCurrentItem**
> ItemResult getCurrentItem(lastplayed)

Get current Item

Get current Item

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Boolean lastplayed = true; // Boolean | Show last played item if there is no current item*(Optional)*
try {
    ItemResult result = apiInstance.getCurrentItem(lastplayed);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getCurrentItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lastplayed** | **Boolean**| Show last played item if there is no current item*(Optional)* | [optional]

### Return type

[**ItemResult**](ItemResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getItemById"></a>
# **getItemById**
> ItemResult getItemById(id, externalStationId)

Get extended item details by ID.

Read item by id.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Long id = 789L; // Long | ID of Item **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ItemResult result = apiInstance.getItemById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#getItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Item **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ItemResult**](ItemResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listItems"></a>
# **listItems**
> ItemResults listItems(page, blockId, broadcastId, modelTypeId, tagId, campaignId, contactId, programDraftId, userDraftId, stationDraftId, programId, externalId, startMin, startMax, durationMin, durationMax, status, limit, orderBy, orderDirection, externalStationId)

Get a list of all the items currently in your station.

Get a list of all the items currently in your station. This feature supports pagination and will give a maximum results of 50 items back.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Long page = 789L; // Long | Current page *(Optional)*
Long blockId = 789L; // Long | Search on Block ID *(Optional)* `(Relation)`
Long broadcastId = 789L; // Long | Search on Broadcast ID *(Optional)* `(Relation)`
Long modelTypeId = 789L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
Long tagId = 789L; // Long | Search on Tag ID *(Optional)* `(Relation)`
Long campaignId = 789L; // Long | Search on Campaign ID *(Optional)* `(Relation)`
Long contactId = 789L; // Long | Search on Contact ID *(Optional)* `(Relation)`
Long programDraftId = 789L; // Long | Search on Program Draft ID *(Optional)*
Long userDraftId = 789L; // Long | Search on User Draft ID *(Optional)*
Long stationDraftId = 789L; // Long | Search on Station Draft ID *(Optional)*
Long programId = 789L; // Long | Search on Program ID *(Optional)* `(Relation)`
String externalId = "externalId_example"; // String | Search on External ID *(Optional)*
OffsetDateTime startMin = new OffsetDateTime(); // OffsetDateTime | Minimum start date *(Optional)*
OffsetDateTime startMax = new OffsetDateTime(); // OffsetDateTime | Maximum start date *(Optional)*
Integer durationMin = 56; // Integer | Minimum duration (seconds) *(Optional)*
Integer durationMax = 56; // Integer | Maximum duration (seconds) *(Optional)*
String status = "status_example"; // String | Play Status of item *(Optional)*
Long limit = 789L; // Long | Results per page *(Optional)*
String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
String orderDirection = "orderDirection_example"; // String | Direction of ordering *(Optional)*
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ItemResults result = apiInstance.listItems(page, blockId, broadcastId, modelTypeId, tagId, campaignId, contactId, programDraftId, userDraftId, stationDraftId, programId, externalId, startMin, startMax, durationMin, durationMax, status, limit, orderBy, orderDirection, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#listItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **blockId** | **Long**| Search on Block ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **broadcastId** | **Long**| Search on Broadcast ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **campaignId** | **Long**| Search on Campaign ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **contactId** | **Long**| Search on Contact ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **programDraftId** | **Long**| Search on Program Draft ID *(Optional)* | [optional]
 **userDraftId** | **Long**| Search on User Draft ID *(Optional)* | [optional]
 **stationDraftId** | **Long**| Search on Station Draft ID *(Optional)* | [optional]
 **programId** | **Long**| Search on Program ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **externalId** | **String**| Search on External ID *(Optional)* | [optional]
 **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional]
 **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional]
 **durationMin** | **Integer**| Minimum duration (seconds) *(Optional)* | [optional]
 **durationMax** | **Integer**| Maximum duration (seconds) *(Optional)* | [optional]
 **status** | **String**| Play Status of item *(Optional)* | [optional] [enum: scheduled, playing, played]
 **limit** | **Long**| Results per page *(Optional)* | [optional]
 **orderBy** | **String**| Field to order the results *(Optional)* | [optional]
 **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ItemResults**](ItemResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playlistPostStructure"></a>
# **playlistPostStructure**
> InlineResponse202 playlistPostStructure(data)

Post a playlist, keep current structure

Post a playlist, keep current structure

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Data1 data = new Data1(); // Data1 | Data *(Optional)*
try {
    InlineResponse202 result = apiInstance.playlistPostStructure(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#playlistPostStructure");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Data1**](Data1.md)| Data *(Optional)* | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="playlistPostTiming"></a>
# **playlistPostTiming**
> InlineResponse202 playlistPostTiming(data)

Post a playlist

Post a playlist

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Data data = new Data(); // Data | Data *(Optional)*
try {
    InlineResponse202 result = apiInstance.playlistPostTiming(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#playlistPostTiming");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Data**](Data.md)| Data *(Optional)* | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateItemById"></a>
# **updateItemById**
> Success updateItemById(id, data)

Update extended item details by ID.

Update item by id.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ItemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ItemApi apiInstance = new ItemApi();
Long id = 789L; // Long | ID of Item **(Required)**
ItemDataInput data = new ItemDataInput(); // ItemDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updateItemById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemApi#updateItemById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Item **(Required)** |
 **data** | [**ItemDataInput**](ItemDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

