package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class CreditCheckFlagNode extends BooleanUiNode<PersonPrivacyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCheckFlagNode.class;
    }

    private CreditCheckFlagNodeComponent component;

    @Inject
    void createComponent(CreditCheckFlagNodeComponent.Builder builder) {
        this.component = builder.setCreditCheckFlagNodeModule(new CreditCheckFlagNodeModule(this)).build();
    }

    @Override
    protected CreditCheckFlagNodeRuleProvider getRuleProvider() {
        return component.getCreditCheckFlagNodeRuleProvider();
    }

    public CreditCheckFlagNode(PersonPrivacyNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setFixedValue(true);
    }

}
