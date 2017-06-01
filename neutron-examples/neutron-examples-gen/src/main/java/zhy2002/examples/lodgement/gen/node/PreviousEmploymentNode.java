package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PreviousEmploymentNode extends EmploymentNode<PreviousEmploymentListNode> {

    private PreviousEmploymentNodeComponent component;

    @Inject
    public PreviousEmploymentNode(@Owner PreviousEmploymentListNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PreviousEmploymentNode.class;
    }

    @Inject
    void createComponent(PreviousEmploymentNodeComponent.Builder builder) {
        this.component = builder.setPreviousEmploymentNodeModule(new PreviousEmploymentNodeModule(this)).build();
    }

    private RuleProvider<PreviousEmploymentNode> getRuleProvider() {
        return component.getPreviousEmploymentNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

}
