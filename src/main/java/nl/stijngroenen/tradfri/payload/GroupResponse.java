package nl.stijngroenen.tradfri.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import nl.stijngroenen.tradfri.device.GroupProperties;
import nl.stijngroenen.tradfri.util.ApiCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The class that contains the payload for a response of an IKEA TRÅDFRI group
 *
 * @author Máté Biczó
 * @version 1.3.0
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupResponse {

    /**
     * The name of the group
     */
    @JsonProperty(ApiCode.NAME)
    private String name;

    /**
     * The brightness of the group
     */
    @JsonProperty(ApiCode.BRIGHTNESS)
    private Integer brightness;

    /**
     * The instance id of the group
     */
    @JsonProperty(ApiCode.INSTANCE_ID)
    private Integer instanceId;

    /**
     * The creation date of the group
     */
    @JsonProperty(ApiCode.CREATION_DATE)
    private Long creationDate;

    /**
     * The on state of the group (true for on, false for off)
     */
    @JsonProperty(ApiCode.ON_OFF)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Boolean on;

    /**
     * The id of the scene assigned to the group
     */
    @JsonProperty(ApiCode.SCENE_ID)
    private Integer sceneId;

    /**
     * List of devices belonging to the group
     */
    private List<Integer> deviceIds = new ArrayList<>();

    @JsonProperty(ApiCode.ACCESSORY_LINK_REMOTE)
    private void unpackDeviceIds(JsonNode devices) {
        List<Integer> ids = new ArrayList<>();
        for (Iterator<JsonNode> it = devices.get("15002").get("9003").elements(); it.hasNext(); ) {
            JsonNode node = it.next();
            ids.add(node.asInt());
        }
        deviceIds = ids;
    }

    /**
     * Get the name of the group
     *
     * @return The name of the group
     * @since 1.3.0
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the group
     *
     * @param name The name of the group
     * @since 1.3.0
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the brightness of the group
     *
     * @return The brightness of the group
     * @since 1.3.0
     */
    public Integer getBrightness() {
        return brightness;
    }

    /**
     * Set the brightness of the group
     *
     * @param brightness The brightness of the group
     * @since 1.3.0
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Get the instance id of the group
     *
     * @return The instance id of the group
     * @since 1.3.0
     */
    public Integer getInstanceId() {
        return instanceId;
    }

    /**
     * Set the instance id of the group
     *
     * @param instanceId The instance id of the group
     * @since 1.3.0
     */
    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * Get the creation date of the group
     *
     * @return The creation date of the group
     * @since 1.3.0
     */
    public Long getCreationDate() {
        return creationDate;
    }

    /**
     * Set the creation date of the group
     *
     * @param creationDate The creation date of the group
     * @since 1.3.0
     */
    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Get the on / off state of the group
     *
     * @return The on / off state of the group (true for on, false for off)
     * @since 1.3.0
     */
    public Boolean getOn() {
        return on;
    }

    /**
     * Get a list of devices belonging to the group
     *
     * @return A list of devices belonging to the group
     * @since 1.3.0
     */
    public List<Integer> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Set the list of devices belonging to the group
     *
     * @param deviceIds The list of devices belonging to the group
     */
    public void setDeviceIds(List<Integer> deviceIds) {
        this.deviceIds = deviceIds;
    }

    /**
     * Set the on / off state of the group
     *
     * @param on The on / off state of the group (true for on, false for off)
     * @since 1.3.0
     */
    public void setOn(Boolean on) {
        this.on = on;
    }

    /**
     * Get the id of the scene assigned to the group
     *
     * @return The id of the scene assigned to the group
     * @since 1.3.0
     */
    public Integer getSceneId() {
        return sceneId;
    }

    /**
     * Set the id of the scene assigned to the group
     *
     * @param sceneId The id of the scene assigned to the group
     * @since 1.3.0
     */
    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    /**
     * Create a GroupProperties object from the response object
     *
     * @return a GroupProperties created from the response
     * @since 1.3.0
     */
    public GroupProperties getGroupProperties() {
        return new GroupProperties(this.on, this.brightness, null, null);
    }
}
