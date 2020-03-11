

# ModelTypeResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**name** | **String** |  |  [optional]
**model** | [**ModelEnum**](#ModelEnum) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**options** | [**ModelTypeOptions**](ModelTypeOptions.md) |  |  [optional]
**order** | **Long** |  |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**campaigns** | [**ModelTypeRelationsCampaigns**](ModelTypeRelationsCampaigns.md) |  |  [optional]
**broadcasts** | [**ModelTypeRelationsBroadcasts**](ModelTypeRelationsBroadcasts.md) |  |  [optional]
**programs** | [**ModelTypeRelationsPrograms**](ModelTypeRelationsPrograms.md) |  |  [optional]
**contacts** | [**ModelTypeRelationsContacts**](ModelTypeRelationsContacts.md) |  |  [optional]
**presenters** | [**ModelTypeRelationsPresenters**](ModelTypeRelationsPresenters.md) |  |  [optional]
**items** | [**ModelTypeRelationsItems**](ModelTypeRelationsItems.md) |  |  [optional]
**externalStationId** | **Long** |  |  [optional]



## Enum: ModelEnum

Name | Value
---- | -----
BROADCAST | &quot;broadcast&quot;
PROGRAM | &quot;program&quot;
ITEM | &quot;item&quot;
CAMPAIGN | &quot;campaign&quot;
PRESENTER | &quot;presenter&quot;
CONTACT | &quot;contact&quot;
EXTERNAL | &quot;external&quot;



