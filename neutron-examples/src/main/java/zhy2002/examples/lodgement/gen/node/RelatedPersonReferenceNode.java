package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class RelatedPersonReferenceNode extends ReferenceUiNode<SelectRelatedPersonNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return RelatedPersonReferenceNode.class;
    }

    private RelatedPersonReferenceNodeComponent component;

    @Inject
    void createComponent(RelatedPersonReferenceNodeComponent.Builder builder) {
        this.component = builder.setRelatedPersonReferenceNodeModule(new RelatedPersonReferenceNodeModule(this)).build();
    }

    @Override
    protected RelatedPersonReferenceNodeRuleProvider getRuleProvider() {
        return component.getRelatedPersonReferenceNodeRuleProvider();
    }

    public RelatedPersonReferenceNode(@NotNull SelectRelatedPersonNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRemoveEmpty(true);
    }

}
