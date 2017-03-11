package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherAssetOwnershipListNodeScope
@Subcomponent(modules = {OtherAssetOwnershipListNodeModule.class})
public interface OtherAssetOwnershipListNodeComponent {

    OtherAssetOwnershipListNodeRuleProvider getOtherAssetOwnershipListNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetOwnershipListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetOwnershipListNodeModule(OtherAssetOwnershipListNodeModule module);

        OtherAssetOwnershipListNodeComponent build();
    }
}
