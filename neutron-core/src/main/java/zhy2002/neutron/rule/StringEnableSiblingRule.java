package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;

/**
 * Enable a sibling node if owner has a certain value.
 */
public class StringEnableSiblingRule extends UiNodeRule<StringUiNode<?>> {

    private String siblingName;
    private String enablingValue = "Yes";
    private UiNode<?> sibling;

    @Inject
    protected StringEnableSiblingRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    public String getSiblingName() {
        return siblingName;
    }

    public void setSiblingName(String siblingName) {
        this.siblingName = siblingName;
    }

    public String getEnablingValue() {
        return enablingValue;
    }

    public void setEnablingValue(@NotNull String enablingValue) {
        this.enablingValue = enablingValue;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::updateSibling, NeutronEventSubjects.NODE_LOADED_REFRESH_REASON),
                new StringStateChangeEventBinding(this::updateSibling)
        );
    }

    private void updateSibling(UiNodeEvent event) {
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

