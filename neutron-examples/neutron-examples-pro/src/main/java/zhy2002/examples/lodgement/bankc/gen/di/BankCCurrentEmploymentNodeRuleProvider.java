package zhy2002.examples.lodgement.bankc.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CurrentEmploymentNodeScope
public class BankCCurrentEmploymentNodeRuleProvider extends CurrentEmploymentNodeRuleProvider {

    @Inject
    public BankCCurrentEmploymentNodeRuleProvider() {
    }

    @Override
    public void initializeState(CurrentEmploymentNode node) {
        super.initializeState(node);

        node.setNodeLabel("Employment");
        node.setCurrentRecord(Boolean.TRUE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}