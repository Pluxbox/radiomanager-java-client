# API

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.pluxbox.radiomanager</groupId>
    <artifactId>API</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.pluxbox.radiomanager:API:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/API-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.pluxbox.radiomanager.api.invoker.*;
import com.pluxbox.radiomanager.api.invoker.auth.*;
import com.pluxbox.radiomanager.api.models.*;
import com.pluxbox.radiomanager.api.v2.BlockApi;

import java.io.File;
import java.util.*;

public class BlockApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: API Key
        ApiKeyAuth API Key = (ApiKeyAuth) defaultClient.getAuthentication("API Key");
        API Key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //API Key.setApiKeyPrefix("Token");

        BlockApi apiInstance = new BlockApi();
        Long id = 789L; // Long | ID of Block **(Required)**
        Long externalStationId = 789L; // Long | Query on a different (content providing) station *(Optional)*
        try {
            BlockResult result = apiInstance.getBlockById(id, externalStationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BlockApi#getBlockById");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://radiomanager.io/api/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BlockApi* | [**getBlockById**](docs/BlockApi.md#getBlockById) | **GET** /blocks/{id} | Get block by id
*BlockApi* | [**getCurrentBlock**](docs/BlockApi.md#getCurrentBlock) | **GET** /blocks/current | Get current Block
*BlockApi* | [**getNextBlock**](docs/BlockApi.md#getNextBlock) | **GET** /blocks/next | Get upcoming Block
*BlockApi* | [**listBlocks**](docs/BlockApi.md#listBlocks) | **GET** /blocks | Get a list of all blocks currently in your station.
*BroadcastApi* | [**createBroadcast**](docs/BroadcastApi.md#createBroadcast) | **POST** /broadcasts | Create broadcast.
*BroadcastApi* | [**deleteBroadcastById**](docs/BroadcastApi.md#deleteBroadcastById) | **DELETE** /broadcasts/{id} | Delete broadcast by id
*BroadcastApi* | [**getBroadcastById**](docs/BroadcastApi.md#getBroadcastById) | **GET** /broadcasts/{id} | Get broadcast by id
*BroadcastApi* | [**getCurrentBroadcast**](docs/BroadcastApi.md#getCurrentBroadcast) | **GET** /broadcasts/current | Get current Broadcast
*BroadcastApi* | [**getDailyEPG**](docs/BroadcastApi.md#getDailyEPG) | **GET** /broadcasts/epg/daily | Get daily EPG
*BroadcastApi* | [**getEPGByDate**](docs/BroadcastApi.md#getEPGByDate) | **GET** /broadcasts/epg | Get EPG by date
*BroadcastApi* | [**getNextBroadcast**](docs/BroadcastApi.md#getNextBroadcast) | **GET** /broadcasts/next | Get next Broadcast
*BroadcastApi* | [**getWeeklyEPG**](docs/BroadcastApi.md#getWeeklyEPG) | **GET** /broadcasts/epg/weekly | Get weekly EPG
*BroadcastApi* | [**listBroadcasts**](docs/BroadcastApi.md#listBroadcasts) | **GET** /broadcasts | Get all broadcasts.
*BroadcastApi* | [**printBroadcastById**](docs/BroadcastApi.md#printBroadcastById) | **GET** /broadcasts/print/{id} | Print broadcast by id with template
*BroadcastApi* | [**updateBroadcastByID**](docs/BroadcastApi.md#updateBroadcastByID) | **PATCH** /broadcasts/{id} | Update broadcast by id
*CampaignApi* | [**createCampaign**](docs/CampaignApi.md#createCampaign) | **POST** /campaigns | Create campaign.
*CampaignApi* | [**deleteCampaignById**](docs/CampaignApi.md#deleteCampaignById) | **DELETE** /campaigns/{id} | Delete campaign by id
*CampaignApi* | [**getCampaignById**](docs/CampaignApi.md#getCampaignById) | **GET** /campaigns/{id} | Get campaign by id
*CampaignApi* | [**listCampaigns**](docs/CampaignApi.md#listCampaigns) | **GET** /campaigns | Get all campaigns.
*CampaignApi* | [**updateCampaignByID**](docs/CampaignApi.md#updateCampaignByID) | **PATCH** /campaigns/{id} | Update campaign by id
*ContactApi* | [**createContact**](docs/ContactApi.md#createContact) | **POST** /contacts | Create contact.
*ContactApi* | [**deleteContactById**](docs/ContactApi.md#deleteContactById) | **DELETE** /contacts/{id} | Delete contact by id
*ContactApi* | [**getContactById**](docs/ContactApi.md#getContactById) | **GET** /contacts/{id} | Get contact by id
*ContactApi* | [**listContacts**](docs/ContactApi.md#listContacts) | **GET** /contacts | Get all contacts.
*ContactApi* | [**updateContactByID**](docs/ContactApi.md#updateContactByID) | **PATCH** /contacts/{id} | Update contact by id
*GenreApi* | [**getGenreById**](docs/GenreApi.md#getGenreById) | **GET** /genres/{id} | Get genre by id
*GenreApi* | [**listGenres**](docs/GenreApi.md#listGenres) | **GET** /genres | List all genres.
*ItemApi* | [**createItem**](docs/ItemApi.md#createItem) | **POST** /items | Create an new item.
*ItemApi* | [**currentItemPostStructure**](docs/ItemApi.md#currentItemPostStructure) | **POST** /items/current/structure | Post a current playing item, keep structure
*ItemApi* | [**currentItemPostTiming**](docs/ItemApi.md#currentItemPostTiming) | **POST** /items/current/timing | Post a current playing item
*ItemApi* | [**deleteItemById**](docs/ItemApi.md#deleteItemById) | **DELETE** /items/{id} | Delete item by ID.
*ItemApi* | [**getCurrentItem**](docs/ItemApi.md#getCurrentItem) | **GET** /items/current | Get current Item
*ItemApi* | [**getItemById**](docs/ItemApi.md#getItemById) | **GET** /items/{id} | Get extended item details by ID.
*ItemApi* | [**listItems**](docs/ItemApi.md#listItems) | **GET** /items | Get a list of all the items currently in your station.
*ItemApi* | [**playlistPostMerge**](docs/ItemApi.md#playlistPostMerge) | **POST** /items/playlist/merge | Post a playlist, do not remove previously imported items
*ItemApi* | [**playlistPostStructure**](docs/ItemApi.md#playlistPostStructure) | **POST** /items/playlist/structure | Post a playlist, keep current structure
*ItemApi* | [**playlistPostTiming**](docs/ItemApi.md#playlistPostTiming) | **POST** /items/playlist/timing | Post a playlist
*ItemApi* | [**stopCurrentItem**](docs/ItemApi.md#stopCurrentItem) | **POST** /items/stopcurrent | Stop an Item
*ItemApi* | [**updateItemById**](docs/ItemApi.md#updateItemById) | **PATCH** /items/{id} | Update extended item details by ID.
*ModelTypeApi* | [**getModelTypeById**](docs/ModelTypeApi.md#getModelTypeById) | **GET** /model_types/{id} | Get modelType by id
*ModelTypeApi* | [**listModelTypes**](docs/ModelTypeApi.md#listModelTypes) | **GET** /model_types | Get all modelTypes.
*PresenterApi* | [**createPresenter**](docs/PresenterApi.md#createPresenter) | **POST** /presenters | Create presenter.
*PresenterApi* | [**deletePresenterById**](docs/PresenterApi.md#deletePresenterById) | **DELETE** /presenters/{id} | Delete presenter by id
*PresenterApi* | [**getPresenterById**](docs/PresenterApi.md#getPresenterById) | **GET** /presenters/{id} | Get presenter by id
*PresenterApi* | [**listPresenters**](docs/PresenterApi.md#listPresenters) | **GET** /presenters | Get all presenters.
*PresenterApi* | [**updatePresenterByID**](docs/PresenterApi.md#updatePresenterByID) | **PATCH** /presenters/{id} | Update presenter by id
*ProgramApi* | [**createProgram**](docs/ProgramApi.md#createProgram) | **POST** /programs | Create program.
*ProgramApi* | [**deleteProgramById**](docs/ProgramApi.md#deleteProgramById) | **DELETE** /programs/{id} | Delete program by id
*ProgramApi* | [**getProgramById**](docs/ProgramApi.md#getProgramById) | **GET** /programs/{id} | Get program by id
*ProgramApi* | [**listPrograms**](docs/ProgramApi.md#listPrograms) | **GET** /programs | Get all programs.
*ProgramApi* | [**updateProgramByID**](docs/ProgramApi.md#updateProgramByID) | **PATCH** /programs/{id} | Update program by id
*StationApi* | [**getStation**](docs/StationApi.md#getStation) | **GET** /station | Get own station only
*StoryApi* | [**createStory**](docs/StoryApi.md#createStory) | **POST** /stories | Create story.
*StoryApi* | [**deleteStoryById**](docs/StoryApi.md#deleteStoryById) | **DELETE** /stories/{id} | Delete story by id
*StoryApi* | [**getStoryById**](docs/StoryApi.md#getStoryById) | **GET** /stories/{id} | Get story by id
*StoryApi* | [**listStories**](docs/StoryApi.md#listStories) | **GET** /stories | Get all stories.
*StoryApi* | [**updateStoryByID**](docs/StoryApi.md#updateStoryByID) | **PATCH** /stories/{id} | Update story by id
*StringApi* | [**getStringsByName**](docs/StringApi.md#getStringsByName) | **GET** /strings/{name} | Get Strings (formatted)
*TagApi* | [**createTag**](docs/TagApi.md#createTag) | **POST** /tags | Create tag.
*TagApi* | [**deleteTagById**](docs/TagApi.md#deleteTagById) | **DELETE** /tags/{id} | Delete tag by id
*TagApi* | [**getTagById**](docs/TagApi.md#getTagById) | **GET** /tags/{id} | Get tags by id
*TagApi* | [**listTags**](docs/TagApi.md#listTags) | **GET** /tags | Get a list of all the tags currently in your station.
*TagApi* | [**updateTagByID**](docs/TagApi.md#updateTagByID) | **PATCH** /tags/{id} | Update tag by id
*UserApi* | [**deleteUserById**](docs/UserApi.md#deleteUserById) | **DELETE** /users/{id} | Remove user from station by Id
*UserApi* | [**getUserById**](docs/UserApi.md#getUserById) | **GET** /users/{id} | Get user by id
*UserApi* | [**inviteUserByMail**](docs/UserApi.md#inviteUserByMail) | **POST** /users/invite | Invite user by mail
*UserApi* | [**listUsers**](docs/UserApi.md#listUsers) | **GET** /users | Get all users.
*VisualSlideApi* | [**getVisualSlide**](docs/VisualSlideApi.md#getVisualSlide) | **GET** /visual | Get Visual Slide Image as Base64


## Documentation for Models

 - [Block](docs/Block.md)
 - [BlockRelations](docs/BlockRelations.md)
 - [BlockRelationsBroadcast](docs/BlockRelationsBroadcast.md)
 - [BlockRelationsBroadcastParams](docs/BlockRelationsBroadcastParams.md)
 - [BlockRelationsItems](docs/BlockRelationsItems.md)
 - [BlockRelationsItemsParams](docs/BlockRelationsItemsParams.md)
 - [BlockRelationsProgram](docs/BlockRelationsProgram.md)
 - [BlockResults](docs/BlockResults.md)
 - [Broadcast](docs/Broadcast.md)
 - [BroadcastEPGDay](docs/BroadcastEPGDay.md)
 - [BroadcastEPGRelations](docs/BroadcastEPGRelations.md)
 - [BroadcastInputOnly](docs/BroadcastInputOnly.md)
 - [BroadcastOutputOnly](docs/BroadcastOutputOnly.md)
 - [BroadcastRelations](docs/BroadcastRelations.md)
 - [BroadcastRelationsBlocks](docs/BroadcastRelationsBlocks.md)
 - [BroadcastRelationsGenre](docs/BroadcastRelationsGenre.md)
 - [BroadcastRelationsItems](docs/BroadcastRelationsItems.md)
 - [BroadcastRelationsItemsParams](docs/BroadcastRelationsItemsParams.md)
 - [BroadcastRelationsModelType](docs/BroadcastRelationsModelType.md)
 - [BroadcastRelationsPresenters](docs/BroadcastRelationsPresenters.md)
 - [BroadcastRelationsTags](docs/BroadcastRelationsTags.md)
 - [BroadcastResults](docs/BroadcastResults.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignOutputOnly](docs/CampaignOutputOnly.md)
 - [CampaignRelations](docs/CampaignRelations.md)
 - [CampaignRelationsItems](docs/CampaignRelationsItems.md)
 - [CampaignRelationsItemsParams](docs/CampaignRelationsItemsParams.md)
 - [CampaignResults](docs/CampaignResults.md)
 - [CampaignTemplateItem](docs/CampaignTemplateItem.md)
 - [Contact](docs/Contact.md)
 - [ContactOutputOnly](docs/ContactOutputOnly.md)
 - [ContactRelations](docs/ContactRelations.md)
 - [ContactRelationsItems](docs/ContactRelationsItems.md)
 - [ContactRelationsTags](docs/ContactRelationsTags.md)
 - [ContactRelationsTagsParams](docs/ContactRelationsTagsParams.md)
 - [ContactResults](docs/ContactResults.md)
 - [Data](docs/Data.md)
 - [Data1](docs/Data1.md)
 - [Data2](docs/Data2.md)
 - [Data3](docs/Data3.md)
 - [EPGResults](docs/EPGResults.md)
 - [Forbidden](docs/Forbidden.md)
 - [Genre](docs/Genre.md)
 - [GenreOutputOnly](docs/GenreOutputOnly.md)
 - [GenreRelations](docs/GenreRelations.md)
 - [GenreRelationsBroadcasts](docs/GenreRelationsBroadcasts.md)
 - [GenreRelationsBroadcastsParams](docs/GenreRelationsBroadcastsParams.md)
 - [GenreRelationsPrograms](docs/GenreRelationsPrograms.md)
 - [GenreResults](docs/GenreResults.md)
 - [ImportItem](docs/ImportItem.md)
 - [InlineResponse202](docs/InlineResponse202.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [InviteUserData](docs/InviteUserData.md)
 - [InviteUserSuccess](docs/InviteUserSuccess.md)
 - [Item](docs/Item.md)
 - [ItemInputOnly](docs/ItemInputOnly.md)
 - [ItemOutputOnly](docs/ItemOutputOnly.md)
 - [ItemRelations](docs/ItemRelations.md)
 - [ItemRelationsBlock](docs/ItemRelationsBlock.md)
 - [ItemRelationsCampaign](docs/ItemRelationsCampaign.md)
 - [ItemRelationsContacts](docs/ItemRelationsContacts.md)
 - [ItemRelationsContactsParams](docs/ItemRelationsContactsParams.md)
 - [ItemRelationsProgram](docs/ItemRelationsProgram.md)
 - [ItemRelationsTags](docs/ItemRelationsTags.md)
 - [ItemResults](docs/ItemResults.md)
 - [ModelType](docs/ModelType.md)
 - [ModelTypeOptions](docs/ModelTypeOptions.md)
 - [ModelTypeOutputOnly](docs/ModelTypeOutputOnly.md)
 - [ModelTypeRelations](docs/ModelTypeRelations.md)
 - [ModelTypeRelationsBroadcasts](docs/ModelTypeRelationsBroadcasts.md)
 - [ModelTypeRelationsCampaigns](docs/ModelTypeRelationsCampaigns.md)
 - [ModelTypeRelationsCampaignsParams](docs/ModelTypeRelationsCampaignsParams.md)
 - [ModelTypeRelationsContacts](docs/ModelTypeRelationsContacts.md)
 - [ModelTypeRelationsItems](docs/ModelTypeRelationsItems.md)
 - [ModelTypeRelationsPresenters](docs/ModelTypeRelationsPresenters.md)
 - [ModelTypeRelationsPrograms](docs/ModelTypeRelationsPrograms.md)
 - [ModelTypeResults](docs/ModelTypeResults.md)
 - [NotFound](docs/NotFound.md)
 - [PostSuccess](docs/PostSuccess.md)
 - [Presenter](docs/Presenter.md)
 - [PresenterOutputOnly](docs/PresenterOutputOnly.md)
 - [PresenterRelations](docs/PresenterRelations.md)
 - [PresenterRelationsBroadcasts](docs/PresenterRelationsBroadcasts.md)
 - [PresenterRelationsPrograms](docs/PresenterRelationsPrograms.md)
 - [PresenterRelationsProgramsParams](docs/PresenterRelationsProgramsParams.md)
 - [PresenterResults](docs/PresenterResults.md)
 - [Program](docs/Program.md)
 - [ProgramInputOnly](docs/ProgramInputOnly.md)
 - [ProgramOutputOnly](docs/ProgramOutputOnly.md)
 - [ProgramRelations](docs/ProgramRelations.md)
 - [ProgramRelationsBlocks](docs/ProgramRelationsBlocks.md)
 - [ProgramRelationsBroadcasts](docs/ProgramRelationsBroadcasts.md)
 - [ProgramRelationsItems](docs/ProgramRelationsItems.md)
 - [ProgramRelationsItemsParams](docs/ProgramRelationsItemsParams.md)
 - [ProgramRelationsPresenters](docs/ProgramRelationsPresenters.md)
 - [ProgramRelationsTags](docs/ProgramRelationsTags.md)
 - [ProgramResults](docs/ProgramResults.md)
 - [ReadOnly](docs/ReadOnly.md)
 - [RelationsPlaceholder](docs/RelationsPlaceholder.md)
 - [StationResult](docs/StationResult.md)
 - [StationResultStation](docs/StationResultStation.md)
 - [StationResultStationStartDays](docs/StationResultStationStartDays.md)
 - [Story](docs/Story.md)
 - [StoryInputOnly](docs/StoryInputOnly.md)
 - [StoryOutputOnly](docs/StoryOutputOnly.md)
 - [StoryRelations](docs/StoryRelations.md)
 - [StoryRelationsItems](docs/StoryRelationsItems.md)
 - [StoryRelationsTags](docs/StoryRelationsTags.md)
 - [StoryRelationsTagsParams](docs/StoryRelationsTagsParams.md)
 - [StoryResults](docs/StoryResults.md)
 - [Success](docs/Success.md)
 - [Tag](docs/Tag.md)
 - [TagOutputOnly](docs/TagOutputOnly.md)
 - [TagRelations](docs/TagRelations.md)
 - [TagRelationsBroadcasts](docs/TagRelationsBroadcasts.md)
 - [TagRelationsBroadcastsParams](docs/TagRelationsBroadcastsParams.md)
 - [TagRelationsContacts](docs/TagRelationsContacts.md)
 - [TagRelationsItems](docs/TagRelationsItems.md)
 - [TagRelationsPrograms](docs/TagRelationsPrograms.md)
 - [TagResults](docs/TagResults.md)
 - [TextString](docs/TextString.md)
 - [TooManyRequests](docs/TooManyRequests.md)
 - [UnprocessableEntity](docs/UnprocessableEntity.md)
 - [UserResult](docs/UserResult.md)
 - [UserResultRoles](docs/UserResultRoles.md)
 - [UserResultSettings](docs/UserResultSettings.md)
 - [UserResults](docs/UserResults.md)
 - [VisualResult](docs/VisualResult.md)
 - [BlockResult](docs/BlockResult.md)
 - [BroadcastDataInput](docs/BroadcastDataInput.md)
 - [BroadcastEPGResult](docs/BroadcastEPGResult.md)
 - [BroadcastResult](docs/BroadcastResult.md)
 - [CampaignDataInput](docs/CampaignDataInput.md)
 - [CampaignResult](docs/CampaignResult.md)
 - [ContactDataInput](docs/ContactDataInput.md)
 - [ContactResult](docs/ContactResult.md)
 - [GenreResult](docs/GenreResult.md)
 - [ItemDataInput](docs/ItemDataInput.md)
 - [ItemResult](docs/ItemResult.md)
 - [ModelTypeResult](docs/ModelTypeResult.md)
 - [PresenterDataInput](docs/PresenterDataInput.md)
 - [PresenterEPGResult](docs/PresenterEPGResult.md)
 - [PresenterResult](docs/PresenterResult.md)
 - [ProgramDataInput](docs/ProgramDataInput.md)
 - [ProgramResult](docs/ProgramResult.md)
 - [StoryDataInput](docs/StoryDataInput.md)
 - [StoryResult](docs/StoryResult.md)
 - [TagDataInput](docs/TagDataInput.md)
 - [TagResult](docs/TagResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### API Key

- **Type**: API key
- **API key parameter name**: api-key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Authors

support@pluxbox.com

