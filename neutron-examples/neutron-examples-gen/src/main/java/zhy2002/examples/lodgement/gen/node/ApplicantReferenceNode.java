package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ApplicantReferenceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ApplicantReferenceNode extends ReferenceUiNode<OwnershipNode> {

    @Inject
    protected ApplicantReferenceNode(@Owner OwnershipNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ApplicantReferenceNode.class;
    }

    protected final ApplicantReferenceNodeComponent getComponent() {
        return component;
    }


    private ApplicantReferenceNodeComponent component;

    @Inject
    void createComponent(ApplicantReferenceNodeComponent.Builder builder) {
        this.component = builder.setApplicantReferenceNodeModule(new ApplicantReferenceNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}
