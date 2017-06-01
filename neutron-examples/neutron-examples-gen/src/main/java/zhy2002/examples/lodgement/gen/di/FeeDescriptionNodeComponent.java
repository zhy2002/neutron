package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {FeeDescriptionNodeModule.class})
public interface FeeDescriptionNodeComponent {


    RuleProvider<FeeDescriptionNode> getFeeDescriptionNodeRuleProvider();
    Map<String, RuleProvider<FeeDescriptionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFeeDescriptionNodeModule(FeeDescriptionNodeModule module);

        FeeDescriptionNodeComponent build();
    }

}
