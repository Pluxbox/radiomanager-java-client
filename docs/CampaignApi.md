# CampaignApi

All URIs are relative to *https://radiomanager.io/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaign**](CampaignApi.md#createCampaign) | **POST** /campaigns | Create campaign.
[**deleteCampaignById**](CampaignApi.md#deleteCampaignById) | **DELETE** /campaigns/{id} | Delete campaign by id
[**getCampaignById**](CampaignApi.md#getCampaignById) | **GET** /campaigns/{id} | Get campaign by id
[**listCampaigns**](CampaignApi.md#listCampaigns) | **GET** /campaigns | Get all campaigns.
[**updateCampaignByID**](CampaignApi.md#updateCampaignByID) | **PATCH** /campaigns/{id} | Update campaign by id


<a name="createCampaign"></a>
# **createCampaign**
> PostSuccess createCampaign(data)

Create campaign.

Create campaign.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
CampaignDataInput data = new CampaignDataInput(); // CampaignDataInput | Data **(Required)**
try {
    PostSuccess result = apiInstance.createCampaign(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#createCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CampaignDataInput**](CampaignDataInput.md)| Data **(Required)** |

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCampaignById"></a>
# **deleteCampaignById**
> Success deleteCampaignById(id)

Delete campaign by id

Delete campaign by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
Long id = 789L; // Long | ID of Campaign **(Required)**
try {
    Success result = apiInstance.deleteCampaignById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#deleteCampaignById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Campaign **(Required)** |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCampaignById"></a>
# **getCampaignById**
> CampaignResult getCampaignById(id, externalStationId)

Get campaign by id

Get campaign by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
Long id = 789L; // Long | ID of Campaign **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    CampaignResult result = apiInstance.getCampaignById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#getCampaignById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Campaign **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**CampaignResult**](CampaignResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCampaigns"></a>
# **listCampaigns**
> CampaignResults listCampaigns(page, itemId, modelTypeId, startMin, startMax, limit, orderBy, orderDirection, externalStationId)

Get all campaigns.

List all campaigns.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
Long page = 789L; // Long | Current page *(Optional)*
Long itemId = 789L; // Long | Search on Item ID *(Optional)* `(Relation)`
Long modelTypeId = 789L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
OffsetDateTime startMin = new OffsetDateTime(); // OffsetDateTime | Minimum start date *(Optional)*
OffsetDateTime startMax = new OffsetDateTime(); // OffsetDateTime | Maximum start date *(Optional)*
Long limit = 789L; // Long | Results per page *(Optional)*
String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
String orderDirection = "orderDirection_example"; // String | Direction of ordering *(Optional)*
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    CampaignResults result = apiInstance.listCampaigns(page, itemId, modelTypeId, startMin, startMax, limit, orderBy, orderDirection, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#listCampaigns");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional]
 **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **startMin** | **OffsetDateTime**| Minimum start date *(Optional)* | [optional]
 **startMax** | **OffsetDateTime**| Maximum start date *(Optional)* | [optional]
 **limit** | **Long**| Results per page *(Optional)* | [optional]
 **orderBy** | **String**| Field to order the results *(Optional)* | [optional]
 **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**CampaignResults**](CampaignResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCampaignByID"></a>
# **updateCampaignByID**
> Success updateCampaignByID(id, data)

Update campaign by id

Update campaign by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.CampaignApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

CampaignApi apiInstance = new CampaignApi();
Long id = 789L; // Long | ID of Campaign **(Required)**
CampaignDataInput data = new CampaignDataInput(); // CampaignDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updateCampaignByID(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignApi#updateCampaignByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Campaign **(Required)** |
 **data** | [**CampaignDataInput**](CampaignDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

