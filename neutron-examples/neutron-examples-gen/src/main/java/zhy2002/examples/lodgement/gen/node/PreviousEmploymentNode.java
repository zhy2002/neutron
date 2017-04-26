package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class PreviousEmploymentNode extends EmploymentNode<PreviousEmploymentListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PreviousEmploymentNode.class;
    }

    private PreviousEmploymentNodeComponent component;

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


    public PreviousEmploymentNode(@NotNull PreviousEmploymentListNode parent, String name) {
        super(parent, name);
    }

}
