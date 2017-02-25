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

public class MobileNumberNode extends StringUiNode<PersonContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MobileNumberNode.class;
    }

    private MobileNumberNodeComponent component;

    @Inject
    void createComponent(MobileNumberNodeComponent.Builder builder) {
        this.component = builder.setMobileNumberNodeModule(new MobileNumberNodeModule(this)).build();
    }

    @Override
    protected MobileNumberNodeRuleProvider getRuleProvider() {
        return component.getMobileNumberNodeRuleProvider();
    }

    public MobileNumberNode(PersonContactNode parent, String name) {
        super(parent, name);
    }

}
