package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@AccessTelephoneNodeScope
public class BankAAccessTelephoneNodeRuleProvider extends AccessTelephoneNodeRuleProvider {

    @Inject
    public BankAAccessTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(AccessTelephoneNode node) {
        super.initializeState(node);

        node.setCountryCodeReadonly(Boolean.TRUE);
        node.setValue(ApplicationNodeConstants.AUS_DEFAULT);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
