package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ReceiveOffersNodeScope
@Subcomponent(modules = {ReceiveOffersNodeModule.class})
public interface ReceiveOffersNodeComponent {

    RuleProvider<ReceiveOffersNode> getReceiveOffersNodeRuleProvider();
    Map<String, RuleProvider<ReceiveOffersNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setReceiveOffersNodeModule(ReceiveOffersNodeModule module);

        ReceiveOffersNodeComponent build();
    }
}
