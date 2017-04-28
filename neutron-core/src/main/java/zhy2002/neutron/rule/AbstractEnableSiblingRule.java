package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.util.NeutronConstants;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;

/**
 * Base class for EnableSiblingRules.
 */
public abstract class AbstractEnableSiblingRule<N extends LeafUiNode<?, T>, T> extends UiNodeRule<N> {

    private String siblingName;
    private T enablingValue;
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

        if (getEnablingValue().equals(getOwner().getValue())) {
            sibling.setDisabled(false);
        } else {
            sibling.unloadDirectly();
            sibling.loadDirectly();
            sibling.setDisabled(true);
        }
    }
}
