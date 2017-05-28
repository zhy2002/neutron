package zhy2002.examples.lodgement.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.node.BaseResponsibleLendNode;
import zhy2002.examples.lodgement.gen.di.*;


public class BaseResponsibleLendNodeRuleProvider implements RuleProvider<BaseResponsibleLendNode<?>> {

    @Inject
    ObjectUiNodeRuleProvider parentRuleProvider;

    @Inject
    public BaseResponsibleLendNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseResponsibleLendNode<?> node) {
        parentRuleProvider.initializeState(node);

    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
