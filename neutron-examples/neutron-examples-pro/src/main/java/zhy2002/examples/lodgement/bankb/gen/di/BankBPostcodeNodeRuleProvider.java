package zhy2002.examples.lodgement.bankb.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PostcodeNodeScope
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
