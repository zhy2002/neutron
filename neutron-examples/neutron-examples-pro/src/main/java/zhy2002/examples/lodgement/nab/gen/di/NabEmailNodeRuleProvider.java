package zhy2002.examples.lodgement.nab.gen.di;

import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import java.math.*;



public class NabEmailNodeRuleProvider extends EmailNodeRuleProvider {

    @Inject
    public NabEmailNodeRuleProvider() {
    }

    @Override
    public void initializeState(EmailNode<?> node) {
        super.initializeState(node);

        node.setPattern("\\w+@\\w+\\.[\\w.]+");
    }

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    }

}
