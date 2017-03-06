package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@TitleNodeScope
public class TitleNodeRuleProvider implements RuleProvider<TitleNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public TitleNodeRuleProvider() {
    }

    @Override
    public void initializeState(TitleNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.TITLE_TYPE.toArray());
        node.setRequired(true);
    }

    @Inject
    Provider<TitleGenderMatchRule> titleGenderMatchRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
            createdRules.add(titleGenderMatchRuleProvider.get());
    }

}
