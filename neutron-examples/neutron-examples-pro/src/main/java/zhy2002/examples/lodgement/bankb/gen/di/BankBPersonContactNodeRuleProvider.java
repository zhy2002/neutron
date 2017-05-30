package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankb.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@PersonContactNodeScope
public class BankBPersonContactNodeRuleProvider extends PersonContactNodeRuleProvider {

    @Inject
    public BankBPersonContactNodeRuleProvider() {
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
