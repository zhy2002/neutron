package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FeeTypeNodeScope
@Subcomponent(modules = {FeeTypeNodeModule.class})
public interface FeeTypeNodeComponent {

    FeeTypeNodeRuleProvider getFeeTypeNodeRuleProvider();
    Map<String, RuleProvider<FeeTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeeTypeNodeModule(FeeTypeNodeModule module);

        FeeTypeNodeComponent build();
    }
}
