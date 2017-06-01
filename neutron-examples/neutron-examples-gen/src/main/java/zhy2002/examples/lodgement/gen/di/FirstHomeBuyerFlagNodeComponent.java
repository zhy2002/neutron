package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {FirstHomeBuyerFlagNodeModule.class})
public interface FirstHomeBuyerFlagNodeComponent {


    RuleProvider<FirstHomeBuyerFlagNode> getFirstHomeBuyerFlagNodeRuleProvider();
    Map<String, RuleProvider<FirstHomeBuyerFlagNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setFirstHomeBuyerFlagNodeModule(FirstHomeBuyerFlagNodeModule module);

        FirstHomeBuyerFlagNodeComponent build();
    }

}
