package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CurrentEmploymentListNodeScope
@Subcomponent(modules = {CurrentEmploymentListNodeModule.class})
public interface CurrentEmploymentListNodeComponent {

    CurrentEmploymentListNodeRuleProvider getCurrentEmploymentListNodeRuleProvider();
    Map<String, RuleProvider<CurrentEmploymentListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCurrentEmploymentListNodeModule(CurrentEmploymentListNodeModule module);

        CurrentEmploymentListNodeComponent build();
    }
}
