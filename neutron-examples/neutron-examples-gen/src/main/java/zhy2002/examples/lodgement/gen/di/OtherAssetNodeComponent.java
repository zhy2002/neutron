package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherAssetNodeModule.class})
public interface OtherAssetNodeComponent {

    List<RuleProvider<OtherAssetNode>> provideRuleProviders();

    OtherAssetTypeNode createOtherAssetTypeNode();
    OtherAssetDescriptionNode createOtherAssetDescriptionNode();
    OtherAssetMarketValueNode createOtherAssetMarketValueNode();
    OtherAssetOwnershipListNode createOtherAssetOwnershipListNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetNodeModule(OtherAssetNodeModule module);

        OtherAssetNodeComponent build();
    }

}
