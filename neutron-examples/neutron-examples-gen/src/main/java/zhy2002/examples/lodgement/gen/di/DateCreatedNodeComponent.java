package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@DateCreatedNodeScope
@Subcomponent(modules = {DateCreatedNodeModule.class})
public interface DateCreatedNodeComponent {

    DateCreatedNodeRuleProvider getDateCreatedNodeRuleProvider();
    Map<String, RuleProvider<DateCreatedNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setDateCreatedNodeModule(DateCreatedNodeModule module);

        DateCreatedNodeComponent build();
    }
}
