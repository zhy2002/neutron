package zhy2002.examples.lodgement.banka.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PreviousEmploymentListNodeScope
public class BankAPreviousEmploymentListNodeRuleProvider extends PreviousEmploymentListNodeRuleProvider {

    @Inject
    public BankAPreviousEmploymentListNodeRuleProvider() {
    }

    @Override
    public void initializeState(PreviousEmploymentListNode node) {
        super.initializeState(node);

        node.setNodeLabel("Previous Employment");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
