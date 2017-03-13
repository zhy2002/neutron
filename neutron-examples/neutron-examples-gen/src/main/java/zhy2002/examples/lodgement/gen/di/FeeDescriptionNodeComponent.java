package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FeeDescriptionNodeScope
@Subcomponent(modules = {FeeDescriptionNodeModule.class})
public interface FeeDescriptionNodeComponent {

    FeeDescriptionNodeRuleProvider getFeeDescriptionNodeRuleProvider();
    Map<String, RuleProvider<FeeDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeeDescriptionNodeModule(FeeDescriptionNodeModule module);

        FeeDescriptionNodeComponent build();
    }
}
