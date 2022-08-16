package nl.stijngroenen.tradfri.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.stijngroenen.tradfri.util.ApiCode;

/**
 * The class that contains the properties of an IKEA TRÅDFRI group
 *
 * @author Máté Biczó
 * @version 1.3.0
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupProperties {

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
     * Construct the GroupProperties class
     *
     * @param on             The on state of the group (true for on, false for off)
     * @param brightness     The brightness of the group
     * @param transitionTime The transition time for updating the group
     * @since 1.3.0
     */
    public GroupProperties(Boolean on, Integer brightness, Integer transitionTime, String colourHex) {
        this.on = on;
        this.brightness = brightness;
        this.transitionTime = transitionTime;
        this.colourHex = colourHex;
    }

    /**
     * Construct the GroupProperties class
     *
     * @since 1.3.0
     */
    public GroupProperties() {
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
     * Set the transition time for updating the group within the GroupProperties class<br>
     * <i>Note: This does not change the actual group</i>
     *
     * @param transitionTime The new transition time for updating the group
     * @since 1.3.0
     */
    public void setTransitionTime(Integer transitionTime) {
        this.transitionTime = transitionTime;
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
     * Set the on state of the group within the GroupProperties class<br>
     * <i>Note: This does not change the actual group</i>
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
     * Set the brightness of the group within the GroupProperties class<br>
     * <i>Note: This does not change the actual group</i>
     *
     * @param brightness The new brightness for the group
     * @since 1.3.0
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Get the colour of the lights of the group in hexadecimal
     *
     * @return The colour in hexadecimal of the group
     * @since 1.3.0
     */
    public String getColourHex() {
        return colourHex;
    }

    /**
     * Set the colour of the lights in group within the GroupProperties class<br>
     * <i>Note: This does not change the actual group</i>
     *
     * @param colourHex The new colour value in hexadecimal for the group
     * @since 1.3.0
     */
    public void setColourHex(String colourHex) {
        this.colourHex = colourHex;
    }
}
