package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {FeeTypeNodeModule.class})
public interface FeeTypeNodeComponent {


    RuleProvider<FeeTypeNode> getFeeTypeNodeRuleProvider();
    Map<String, RuleProvider<FeeTypeNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeeTypeNodeModule(FeeTypeNodeModule module);

        FeeTypeNodeComponent build();
    }

}
