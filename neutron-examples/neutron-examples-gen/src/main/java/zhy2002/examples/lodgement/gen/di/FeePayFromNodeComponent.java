package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@FeePayFromNodeScope
@Subcomponent(modules = {FeePayFromNodeModule.class})
public interface FeePayFromNodeComponent {

    RuleProvider<FeePayFromNode> getFeePayFromNodeRuleProvider();
    Map<String, RuleProvider<FeePayFromNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeePayFromNodeModule(FeePayFromNodeModule module);

        FeePayFromNodeComponent build();
    }
}
