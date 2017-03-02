package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@ExistingMortgageListNodeScope
@Subcomponent(modules = {ExistingMortgageListNodeModule.class})
public interface ExistingMortgageListNodeComponent {

    ExistingMortgageListNodeRuleProvider getExistingMortgageListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageListNodeModule(ExistingMortgageListNodeModule module);

        ExistingMortgageListNodeComponent build();
    }
}
