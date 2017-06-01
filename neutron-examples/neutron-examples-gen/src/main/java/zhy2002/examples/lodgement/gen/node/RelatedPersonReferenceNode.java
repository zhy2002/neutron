package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RelatedPersonReferenceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RelatedPersonReferenceNode extends ReferenceUiNode<SelectRelatedPersonNode> {

    @Inject
    public RelatedPersonReferenceNode(@Owner SelectRelatedPersonNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<RelatedPersonReferenceNode> getRuleProvider() {
        return component.getRelatedPersonReferenceNodeRuleProvider();
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

    private RuleProvider<RelatedPersonReferenceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}
