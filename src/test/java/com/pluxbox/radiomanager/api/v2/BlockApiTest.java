/*
 * RadioManager
 * RadioManager
 *
 * OpenAPI spec version: 2.0
 * Contact: support@pluxbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.pluxbox.radiomanager.api.v2;

import com.pluxbox.radiomanager.api.invoker.ApiException;
import com.pluxbox.radiomanager.api.models.BlockResult;
import com.pluxbox.radiomanager.api.models.BlockResults;
import com.pluxbox.radiomanager.api.models.Forbidden;
import com.pluxbox.radiomanager.api.models.NotFound;
import java.time.OffsetDateTime;
import com.pluxbox.radiomanager.api.models.TooManyRequests;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BlockApi
 */
@Ignore
public class BlockApiTest {

    private final BlockApi api = new BlockApi();

    
    /**
     * Get block by id
     *
     * Get block by id
     *
     * @throws ApiException
     *          if the Api call fails
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
     * Get current Block
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentBlockTest() throws ApiException {
        BlockResult response = api.getCurrentBlock();

        // TODO: test validations
    }
    
    /**
     * Get next Block
     *
     * Get next Block
     *
     * @throws ApiException
     *          if the Api call fails
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listBlocksTest() throws ApiException {
        Long page = null;
        OffsetDateTime startMin = null;
        OffsetDateTime startMax = null;
        Long broadcastId = null;
        Long programId = null;
        Long itemId = null;
        Long externalStationId = null;
        BlockResults response = api.listBlocks(page, startMin, startMax, broadcastId, programId, itemId, externalStationId);

        // TODO: test validations
    }
    
}
