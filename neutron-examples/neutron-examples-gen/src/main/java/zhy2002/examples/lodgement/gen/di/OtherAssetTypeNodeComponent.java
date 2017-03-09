package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherAssetTypeNodeScope
@Subcomponent(modules = {OtherAssetTypeNodeModule.class})
public interface OtherAssetTypeNodeComponent {

    OtherAssetTypeNodeRuleProvider getOtherAssetTypeNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetTypeNodeModule(OtherAssetTypeNodeModule module);

        OtherAssetTypeNodeComponent build();
    }
}
