package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.CountryCodeNode;


@CountryCodeNodeScope
public class CountryCodeNodeRuleProvider
    extends PhoneInfoFieldNodeRuleProvider<CountryCodeNode> {

    @Inject
    public CountryCodeNodeRuleProvider() {}

    @Override
    public void initializeState(CountryCodeNode node) {
    }



    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
