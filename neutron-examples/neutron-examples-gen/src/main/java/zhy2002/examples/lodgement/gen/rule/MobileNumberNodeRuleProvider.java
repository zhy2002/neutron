package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.MobileNumberNode;


@MobileNumberNodeScope
public class MobileNumberNodeRuleProvider
    extends StringUiNodeRuleProvider<MobileNumberNode> {

    @Inject
    public MobileNumberNodeRuleProvider() {}

    @Override
    public void initializeState(MobileNumberNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
