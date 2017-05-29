package zhy2002.examples.lodgement.cba.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;


@LegalActionNodeScope
public class CbaLegalActionNodeRuleProvider extends LegalActionNodeRuleProvider {

    @Inject
    public CbaLegalActionNodeRuleProvider() {
    }

    @Override
    public void initializeState(LegalActionNode node) {
        super.initializeState(node);

        node.setValue("No");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
