package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PersonContactNodeScope
public class BankCPersonContactNodeRuleProvider extends PersonContactNodeRuleProvider {

    @Inject
    public BankCPersonContactNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonContactNode node) {
        super.initializeState(node);

    }

    @Inject
    Provider<HomeOrWorkPhoneRequiredRule> homeOrWorkPhoneRequiredRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        HomeOrWorkPhoneRequiredRule homeOrWorkPhoneRequiredRule = homeOrWorkPhoneRequiredRuleProvider.get();
        createdRules.add(homeOrWorkPhoneRequiredRule);
    }

}
