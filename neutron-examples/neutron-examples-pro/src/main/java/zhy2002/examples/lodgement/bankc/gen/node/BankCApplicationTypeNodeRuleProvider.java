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
import zhy2002.neutron.rule.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.bankc.gen.rule.*;
import zhy2002.examples.lodgement.shared.*;


@ComponentScope
public class BankCApplicationTypeNodeRuleProvider extends ApplicationTypeNodeRuleProvider {

    @Inject
    public BankCApplicationTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.APPLICATION_TYPE);
        node.setRequired(true);
    }

    @Inject
    Provider<ChangeApplicationTypeRule> changeApplicationTypeRuleProvider;

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        {
            ChangeApplicationTypeRule changeApplicationTypeRule = changeApplicationTypeRuleProvider.get();
            createdRules.add(changeApplicationTypeRule);
        }
    }

}
