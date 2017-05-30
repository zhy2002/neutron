package zhy2002.examples.lodgement.banka.gen.di;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@StudentTypeNodeScope
public class BankAStudentTypeNodeRuleProvider extends StudentTypeNodeRuleProvider {

    @Inject
    public BankAStudentTypeNodeRuleProvider() {
    }

    @Override
    public void initializeState(StudentTypeNode node) {
        super.initializeState(node);

        node.setOptions(ApplicationNodeConstants.STUDENT_TYPE);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
