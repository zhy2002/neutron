package zhy2002.examples.lodgement.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.di.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.EmployerPhoneNode;


@EmployerPhoneNodeScope
public class EmployerPhoneNodeRuleProvider
    extends TelephoneNodeRuleProvider<EmployerPhoneNode> {

    @Inject
    public EmployerPhoneNodeRuleProvider() {}

    @Override
    public void initializeState(EmployerPhoneNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
