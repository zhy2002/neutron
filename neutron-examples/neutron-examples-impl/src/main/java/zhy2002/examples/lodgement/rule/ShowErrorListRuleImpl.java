package zhy2002.examples.lodgement.rule;


import zhy2002.examples.lodgement.data.ApplicationNodeConstants;
import zhy2002.examples.lodgement.gen.event.ErrorNodeAddEvent;
import zhy2002.examples.lodgement.gen.event.ErrorNodeRemoveEvent;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;
import zhy2002.examples.lodgement.gen.node.ErrorNode;
import zhy2002.examples.lodgement.gen.rule.ShowErrorListRule;
import zhy2002.examples.lodgement.node.ErrorListNodeImpl;
import zhy2002.examples.lodgement.shared.NodeUtil;
import zhy2002.neutron.*;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

public class ShowErrorListRuleImpl extends ShowErrorListRule {

    private Logger logger = Logger.getLogger("ShowErrorListRuleImpl");
    @Inject
    NodeFinder nodeFinder;

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
                new NodeAddEventBinding<>(
                        event -> ((ErrorListNodeImpl) getApplicationNode().getErrorListNode()).clearSortedErrors(),
                        ErrorNodeAddEvent.class
                ),
                new NodeRemoveEventBinding<>(
                        event -> {
                            if (getApplicationNode().getErrorListNode().getItemCount() == 0) {
                                getApplicationNode().setShowErrorList(Boolean.FALSE);
                            }
                            ((ErrorListNodeImpl) getApplicationNode().getErrorListNode()).clearSortedErrors();
                        },
                        ErrorNodeRemoveEvent.class
                )
        );
    }

    private void updateShowErrorList(RefreshUiNodeEvent event) {

        ApplicationNode applicationNode = getApplicationNode();

        if (applicationNode.getErrorListNode().getItemCount() > 0) {
            applicationNode.setShowErrorList(Boolean.TRUE);
            notifyInitialFocus();
        } else {
            applicationNode.setShowErrorList(Boolean.FALSE);
        }
    }

    private void notifyInitialFocus() {
        ApplicationNode applicationNode = getApplicationNode();
        UiNode<?> contentNode = applicationNode.getContentNode();
        logger.warning(contentNode.getPath());
        if (NodeUtil.hasTab(contentNode.getParent())) {
            ObjectUiNode<?> objectUiNode = (ObjectUiNode<?>) contentNode;
            if (objectUiNode.getSelectedName() != null) {
                contentNode = objectUiNode.getChild(objectUiNode.getSelectedName());
            }
        }
        ErrorListNodeImpl errorListNode = (ErrorListNodeImpl) applicationNode.getErrorListNode();
        Object[] errors = errorListNode.getSortedErrors();
        for (Object obj : errors) {
            ErrorNode errorNode = (ErrorNode) obj;
            if (nodeFinder.isAncestor(contentNode, errorNode.getSource())) {
                errorListNode.queueNotification(ApplicationNodeConstants.INITIAL_ERROR_FOCUS, errorNode);
                break;
            }
        }
    }
}
