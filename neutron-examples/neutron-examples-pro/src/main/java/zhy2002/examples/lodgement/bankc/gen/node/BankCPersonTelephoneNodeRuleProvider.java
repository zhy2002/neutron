package zhy2002.examples.lodgement.bankc.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ComponentScope
public class BankCPersonTelephoneNodeRuleProvider extends PersonTelephoneNodeRuleProvider {

    @Inject
    public BankCPersonTelephoneNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonTelephoneNode node) {
        super.initializeState(node);

        node.setEmptyValue(new Telephone("+61"));
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}