package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@PersonListNodeScope
public class BankBPersonListNodeRuleProvider extends PersonListNodeRuleProvider {

    @Inject
    public BankBPersonListNodeRuleProvider() {
    }

    @Override
    public void initializeState(PersonListNode node) {
        super.initializeState(node);

        node.setNodeLabel("Person Applicant");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}