package nl.stijngroenen.tradfri.device;

import nl.stijngroenen.tradfri.payload.ActivateSceneRequest;
import nl.stijngroenen.tradfri.util.ApiEndpoint;
import nl.stijngroenen.tradfri.util.CoapClient;

/**
 * A class dealing with everything that relates to IKEA TRÅDFRI Scenes.
 */
public class Scene {
    private final String name;
    private final int instanceId;
    private final long creationDate;
    private final SceneProperties properties;
    private final Group group;
    private final CoapClient client;

    public Scene(String name,
                 int instanceId,
                 long creationDate,
                 SceneProperties properties,
                 Group group,
                 CoapClient client) {
        this.name = name;
        this.instanceId = instanceId;
        this.creationDate = creationDate;
        this.properties = properties;
        this.group = group;
        this.client = client;
    }

    public String getName() {
        return name;
    }

    public int getInstanceId() {
        return instanceId;
    }

    public long getCreationDate() {
        return creationDate;
    }

    public void activate() {
        final String uri = ApiEndpoint.getUri(ApiEndpoint.GROUPS, String.valueOf(group.getInstanceId()));
        client.put(uri, new ActivateSceneRequest(true, getInstanceId()), String.class);
    }

}
