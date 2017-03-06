package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;

@OtherLiabilityTypeNodeScope
public class OtherLiabilityTypeNodeRuleProvider implements RuleProvider<OtherLiabilityTypeNode> {

    @Inject
    StringUiNodeRuleProvider parentRuleProvider;

    @Inject
    public OtherLiabilityTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(OtherLiabilityTypeNode node) {
        parentRuleProvider.initializeState(node);

        node.setOptions(ApplicationNodeConstants.OTHER_LIABILITY_TYPE.toArray());
    }


    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

        //todo move source to a profile
    }

}
