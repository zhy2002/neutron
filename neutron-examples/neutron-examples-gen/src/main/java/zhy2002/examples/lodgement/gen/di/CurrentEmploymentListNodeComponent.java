package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CurrentEmploymentListNodeModule.class})
public interface CurrentEmploymentListNodeComponent {


    RuleProvider<CurrentEmploymentListNode> getCurrentEmploymentListNodeRuleProvider();
    Map<String, RuleProvider<CurrentEmploymentListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentListNodeModule(CurrentEmploymentListNodeModule module);

        CurrentEmploymentListNodeComponent build();
    }

}
