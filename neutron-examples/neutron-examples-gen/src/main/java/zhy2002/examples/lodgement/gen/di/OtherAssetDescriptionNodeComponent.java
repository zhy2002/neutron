package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {OtherAssetDescriptionNodeModule.class})
public interface OtherAssetDescriptionNodeComponent {

    RuleProvider<OtherAssetDescriptionNode> getOtherAssetDescriptionNodeRuleProvider();
    Map<String, RuleProvider<OtherAssetDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetDescriptionNodeModule(OtherAssetDescriptionNodeModule module);

        OtherAssetDescriptionNodeComponent build();
    }
}
