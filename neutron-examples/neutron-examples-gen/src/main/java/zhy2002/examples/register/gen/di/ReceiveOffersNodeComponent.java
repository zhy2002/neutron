package zhy2002.examples.register.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.node.*;

@ReceiveOffersNodeScope
@Subcomponent(modules = {ReceiveOffersNodeModule.class})
public interface ReceiveOffersNodeComponent {

    ReceiveOffersNodeRuleProvider getReceiveOffersNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setReceiveOffersNodeModule(ReceiveOffersNodeModule module);

        ReceiveOffersNodeComponent build();
    }
}
