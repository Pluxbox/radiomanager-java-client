
# ItemResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataModified** | **Long** |  |  [optional]
**order** | **Long** |  |  [optional]
**templateblockId** | **Long** |  |  [optional]
**templateitemId** | **Long** |  |  [optional]
**externalStationId** | **Long** |  |  [optional]
**modelTypeId** | **Long** |  | 
**blockId** | **Long** |  |  [optional]
**externalId** | **String** |  |  [optional]
**fieldValues** | [**ImportItemFieldValues**](ImportItemFieldValues.md) |  |  [optional]
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
**block** | [**ItemRelationsBlock**](ItemRelationsBlock.md) |  |  [optional]
**broadcast** | [**BlockRelationsBroadcast**](BlockRelationsBroadcast.md) |  |  [optional]
**program** | [**ItemRelationsProgram**](ItemRelationsProgram.md) |  |  [optional]
**contacts** | [**ItemRelationsContacts**](ItemRelationsContacts.md) |  |  [optional]
**tags** | [**ItemRelationsTags**](ItemRelationsTags.md) |  |  [optional]
**campaign** | [**ItemRelationsCampaign**](ItemRelationsCampaign.md) |  |  [optional]
**modelType** | [**BroadcastRelationsModelType**](BroadcastRelationsModelType.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
SCHEDULED | &quot;scheduled&quot;
PLAYING | &quot;playing&quot;
PLAYED | &quot;played&quot;



