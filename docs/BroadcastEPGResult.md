

# BroadcastEPGResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**deletedAt** | **OffsetDateTime** |  |  [optional] |
|**externalStationId** | **Long** |  |  [optional] |
|**programId** | **Long** |  |  [optional] |
|**modelTypeId** | **Long** |  |  [optional] |
|**stationId** | **Long** |  |  [optional] |
|**fieldValues** | **Object** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**start** | **OffsetDateTime** |  |  [optional] |
|**stop** | **OffsetDateTime** |  |  [optional] |
|**genreId** | **Long** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**shortName** | **String** |  |  [optional] |
|**mediumName** | **String** |  |  [optional] |
|**website** | **String** |  |  [optional] |
|**email** | **String** |  |  [optional] |
|**recommended** | **Boolean** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**published** | **Boolean** |  |  [optional] |
|**repetitionUid** | **String** |  |  [optional] |
|**repetitionType** | [**RepetitionTypeEnum**](#RepetitionTypeEnum) |  |  [optional] |
|**repetitionEnd** | **OffsetDateTime** |  |  [optional] |
|**repetitionStart** | **OffsetDateTime** |  |  [optional] |
|**repetitionDays** | **String** |  |  [optional] |
|**ptyCodeId** | **Long** |  |  [optional] |
|**plannedInEpg** | **Integer** |  |  [optional] |
|**groupId** | **Long** |  |  [optional] |
|**items** | [**BroadcastRelationsItems**](BroadcastRelationsItems.md) |  |  [optional] |
|**blocks** | [**BroadcastRelationsBlocks**](BroadcastRelationsBlocks.md) |  |  [optional] |
|**program** | [**BlockRelationsProgram**](BlockRelationsProgram.md) |  |  [optional] |
|**tags** | [**BroadcastRelationsTags**](BroadcastRelationsTags.md) |  |  [optional] |
|**presenters** | [**List&lt;PresenterEPGResult&gt;**](PresenterEPGResult.md) |  |  [optional] |
|**modelType** | [**BroadcastRelationsModelType**](BroadcastRelationsModelType.md) |  |  [optional] |



## Enum: RepetitionTypeEnum

| Name | Value |
|---- | -----|
| _1_WEEK | &quot;1 week&quot; |
| _2_WEEK | &quot;2 week&quot; |
| _4_WEEK | &quot;4 week&quot; |
| _1_MONTH | &quot;1 month&quot; |



