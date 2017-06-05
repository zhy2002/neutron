package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RelatedPersonReferenceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RelatedPersonReferenceNode extends ReferenceUiNode<SelectRelatedPersonNode> {

    @Inject
    protected RelatedPersonReferenceNode(@Owner SelectRelatedPersonNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RelatedPersonReferenceNode.class;
    }

    protected final RelatedPersonReferenceNodeComponent getComponent() {
        return component;
    }


    private RelatedPersonReferenceNodeComponent component;

    @Inject
    void createComponent(RelatedPersonReferenceNodeComponent.Builder builder) {
        this.component = builder.setRelatedPersonReferenceNodeModule(new RelatedPersonReferenceNodeModule(this)).build();
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
