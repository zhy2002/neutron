package zhy2002.examples.register.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.node.CountryCodeNode;
import zhy2002.examples.register.gen.di.*;
import zhy2002.examples.register.data.*;
import java.math.*;

@CountryCodeNodeScope
public class CountryCodeNodeRuleProvider implements RuleProvider<CountryCodeNode> {

    @Inject
    PhoneInfoFieldNodeRuleProvider parentRuleProvider;

    @Inject
    public CountryCodeNodeRuleProvider() {
    }

    @Override
    public void initializeState(CountryCodeNode node) {
        parentRuleProvider.initializeState(node);

        node.setRequiredMessage("Country code is required.");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

    }

}
