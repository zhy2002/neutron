package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@ApplicationNodeScope
public class BankAApplicationNodeRuleProvider extends ApplicationNodeRuleProvider {

    @Inject
    public BankAApplicationNodeRuleProvider() {
    }

    @Override
    public void initializeState(ApplicationNode node) {
        super.initializeState(node);

        node.setNodeLabel("Bank A");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
