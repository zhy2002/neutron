package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ApplicantReferenceNode extends ReferenceUiNode<OwnershipNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ApplicantReferenceNode.class;
    }

    private ApplicantReferenceNodeComponent component;

    @Inject
    void createComponent(ApplicantReferenceNodeComponent.Builder builder) {
        this.component = builder.setApplicantReferenceNodeModule(new ApplicantReferenceNodeModule(this)).build();
    }

    private RuleProvider<ApplicantReferenceNode> getRuleProvider() {
        return component.getApplicantReferenceNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<ApplicantReferenceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ApplicantReferenceNode(@NotNull OwnershipNode parent, String name) {
        super(parent, name);
    }

}
