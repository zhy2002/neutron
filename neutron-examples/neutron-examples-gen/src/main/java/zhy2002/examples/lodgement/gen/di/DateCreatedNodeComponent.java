package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {DateCreatedNodeModule.class})
public interface DateCreatedNodeComponent {


    RuleProvider<DateCreatedNode> getDateCreatedNodeRuleProvider();
    Map<String, RuleProvider<DateCreatedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateCreatedNodeModule(DateCreatedNodeModule module);

        DateCreatedNodeComponent build();
    }

}
