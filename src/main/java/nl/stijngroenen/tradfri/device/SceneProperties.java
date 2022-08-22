package nl.stijngroenen.tradfri.device;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.stijngroenen.tradfri.util.ApiCode;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SceneProperties {

    /**
     * The name of the scene
     */
    @JsonProperty(ApiCode.NAME)
    private String name;

    /**
     * Whether this scene is currently active
     */
    @JsonProperty(ApiCode.SCENE_ACTIVATE_FLAG)
    @JsonFormat(shape = JsonFormat.Shape.NUMBER)
    private boolean isActive;

    /**
     * The icon of this Scene in the app
     */
    @JsonProperty(ApiCode.SCENE_ICON_ID)
    private int sceneIconId;

    /**
     * The index of the Scene in the scene list
     */
    @JsonProperty(ApiCode.SCENE_INDEX)
    private int sceneIndex;

    /**
     * IKEA Moods (?)
     */
    @JsonProperty(ApiCode.IKEA_MOODS)
    private int ikeaMoods = 0;

    /**
     * Whether to use existing light settings (light-only?)
     */
    @JsonProperty(ApiCode.USE_CURRENT_LIGHT_SETTINGS)
    private int useCurrentLightSettings = 0;

    /**
     * Light settings belonging to this Scene
     */
    @JsonProperty(ApiCode.LIGHT_SETTINGS)
    private List<LightProperties> lightSettings = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getSceneIconId() {
        return sceneIconId;
    }

    public void setSceneIconId(int sceneIconId) {
        this.sceneIconId = sceneIconId;
    }

    public int getSceneIndex() {
        return sceneIndex;
    }

    public void setSceneIndex(int sceneIndex) {
        this.sceneIndex = sceneIndex;
    }

    public int getIkeaMoods() {
        return ikeaMoods;
    }

    public void setIkeaMoods(int ikeaMoods) {
        this.ikeaMoods = ikeaMoods;
    }

    public int getUseCurrentLightSettings() {
        return useCurrentLightSettings;
    }

    public void setUseCurrentLightSettings(int useCurrentLightSettings) {
        this.useCurrentLightSettings = useCurrentLightSettings;
    }

    public List<LightProperties> getLightSettings() {
        return lightSettings;
    }

    public void setLightSettings(List<LightProperties> lightSettings) {
        this.lightSettings = lightSettings;
    }
}
