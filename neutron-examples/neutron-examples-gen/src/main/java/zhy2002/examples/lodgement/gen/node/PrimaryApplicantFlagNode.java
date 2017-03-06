package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class PrimaryApplicantFlagNode extends BooleanUiNode<PersonGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PrimaryApplicantFlagNode.class;
    }

    private PrimaryApplicantFlagNodeComponent component;

    @Inject
    void createComponent(PrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setPrimaryApplicantFlagNodeModule(new PrimaryApplicantFlagNodeModule(this)).build();
    }

    private PrimaryApplicantFlagNodeRuleProvider getRuleProvider() {
        return component.getPrimaryApplicantFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public PrimaryApplicantFlagNode(@NotNull PersonGeneralNode parent, String name) {
        super(parent, name);
    }

}
