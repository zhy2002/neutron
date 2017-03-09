package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@OtherAssetDescriptionNodeScope
@Subcomponent(modules = {OtherAssetDescriptionNodeModule.class})
public interface OtherAssetDescriptionNodeComponent {

    OtherAssetDescriptionNodeRuleProvider getOtherAssetDescriptionNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetDescriptionNodeModule(OtherAssetDescriptionNodeModule module);

        OtherAssetDescriptionNodeComponent build();
    }
}
