# UserApi

All URIs are relative to *https://staging.radiomanager.pluxbox.com/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](UserApi.md#deleteUserById) | **DELETE** /users/{id} | Remove user from station by Id
[**getUserById**](UserApi.md#getUserById) | **GET** /users/{id} | Get user by id
[**inviteUserByMail**](UserApi.md#inviteUserByMail) | **POST** /users/invite | Invite user by mail
[**listUsers**](UserApi.md#listUsers) | **GET** /users | Get all users.


<a name="deleteUserById"></a>
# **deleteUserById**
> Success deleteUserById(id)

Remove user from station by Id

Remove user from station by Id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long id = 789L; // Long | id of User
try {
    Success result = apiInstance.deleteUserById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#deleteUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of User |

### Return type

[**Success**](Success.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUserById"></a>
# **getUserById**
> UserResult getUserById(id)

Get user by id

Get user by id

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long id = 789L; // Long | id of User
try {
    UserResult result = apiInstance.getUserById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUserById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id of User |

### Return type

[**UserResult**](UserResult.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="inviteUserByMail"></a>
# **inviteUserByMail**
> InviteUserSuccess inviteUserByMail(data)

Invite user by mail

Invite user by mail

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
InviteUserData data = new InviteUserData(); // InviteUserData | Data **(Required)**
try {
    InviteUserSuccess result = apiInstance.inviteUserByMail(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#inviteUserByMail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**InviteUserData**](InviteUserData.md)| Data **(Required)** |

### Return type

[**InviteUserSuccess**](InviteUserSuccess.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUsers"></a>
# **listUsers**
> UserResults listUsers(page, roleId)

Get all users.

List all users.

### Example
```java
// Import classes:
//import com.pluxbox.radiomanager.api.invoker.ApiClient;
//import com.pluxbox.radiomanager.api.invoker.ApiException;
//import com.pluxbox.radiomanager.api.invoker.Configuration;
//import com.pluxbox.radiomanager.api.invoker.auth.*;
//import com.pluxbox.radiomanager.api.v2.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: API Key
ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
API Key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//API Key.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
Long page = 1L; // Long | Current page *(Optional)*
Long roleId = 789L; // Long | Search on Role ID *(Optional)*
try {
    UserResults result = apiInstance.listUsers(page, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#listUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Long**| Current page *(Optional)* | [optional] [default to 1]
 **roleId** | **Long**| Search on Role ID *(Optional)* | [optional]

### Return type

[**UserResults**](UserResults.md)

### Authorization

[API Key](../README.md#API Key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

