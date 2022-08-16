package nl.stijngroenen.tradfri.device;

import nl.stijngroenen.tradfri.payload.GroupRequest;
import nl.stijngroenen.tradfri.util.ApiEndpoint;
import nl.stijngroenen.tradfri.util.CoapClient;

import java.util.List;

/**
 * The class that represents an IKEA TRÅDFRI group
 *
 * @author Máté Biczó
 * @since 1.3.0
 */
public class Group {

    /**
     * The current properties of the group
     */
    private final GroupProperties properties;

    /**
     * The new properties of the group in the update queue
     */
    private GroupProperties newProperties;

    /**
     * The name of the group
     */
    private final String name;

    /**
     * The instance id of the group
     */
    private final Integer instanceId;

    /**
     * The creation date of the group
     */
    private final Long creationDate;

    /**
     * The devices belonging to the group
     */
    private final List<Device> devices;

    /**
     * A CoAP client that can be used to communicate with the device using the IKEA TRÅDFRI gateway
     */
    private final CoapClient coapClient;

    /**
     * Construct the Group class
     *
     * @param name         The name of the group
     * @param instanceId   The instance id of the group
     * @param creationDate The creation date of the group
     * @param devices      The devices belonging to the group
     * @param properties   The properties of the group
     * @param coapClient   A CoAP client that can be used to communicate with the device using the IKEA TRÅDFRI gateway
     * @since 1.3.0
     */
    public Group(String name, Integer instanceId, Long creationDate, List<Device> devices, GroupProperties properties, CoapClient coapClient) {
        this.name = name;
        this.instanceId = instanceId;
        this.creationDate = creationDate;
        this.devices = devices;
        this.properties = properties;
        this.coapClient = coapClient;
        this.newProperties = new GroupProperties();
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
     * Get the brightness of the group
     *
     * @return The brightness of the group
     * @since 1.3.0
     */
    public Integer getBrightness() {
        return properties.getBrightness();
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
     * Get the creation date of the group
     *
     * @return The creation date of the group
     * @since 1.3.0
     */
    public Long getCreationDate() {
        return creationDate;
    }

    /**
     * Get the on / off state of the group
     *
     * @return The on / off state of the group (true for on, false for off)
     * @since 1.3.0
     */
    public Boolean getOn() {
        return properties.getOn();
    }

    /**
     * Set the on / off state of the group
     *
     * @param on The new on / off state for the group (true for on, false for off)
     * @return True if successfully updated the on / off state of the group, false if not
     * @since 1.3.0
     */
    public boolean setOn(Boolean on) {
        GroupProperties newProperties = new GroupProperties();
        newProperties.setOn(on);
        return applyUpdate(newProperties);
    }

    /**
     * Update the on / off state of the group in the update queue
     *
     * @param on The new on / off state for the group (true for on, false for off)
     * @since 1.3.0
     */
    public void updateOn(Boolean on) {
        newProperties.setOn(on);
    }

    /**
     * Set the brightness of the group
     *
     * @param brightness The new brightness for the group
     * @return True if successfully updated the brightness of the group, false if not
     * @since 1.3.0
     */
    public boolean setBrightness(Integer brightness) {
        return setBrightness(brightness, null);
    }

    /**
     * Set the brightness of the group
     *
     * @param brightness     The new brightness for the group
     * @param transitionTime The transition time for updating the group
     * @return True if successfully updated the brightness of the group, false if not
     * @since 1.3.0
     */
    public boolean setBrightness(Integer brightness, Integer transitionTime) {
        GroupProperties newProperties = new GroupProperties();
        newProperties.setBrightness(brightness);
        newProperties.setTransitionTime(transitionTime);
        return applyUpdate(newProperties);
    }

    /**
     * Update the brightness of the group in the update queue
     *
     * @param brightness The new brightness for the group
     * @since 1.3.0
     */
    public void updateBrightness(Integer brightness) {
        newProperties.setBrightness(brightness);
    }

    /**
     * Get the colour of the group in hexadecimals
     * @return The colour of the group in hexadecimals
     * @since 1.3.0
     */
    public String getColourHex() {
        return properties.getColourHex();
    }

    /**
     * Update the colour of the group in the update queue to a predefined hexadecimal colour<br>
     * Available colours:<br>
     * <ul>
     *     <li>RGB: {@link nl.stijngroenen.tradfri.util.ColourHex}</li>
     *     <li>Colour temperatures: {@link nl.stijngroenen.tradfri.util.ColourTemperatureHex}</li>
     * </ul>
     * @param colourHex The new colour for the group
     * @since 1.3.0
     */
    public void updateColourHex(String colourHex) {
        newProperties.setColourHex(colourHex);
    }

    /**
     * Set the colour of the group to a predefined hexadecimal colour<br>
     * Available colours:<br>
     * <ul>
     *     <li>RGB: {@link nl.stijngroenen.tradfri.util.ColourHex}</li>
     *     <li>Colour temperatures: {@link nl.stijngroenen.tradfri.util.ColourTemperatureHex}</li>
     * </ul>
     * @param colourHex The new colour for the group
     * @param transitionTime The transition time for updating the light
     * @return True if successfully updated the colour of the light, false if not
     * @since 1.3.0
     */
    public boolean setColourHex(String colourHex, Integer transitionTime) {
        GroupProperties newProperties = new GroupProperties();
        newProperties.setColourHex(colourHex);
        newProperties.setTransitionTime(transitionTime);
        return applyUpdate(newProperties);
    }

    /**
     * Set the colour of the group to a predefined hexadecimal colour<br>
     * Available colours:<br>
     * <ul>
     *     <li>RGB: {@link nl.stijngroenen.tradfri.util.ColourHex}</li>
     *     <li>Colour temperatures: {@link nl.stijngroenen.tradfri.util.ColourTemperatureHex}</li>
     * </ul>
     * @param colourHex The new colour for the group
     * @return True if successfully updated the colour of the light, false if not
     * @since 1.3.0
     */
    public boolean setColourHex(String colourHex) {
        return setColourHex(colourHex, null);
    }

    /**
     * Update the transition time for updating the group in the update queue
     *
     * @param transitionTime The new transition time for updating the group
     * @since 1.0.0
     */
    public void updateTransitionTime(Integer transitionTime) {
        newProperties.setTransitionTime(transitionTime);
    }

    /**
     * Get a list of devices belonging to the group
     *
     * @return A list of devices belonging to the group
     * @since 1.3.0
     */
    public List<Device> getDevices() {
        return devices;
    }

    /**
     * Apply updates to the group
     *
     * @param newProperties The new properties to apply to the group
     * @return True if successfully updated the group, false if not
     * @since 1.3.0
     */
    private boolean applyUpdate(GroupProperties newProperties) {
        GroupRequest request = new GroupRequest(newProperties);
        String response = coapClient.put(ApiEndpoint.getUri(ApiEndpoint.GROUPS, String.valueOf(getInstanceId())), request, String.class);
        return response != null;
    }

    /**
     * Apply the updates in the update queue to the group
     *
     * @return True if successfully updated the group, false if not
     * @since 1.3.0
     */
    public boolean applyUpdates() {
        boolean success = applyUpdate(newProperties);
        newProperties = new GroupProperties();
        return success;
    }

    /**
     * Apply the updates in the update queue to the group
     *
     * @param transitionTime The transition time for updating the group
     * @return True if successfully updated the group, false if not
     * @since 1.3.0
     */
    public boolean applyUpdates(Integer transitionTime) {
        newProperties.setTransitionTime(transitionTime);
        return applyUpdates();
    }
}
