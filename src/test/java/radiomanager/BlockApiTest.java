/*
 * RadioManager
 * This OpenAPI 3 Document describes the functionality of the API v2 of RadioManager. Note that no rights can be derived from this Document and the true functionality of the API might differ.
 *
 * The version of the OpenAPI document: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package radiomanager;

import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.models.BlockResult;
import com.pluxbox.radiomanager.api.models.InlineResponse200;
import com.pluxbox.radiomanager.api.models.InlineResponse400;
import com.pluxbox.radiomanager.api.models.InlineResponse401;
import com.pluxbox.radiomanager.api.models.InlineResponse403;
import com.pluxbox.radiomanager.api.models.InlineResponse404;
import com.pluxbox.radiomanager.api.models.InlineResponse422;
import com.pluxbox.radiomanager.api.models.InlineResponse429;
import com.pluxbox.radiomanager.api.models.InlineResponse500;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Disabled
public class BlockApiTest {

    private final BlockApi api = new BlockApi();

    /**
     * Get block by id
     *
     * Get block by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBlockByIdTest() throws ApiException {
        Long id = null;
        Long externalStationId = null;
        BlockResult response = api.getBlockById(id, externalStationId);
        // TODO: test validations
    }

    /**
     * Get current Block
     *
     * Get currently playing Block
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentBlockTest() throws ApiException {
        BlockResult response = api.getCurrentBlock();
        // TODO: test validations
    }

    /**
     * Get upcoming Block
     *
     * Get currently upcoming Block
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getNextBlockTest() throws ApiException {
        BlockResult response = api.getNextBlock();
        // TODO: test validations
    }

    /**
     * Get a list of all blocks currently in your station.
     *
     * Get a list of all blocks currently in your station. This feature supports pagination and will give a maximum of 50 blocks back.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBlocksTest() throws ApiException {
        Long broadcastId = null;
        Long itemId = null;
        Long programId = null;
        OffsetDateTime startMin = null;
        OffsetDateTime startMax = null;
        Long page = null;
        Long limit = null;
        String orderBy = null;
        String orderDirection = null;
        Long externalStationId = null;
        InlineResponse200 response = api.listBlocks(broadcastId, itemId, programId, startMin, startMax, page, limit, orderBy, orderDirection, externalStationId);
        // TODO: test validations
    }

}
