package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LegalActionNode extends YesNoOptionNode<BasePrivacyNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return LegalActionNode.class;
    }

    private LegalActionNodeComponent component;

    @Inject
    void createComponent(LegalActionNodeComponent.Builder builder) {
        this.component = builder.setLegalActionNodeModule(new LegalActionNodeModule(this)).build();
    }

    @Override
    protected LegalActionNodeRuleProvider getRuleProvider() {
        return component.getLegalActionNodeRuleProvider();
    }

    public LegalActionNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setValue("Yes");
    }

}