package zhy2002.examples.register.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import zhy2002.examples.register.gen.di.*;
import javax.inject.*;

@OwnInvestmentPropertyNodeScope
public class OwnInvestmentPropertyNodeRuleProvider extends BooleanUiNodeRuleProvider {

    @Inject
    public OwnInvestmentPropertyNodeRuleProvider() {}

    @Inject
    Provider<LoadInvestmentPropertyRule> loadInvestmentPropertyRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

            createdRules.add(loadInvestmentPropertyRuleProvider.get());
    }

}
