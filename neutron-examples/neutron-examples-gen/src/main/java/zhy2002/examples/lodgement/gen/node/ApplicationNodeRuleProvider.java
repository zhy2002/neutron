package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@ApplicationNodeScope
public class ApplicationNodeRuleProvider implements RuleProvider<ApplicationNode> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public ApplicationNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationNode node) {
        parentRuleProvider.initializeState(node);

        node.setSelectedName("personListNode");
        node.setChangeTrackingMode(ApplicationNodeConstants.CONTENT_LEVEL, ChangeTrackingModeEnum.Always);
    }

    @Inject
    Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;
    @Inject
    Provider<ShowErrorListRule> showErrorListRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

            createdRules.add(createErrorNodeRuleProvider.get());
            createdRules.add(showErrorListRuleProvider.get());
    }

}
