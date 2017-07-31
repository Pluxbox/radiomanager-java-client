
# BroadcastResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  | 
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**deletedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**externalStationId** | **Long** |  |  [optional]
**programId** | **Long** |  |  [optional]
**modelTypeId** | **Long** |  |  [optional]
**stationId** | **Long** |  |  [optional]
**fieldValues** | [**BroadcastFieldValues**](BroadcastFieldValues.md) |  |  [optional]
**title** | **String** |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**stop** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**genreId** | **Long** |  |  [optional]
**description** | **String** |  |  [optional]
**shortName** | **String** |  |  [optional]
**mediumName** | **String** |  |  [optional]
**website** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**recommended** | **Boolean** |  |  [optional]
**language** | **String** |  |  [optional]
**published** | **Boolean** |  |  [optional]
**repetitionUid** | **String** |  |  [optional]
**repetitionType** | [**RepetitionTypeEnum**](#RepetitionTypeEnum) |  |  [optional]
**repetitionEnd** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**repetitionStart** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**repetitionDays** | **List&lt;Boolean&gt;** |  |  [optional]
**ptyCodeId** | **Long** |  |  [optional]
**items** | [**BroadcastRelationsItems**](BroadcastRelationsItems.md) |  |  [optional]
**blocks** | [**BroadcastRelationsBlocks**](BroadcastRelationsBlocks.md) |  |  [optional]
**program** | [**BlockRelationsProgram**](BlockRelationsProgram.md) |  |  [optional]
**tags** | [**BroadcastRelationsTags**](BroadcastRelationsTags.md) |  |  [optional]
**presenters** | [**BroadcastRelationsPresenters**](BroadcastRelationsPresenters.md) |  |  [optional]
**modelType** | [**BroadcastRelationsModelType**](BroadcastRelationsModelType.md) |  |  [optional]


<a name="RepetitionTypeEnum"></a>
## Enum: RepetitionTypeEnum
Name | Value
---- | -----
_1_WEEK | &quot;1 week&quot;
_2_WEEKS | &quot;2 weeks&quot;
_4_WEEKS | &quot;4 weeks&quot;
_1_MONTH | &quot;1 month&quot;



