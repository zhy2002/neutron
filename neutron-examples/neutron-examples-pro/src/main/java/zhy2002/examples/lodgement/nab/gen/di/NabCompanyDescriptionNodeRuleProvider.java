package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@CompanyDescriptionNodeScope
public class NabCompanyDescriptionNodeRuleProvider extends CompanyDescriptionNodeRuleProvider {

    @Inject
    public NabCompanyDescriptionNodeRuleProvider() {
    }

    @Override
    public void initializeState(CompanyDescriptionNode node) {
        super.initializeState(node);

        node.setRequired(true);
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
