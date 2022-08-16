package nl.stijngroenen.tradfri.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.stijngroenen.tradfri.device.GroupProperties;
import nl.stijngroenen.tradfri.util.ApiCode;

/**
 * The class that contains the payload for a request of an IKEA TRÅDFRI group
 *
 * @author Máté Biczó
 * @version 1.3.0
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupRequest {

    /**
     * The on state of the group (true for on, false for off)
     */
    @JsonProperty(ApiCode.ON_OFF)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private Boolean on;

    /**
     * The brightness of the group
     */
    @JsonProperty(ApiCode.BRIGHTNESS)
    private Integer brightness;

    /**
     * The transition time for updating the group
     */
    @JsonProperty(ApiCode.TRANSITION_TIME)
    private Integer transitionTime;

    /**
     * The colour of the lights in the group in hexadecimal
     */
    @JsonProperty(ApiCode.COLOUR_HEX)
    private String colourHex;

    /**
     * Construct the GroupRequest class
     *
     * @param properties The properties to be used for request creation
     * @since 1.3.0
     */
    public GroupRequest(GroupProperties properties) {
        this.on = properties.getOn();
        this.brightness = properties.getBrightness();
        this.transitionTime = properties.getTransitionTime();
        this.colourHex = properties.getColourHex();
    }

    /**
     * Get the on state of the group
     *
     * @return The on state of the group (true for on, false for off)
     * @since 1.3.0
     */
    public Boolean getOn() {
        return on;
    }

    /**
     * Set the on state of the group
     *
     * @param on The new on state for the group (true for on, false for off)
     * @since 1.3.0
     */
    public void setOn(Boolean on) {
        this.on = on;
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
     * @param brightness The new brightness for the group
     * @since 1.3.0
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Get the transition time for updating the group
     *
     * @return The transition time for updating the group
     * @since 1.3.0
     */
    public Integer getTransitionTime() {
        return transitionTime;
    }

    /**
     * Set the transition time for updating the group
     *
     * @param transitionTime The new transition time for updating the group
     * @since 1.3.0
     */
    public void setTransitionTime(Integer transitionTime) {
        this.transitionTime = transitionTime;
    }
}
