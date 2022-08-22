/*
   Copyright 2020 Stijn Groenen

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package nl.stijngroenen.tradfri.util;

/**
 * The class that contains constants to find codes for the properties in the requests and responses for the IKEA TRÅDFRI API
 * @author Stijn Groenen
 * @version 1.0.0
 */
public class ApiCode {

    /**
     * Construct the ApiCode class
     * @since 1.0.0
     */
    private ApiCode() {
    }

    // General

    /**
     * The IKEA TRÅDFRI API code for a name property<br>
     * <i>Value: {@value}</i>
     */
    public static final String NAME = "9001";

    /**
     * The IKEA TRÅDFRI API code for a creation date property<br>
     * <i>Value: {@value}</i>
     */
    public static final String CREATION_DATE = "9002";

    /**
     * The IKEA TRÅDFRI API code for an instance id property<br>
     * <i>Value: {@value}</i>
     */
    public static final String INSTANCE_ID = "9003";

    /**
     * The IKEA TRÅDFRI API code for a on / off state property<br>
     * <i>Value: {@value}</i>
     */
    public static final String ON_OFF = "5850";

    /**
     * The IKEA TRÅDFRI API code for a brightness property<br>
     * <i>Value: {@value}</i>
     */
    public static final String BRIGHTNESS = "5851";

    /**
     * The IKEA TRÅDFRI API code for a transition time property<br>
     * <i>Value: {@value}</i>
     */
    public static final String TRANSITION_TIME = "5712";

    // Devices

    /**
     * The IKEA TRÅDFRI API code for a motion sensor property<br>
     * <i>Value: {@value}</i>
     */
    public static final String MOTION_SENSOR = "3300";

    /**
     * The IKEA TRÅDFRI API code for a light property<br>
     * <i>Value: {@value}</i>
     */
    public static final String LIGHT = "3311";

    /**
     * The IKEA TRÅDFRI API code for a plug property<br>
     * <i>Value: {@value}</i>
     */
    public static final String PLUG = "3312";

    /**
     * The IKEA TRÅDFRI API code for a blind property<br>
     * <i>Value: {@value}</i>
     */
    public static final String BLIND = "15015";

    // Device Information

    /**
     * The IKEA TRÅDFRI API code for device information<br>
     * <i>Value: {@value}</i>
     */
    public static final String DEVICE_INFORMATION = "3";

    /**
     * The IKEA TRÅDFRI API code for a device manufacturer<br>
     * <i>Value: {@value}</i>
     */
    public static final String MANUFACTURER = "0";

    /**
     * The IKEA TRÅDFRI API code for a device model name<br>
     * <i>Value: {@value}</i>
     */
    public static final String MODEL_NAME = "1";

    /**
     * The IKEA TRÅDFRI API code for a device serial<br>
     * <i>Value: {@value}</i>
     */
    public static final String SERIAL = "2";

    /**
     * The IKEA TRÅDFRI API code for a device firmware version<br>
     * <i>Value: {@value}</i>
     */
    public static final String FIRMWARE_VERSION = "3";

    /**
     * The IKEA TRÅDFRI API code for a device power source<br>
     * <i>Value: {@value}</i>
     */
    public static final String POWER_SOURCE = "6";

    /**
     * The IKEA TRÅDFRI API code for a device manufacturer<br>
     * <i>Value: {@value}</i>
     */
    public static final String BATTERY_LEVEL = "9";

    // Lights

    /**
     * The IKEA TRÅDFRI API code for a hexadecimal colour property<br>
     * <i>Value: {@value}</i>
     */
    public static final String COLOUR_HEX = "5706";

    /**
     * The IKEA TRÅDFRI API code for a hue property<br>
     * <i>Value: {@value}</i>
     */
    public static final String HUE = "5707";

    /**
     * The IKEA TRÅDFRI API code for a saturation property<br>
     * <i>Value: {@value}</i>
     */
    public static final String SATURATION = "5708";

    /**
     * The IKEA TRÅDFRI API code for a X value of a colour property<br>
     * <i>Value: {@value}</i>
     */
    public static final String COLOUR_X = "5709";

    /**
     * The IKEA TRÅDFRI API code for a Y value of a colour property<br>
     * <i>Value: {@value}</i>
     */
    public static final String COLOUR_Y = "5710";

    /**
     * The IKEA TRÅDFRI API code for a colour temperature property<br>
     * <i>Value: {@value}</i>
     */
    public static final String COLOUR_TEMPERATURE = "5711";

    // Blinds

    /**
     * The IKEA TRÅDFRI API code for a blind position property<br>
     * <i>Value: {@value}</i>
     */
    public static final String POSITION = "5536";

    // Groups

    /**
     * The IKEA TRÅDFRI API code for a accessory link remote property<br>
     * <i>Value: {@value}</i>
     */
    public static final String ACCESSORY_LINK_REMOTE = "9018";

    // Scenes

    /**
     * The IKEA TRÅDFRI API code for a scene icon<br>
     * <i>Value: {@value}</i>
     */
    public static final String SCENE_ICON_ID = "9109";

    /**
     * The IKEA TRÅDFRI API code for the use current light settings flag<br>
     * <i>Value: {@value}</i>
     */
    public static final String USE_CURRENT_LIGHT_SETTINGS = "9070";

    /**
     * The IKEA TRÅDFRI API code for the light setting entity<br>
     * <i>Value: {@value}</i>
     */
    public static final String LIGHT_SETTING = "15013";

    /**
     * The IKEA TRÅDFRI API code for IKEA moods flag<br>
     * <i>Value: {@value}</i>
     */
    public static final String IKEA_MOODS = "9068";

    /**
     * The IKEA TRÅDFRI API code for a scene active state property<br>
     * <i>Value: {@value}</i>
     */
    public static final String SCENE_ACTIVATE_FLAG = "9058";

    /**
     * The IKEA TRÅDFRI API code for a scene id property<br>
     * <i>Value: {@value}</i>
     */
    public static final String SCENE_ID = "9039";

    /**
     * The IKEA TRÅDFRI API code for a scene index property<br>
     * <i>Value: {@value}</i>
     */
    public static final String SCENE_INDEX = "9057";

    /**
     * The IKEA TRÅDFRI API code for a scene link property<br>
     * <i>Value: {@value}</i>
     */
    public static final String SCENE_LINK = "9009";

    /**
     * The IKEA TRÅDFRI API code for a device index id property<br>
     * <i>Value: {@value}</i>
     */
    public static final String DEVICE_INDEX_ID = "9057";

    /**
     * The IKEA TRÅDFRI API code for a predefined scene property<br>
     * <i>Value: {@value}</i>
     */
    public static final String IS_SCENE_PREDEFINED = "9068";

    /**
     * The IKEA TRÅDFRI API code for a light settings property<br>
     * <i>Value: {@value}</i>
     */
    public static final String LIGHT_SETTINGS = "15013";

    // Gateway

    /**
     * The IKEA TRÅDFRI API code for an identity property<br>
     * <i>Value: {@value}</i>
     */
    public static final String IDENTITY = "9090";

    /**
     * The IKEA TRÅDFRI API code for a preshared key property<br>
     * <i>Value: {@value}</i>
     */
    public static final String PRESHARED_KEY = "9091";

    /**
     * The IKEA TRÅDFRI API code for a gateway firmware version property<br>
     * <i>Value: {@value}</i>
     */
    public static final String GATEWAY_FIRMWARE_VERSION = "9029";

}
