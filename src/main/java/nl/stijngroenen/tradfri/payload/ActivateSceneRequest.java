package nl.stijngroenen.tradfri.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import nl.stijngroenen.tradfri.util.ApiCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ActivateSceneRequest {
    @JsonProperty(ApiCode.ON_OFF)
    @JsonFormat(shape= JsonFormat.Shape.NUMBER)
    private boolean on;

    @JsonProperty(ApiCode.SCENE_ID)
    private int sceneId;

    public ActivateSceneRequest(boolean on, int sceneId) {
        this.on = on;
        this.sceneId = sceneId;
    }

    public ActivateSceneRequest() {
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSceneId() {
        return sceneId;
    }

    public void setSceneId(int sceneId) {
        this.sceneId = sceneId;
    }
}
