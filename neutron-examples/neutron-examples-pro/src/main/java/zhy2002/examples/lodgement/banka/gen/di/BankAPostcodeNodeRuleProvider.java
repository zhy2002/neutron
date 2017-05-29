package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PostcodeNodeScope
public class BankAPostcodeNodeRuleProvider extends PostcodeNodeRuleProvider {

    @Inject
    public BankAPostcodeNodeRuleProvider() {
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
