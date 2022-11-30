

# BlockResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | ID of the current Block. |  |
|**broadcastId** | **Long** | Currently assigned Broadcast connected to the current Block, identified by the Broadcast ID. |  |
|**start** | **OffsetDateTime** | Start of the Block (formatted as a DateTime object), saved with an TimeZone. |  |
|**stop** | **OffsetDateTime** | End of the Block (formatted as a DateTime object), saved with an TimeZone. |  |
|**createdAt** | **OffsetDateTime** | Time of the creation of the Block (formatted as a DateTime object), saved with an TimeZone. |  |
|**updatedAt** | **OffsetDateTime** | Time of the last update of the Block (formatted as a DateTime object), saved with an TimeZone. |  |
|**deletedAt** | **OffsetDateTime** | Moment when the Block got deleted (formatted as a DateTime object), saved with an TimeZone. |  |
|**externalStationId** | **Long** |  |  [optional] |
|**items** | [**BlockRelationsItems**](BlockRelationsItems.md) |  |  [optional] |
|**broadcast** | [**BlockRelationsBroadcast**](BlockRelationsBroadcast.md) |  |  [optional] |
|**program** | [**BlockRelationsProgram**](BlockRelationsProgram.md) |  |  [optional] |



