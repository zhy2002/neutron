package zhy2002.examples.lodgement.bankb.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class BankBBaseApplicantTypeNodeRuleProvider extends BaseApplicantTypeNodeRuleProvider {

    @Inject
    public BankBBaseApplicantTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(BaseApplicantTypeNode<?> node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.APPLICANT_TYPE);
        node.setRequired(true);
        node.setValue("A");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
