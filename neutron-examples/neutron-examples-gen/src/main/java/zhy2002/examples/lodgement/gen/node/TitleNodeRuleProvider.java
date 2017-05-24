package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.neutron.rule.*;

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

    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
