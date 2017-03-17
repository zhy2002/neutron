package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@IdNodeScope
@Subcomponent(modules = {IdNodeModule.class})
public interface IdNodeComponent {

    IdNodeRuleProvider getIdNodeRuleProvider();
    Map<String, RuleProvider<IdNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setIdNodeModule(IdNodeModule module);

        IdNodeComponent build();
    }
}