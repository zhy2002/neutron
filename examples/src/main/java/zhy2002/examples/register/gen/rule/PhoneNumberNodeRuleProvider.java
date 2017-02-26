package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.PhoneNumberNode;


@PhoneNumberNodeScope
public class PhoneNumberNodeRuleProvider
    extends PhoneInfoFieldNodeRuleProvider<PhoneNumberNode> {

    @Inject
    public PhoneNumberNodeRuleProvider() {}

    @Override
    public void initializeState(PhoneNumberNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
