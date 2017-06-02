package zhy2002.examples.lodgement.bankb.gen.node;
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
public class BankBPostcodeNodeRuleProvider extends PostcodeNodeRuleProvider {

    @Inject
    public BankBPostcodeNodeRuleProvider() {
    }

    @Override
    public void initializeState(PostcodeNode node) {
        super.initializeState(node);

        node.setRequired(true);
        node.setPattern("\\d{4,4}");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
