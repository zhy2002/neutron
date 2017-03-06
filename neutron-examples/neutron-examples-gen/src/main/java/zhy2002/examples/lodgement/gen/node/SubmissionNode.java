package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SubmissionNode extends ObjectUiNode<ApplicationNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SubmissionNode.class;
    }

    private SubmissionNodeComponent component;

    @Inject
    void createComponent(SubmissionNodeComponent.Builder builder) {
        this.component = builder.setSubmissionNodeModule(new SubmissionNodeModule(this)).build();
    }

    private SubmissionNodeRuleProvider getRuleProvider() {
        return component.getSubmissionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public SubmissionNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

}
