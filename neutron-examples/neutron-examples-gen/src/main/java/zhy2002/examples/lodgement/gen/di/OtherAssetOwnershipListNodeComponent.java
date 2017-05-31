package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherAssetOwnershipListNodeModule.class})
public interface OtherAssetOwnershipListNodeComponent {

    RuleProvider<OtherAssetOwnershipListNode> getOtherAssetOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetOwnershipListNodeModule(OtherAssetOwnershipListNodeModule module);

        OtherAssetOwnershipListNodeComponent build();
    }
}
