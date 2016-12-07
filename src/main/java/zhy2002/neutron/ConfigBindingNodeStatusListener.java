package zhy2002.neutron;


public class ConfigBindingNodeStatusListener<N extends UiNode<?>> implements UiNodeStatusListener {

    private final N node;
    private final UiNodeConfig<N> config;

    public ConfigBindingNodeStatusListener(N node, UiNodeConfig<N> config) {
        this.node = node;
        this.config = config;
    }

    @Override
    public void onAddedToParent() {
        config.onAddedToParent(node);
    }

    @Override
    public void onLoaded() {
        config.onLoaded(node);
    }
}
