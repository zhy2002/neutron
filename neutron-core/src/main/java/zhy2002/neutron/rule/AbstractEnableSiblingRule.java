package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.config.NeutronConstants;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;

/**
 * Base class for EnableSiblingRules.
 */
public abstract class AbstractEnableSiblingRule<N extends LeafUiNode<?, T>, T> extends UiNodeRule<N> {

    private String siblingName;
    private T enablingValue;
    private T disablingValue;
    private UiNode<?> sibling;

    protected AbstractEnableSiblingRule(@NotNull N owner, @NotNull T enablingValue) {
        super(owner);
        this.enablingValue = enablingValue;
    }

    public final String getSiblingName() {
        return siblingName;
    }

    public final void setSiblingName(String siblingName) {
        this.siblingName = siblingName;
    }

    public final T getEnablingValue() {
        return enablingValue;
    }

    public final void setEnablingValue(@NotNull T enablingValue) {
        this.enablingValue = enablingValue;
        this.disablingValue = null;
    }

    public T getDisablingValue() {
        return disablingValue;
    }

    public void setDisablingValue(T disablingValue) {
        this.disablingValue = disablingValue;
        this.enablingValue = null;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(this::updateSibling, NeutronConstants.NODE_LOADED_REFRESH_REASON)
        );
    }

    void updateSibling(UiNodeEvent event) {
        if (sibling == null) {
            if (getSiblingName() == null)
                return;

            sibling = getOwner().getParent().getChild(getSiblingName());

            if (sibling == null)
                return;
        }

        boolean enable;
        if (getEnablingValue() != null) {
            enable = getEnablingValue().equals(getOwner().getValue());
        } else if (getDisablingValue() != null) {
            enable = !getDisablingValue().equals(getOwner().getValue());
        } else {
            return;
        }
        if (enable) {
            sibling.setDisabled(false);
        } else {
            sibling.unloadDirectly();
            sibling.loadDirectly();
            sibling.setDisabled(true);
        }
    }
}
