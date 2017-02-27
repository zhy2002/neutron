package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustNameNode;


@TrustNameNodeScope
public class TrustNameNodeRuleProvider
    extends StringUiNodeRuleProvider<TrustNameNode> {

    @Inject
    public TrustNameNodeRuleProvider() {}

    @Override
    public void initializeState(TrustNameNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
