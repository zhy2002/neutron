package zhy2002.examples.lodgement.rule;


import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.event.ErrorNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.util.PredefinedPhases;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class ShowErrorListRuleImpl extends ShowErrorListRule {

    @Inject
    public ShowErrorListRuleImpl(@Owner ApplicationNode owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        this::updateShowErrorList,
                        PredefinedPhases.Validate
                ),
                new NodeRemoveEventBinding<>(
                        event -> {
                            if(getApplicationNode().getErrorListNode().getItemCount() == 0) {
                                getApplicationNode().setShowErrorList(Boolean.FALSE);
                            }
                        },
                        ErrorNodeRemoveEvent.class
                )
        );
    }

    private void updateShowErrorList(RefreshUiNodeEvent event) {

        System.out.println("Updating show error list");

        ApplicationNode applicationNode = getApplicationNode();

        if (applicationNode.getErrorListNode().getItemCount() > 0) {
            applicationNode.setShowErrorList(Boolean.TRUE);
        } else {
            applicationNode.setShowErrorList(Boolean.FALSE);
        }
    }
}
