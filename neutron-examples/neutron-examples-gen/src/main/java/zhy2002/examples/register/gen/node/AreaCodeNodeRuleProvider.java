package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@AreaCodeNodeScope
public class AreaCodeNodeRuleProvider implements RuleProvider<AreaCodeNode> {

    @Inject
    PhoneInfoFieldNodeRuleProvider parentRuleProvider;

    @Inject
    public AreaCodeNodeRuleProvider() {
    }

    @Override
    public void initializeState(AreaCodeNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequiredMessage("Area code is required.");
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
