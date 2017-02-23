package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;

@ApplicationNodeScope
public class ApplicationNodeRuleProvider extends ObjectUiNodeRuleProvider {

    @Inject
    public ApplicationNodeRuleProvider() {}

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
