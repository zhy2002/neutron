package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected ApplicantReferenceNodeRuleProvider getRuleProvider() {
        return component.getApplicantReferenceNodeRuleProvider();
    }

    public ApplicantReferenceNode(@NotNull OwnershipNode parent, String name) {
        super(parent, name);
    }

}
