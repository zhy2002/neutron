package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {OtherIncomeTypeNodeModule.class})
public interface OtherIncomeTypeNodeComponent {

    List<RuleProvider<OtherIncomeTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setOtherIncomeTypeNodeModule(OtherIncomeTypeNodeModule module);

        OtherIncomeTypeNodeComponent build();
    }

}
