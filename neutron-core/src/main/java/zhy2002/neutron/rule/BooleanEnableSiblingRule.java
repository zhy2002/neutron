package zhy2002.neutron.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.BooleanStateChangeEventBinding;
import zhy2002.neutron.node.BooleanUiNode;
import zhy2002.neutron.util.NeutronEventSubjects;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


/**
 * Enable a sibling node if owner has a certain value.
 */
public class BooleanEnableSiblingRule extends UiNodeRule<BooleanUiNode<?>> {

    private String siblingName;
    private Boolean enablingValue = Boolean.TRUE;
    private UiNode<?> sibling;

    @Inject
    protected BooleanEnableSiblingRule(@Owner BooleanUiNode<?> owner) {
        super(owner);
    }

    public String getSiblingName() {
        return siblingName;
    }

    public void setSiblingName(String siblingName) {
        this.siblingName = siblingName;
    }

    public Boolean getEnablingValue() {
        return enablingValue;
    }

    public void setEnablingValue(@NotNull Boolean enablingValue) {
        this.enablingValue = enablingValue;
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(this::updateSibling, Collections.singletonList(NeutronEventSubjects.NODE_LOADED_REFRESH_REASON)),
                new BooleanStateChangeEventBinding(this::updateSibling)
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
            sibling.unload();
            sibling.load();
            sibling.setDisabled(true);
        }
    }
}