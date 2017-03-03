package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.TrustRegistrationDateNode;


@TrustRegistrationDateNodeScope
public class TrustRegistrationDateNodeRuleProvider
    extends StringUiNodeRuleProvider<TrustRegistrationDateNode> {

    @Inject
    public TrustRegistrationDateNodeRuleProvider() {}

    @Override
    public void initializeState(TrustRegistrationDateNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
