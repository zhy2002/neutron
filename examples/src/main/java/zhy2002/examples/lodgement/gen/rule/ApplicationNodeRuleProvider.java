package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.ApplicationNode;


@ApplicationNodeScope
public class ApplicationNodeRuleProvider
    extends ObjectUiNodeRuleProvider<ApplicationNode> {

    @Inject
    public ApplicationNodeRuleProvider() {}

    @Override
    public void initializeState(ApplicationNode node) {
    }


    @Inject
    Provider<CreateErrorNodeRule> createErrorNodeRuleProvider;
    @Inject
    Provider<ShowErrorListRule> showErrorListRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(createErrorNodeRuleProvider.get());
            createdRules.add(showErrorListRuleProvider.get());
    }

}
