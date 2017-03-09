package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SuburbNodeScope
@Subcomponent(modules = {SuburbNodeModule.class})
public interface SuburbNodeComponent {

    SuburbNodeRuleProvider getSuburbNodeRuleProvider();
    Map<String, RuleProvider<SuburbNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSuburbNodeModule(SuburbNodeModule module);

        SuburbNodeComponent build();
    }
}
