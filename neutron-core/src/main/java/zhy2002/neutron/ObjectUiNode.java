package zhy2002.neutron;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * A ParentUiNode whose children are exposed as properties.
 */
public abstract class ObjectUiNode<P extends ParentUiNode<?>> extends ParentUiNode<P> {

    protected ObjectUiNode(@NotNull P parent, @NotNull String name) {
        super(parent, name);
    }

    protected ObjectUiNode(@NotNull UiNodeContext<?> context) {
        super(context);
    }

    @Override
    protected void addContent() {
        List<UiNode<?>> children = createChildren();
        for (int i = 0; i < children.size(); i++) {
            UiNode<?> child = children.get(i);
            child.addToParent();
            child.setIndex(i);
        }

        super.addContent();
    }

    @Override
    protected void loadContent() {
        for (UiNode<?> child : getChildren()) {
            if (child.getLoadWithParent()) {
                child.load();
            }
        }

        super.loadContent();
    }

    protected
    @NotNull
    List<UiNode<?>> createChildren() {
        return new ArrayList<>();
    }

    @JsMethod
    @Override
    public final int getChildCount() {
        return super.getChildCount();
    }

    @JsMethod
    public UiNode<?> getChildByName(String name) {
        return super.getChild(name);
    }

    @Override
    public boolean hasValue() {
        return getHasValue();
    }

    //region node properties

    public static final PropertyMetadata<String> SELECTED_NAME_PROPERTY = MetadataRegistry.createProperty(ObjectUiNode.class, "selectedName", String.class, ChangeTrackingModeEnum.Value);

    @JsMethod
    public String getSelectedName() {
        return getStateValue(SELECTED_NAME_PROPERTY);
    }

    @JsMethod
    public void setSelectedName(String value) {
        setStateValue(SELECTED_NAME_PROPERTY, value);
    }

    //endregion

}
