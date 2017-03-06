package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@PayeEmployedNodeScope
@Subcomponent(modules = {PayeEmployedNodeModule.class})
public interface PayeEmployedNodeComponent {

    PayeEmployedNodeRuleProvider getPayeEmployedNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPayeEmployedNodeModule(PayeEmployedNodeModule module);

        PayeEmployedNodeComponent build();
    }
}
