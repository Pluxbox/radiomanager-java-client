# ContactApi

All URIs are relative to *https://radiomanager.pb/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactApi.md#createContact) | **POST** /contacts | Create contact.
[**deleteContactById**](ContactApi.md#deleteContactById) | **DELETE** /contacts/{id} | Delete contact by id
[**getContactById**](ContactApi.md#getContactById) | **GET** /contacts/{id} | Get contact by id
[**listContacts**](ContactApi.md#listContacts) | **GET** /contacts | Get all contacts.
[**updateContactByID**](ContactApi.md#updateContactByID) | **PATCH** /contacts/{id} | Update contact by id


<a name="createContact"></a>
# **createContact**
> PostSuccess createContact(data)

Create contact.

Create contact.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
ContactDataInput data = new ContactDataInput(); // ContactDataInput | Data **(Required)**
try {
    PostSuccess result = apiInstance.createContact(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ContactDataInput**](ContactDataInput.md)| Data **(Required)** |

### Return type

[**PostSuccess**](PostSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactById"></a>
# **deleteContactById**
> Success deleteContactById(id)

Delete contact by id

Delete contact by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Long id = 789L; // Long | ID of Contact **(Required)**
try {
    Success result = apiInstance.deleteContactById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#deleteContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Contact **(Required)** |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactById"></a>
# **getContactById**
> ContactResult getContactById(id, externalStationId)

Get contact by id

Get contact by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Long id = 789L; // Long | ID of Contact **(Required)**
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ContactResult result = apiInstance.getContactById(id, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#getContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Contact **(Required)** |
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ContactResult**](ContactResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listContacts"></a>
# **listContacts**
> ContactResults listContacts(page, itemId, modelTypeId, tagId, limit, orderBy, orderDirection, externalStationId)

Get all contacts.

List all contacts.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Long page = 1L; // Long | Current page *(Optional)*
Long itemId = 789L; // Long | Search on Item ID *(Optional)* `(Relation)`
Long modelTypeId = 789L; // Long | Search on ModelType ID *(Optional)* `(Relation)`
Long tagId = 789L; // Long | Search on Tag ID *(Optional)* `(Relation)`
Long limit = 789L; // Long | Results per page *(Optional)*
String orderBy = "orderBy_example"; // String | Field to order the results *(Optional)*
String orderDirection = "orderDirection_example"; // String | Direction of ordering *(Optional)*
Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
try {
    ContactResults result = apiInstance.listContacts(page, itemId, modelTypeId, tagId, limit, orderBy, orderDirection, externalStationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#listContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional] [default to 1]
 **itemId** | **Long**| Search on Item ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **modelTypeId** | **Long**| Search on ModelType ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **tagId** | **Long**| Search on Tag ID *(Optional)* &#x60;(Relation)&#x60; | [optional]
 **limit** | **Long**| Results per page *(Optional)* | [optional]
 **orderBy** | **String**| Field to order the results *(Optional)* | [optional]
 **orderDirection** | **String**| Direction of ordering *(Optional)* | [optional] [enum: asc, desc]
 **externalStationId** | **Long**| Query on a different (content providing) station *(Optional)* | [optional]

### Return type

[**ContactResults**](ContactResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateContactByID"></a>
# **updateContactByID**
> Success updateContactByID(id, data)

Update contact by id

Update contact by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.ContactApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

ContactApi apiInstance = new ContactApi();
Long id = 789L; // Long | ID of Contact **(Required)**
ContactDataInput data = new ContactDataInput(); // ContactDataInput | Data *(Optional)*
try {
    Success result = apiInstance.updateContactByID(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactApi#updateContactByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of Contact **(Required)** |
 **data** | [**ContactDataInput**](ContactDataInput.md)| Data *(Optional)* | [optional]

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

