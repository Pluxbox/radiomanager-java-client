

# ItemDataInput

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**modelTypeId** | **Long** |  | 
**blockId** | **Long** |  |  [optional]
**externalId** | **String** |  |  [optional]
**fieldValues** | [**Object**](.md) |  |  [optional]
**title** | **String** |  |  [optional]
**duration** | **Long** |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**_import** | **Long** |  |  [optional]
**campaignId** | **Long** |  |  [optional]
**recommended** | **Boolean** |  |  [optional]
**stationDraftId** | **Long** |  |  [optional]
**programDraftId** | **Long** |  |  [optional]
**userDraftId** | **Long** |  |  [optional]
**staticStart** | **Boolean** |  |  [optional]
**details** | **String** |  |  [optional]
**previousId** | **Long** |  |  [optional]
**beforeId** | **Long** |  |  [optional]
**contacts** | **List&lt;Integer&gt;** |  |  [optional]
**tags** | **List&lt;Integer&gt;** |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
SCHEDULED | &quot;scheduled&quot;
PLAYING | &quot;playing&quot;
PLAYED | &quot;played&quot;



