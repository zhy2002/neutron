package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@ExistingMortgageNodeScope
@Subcomponent(modules = {ExistingMortgageNodeModule.class})
public interface ExistingMortgageNodeComponent {

    ExistingMortgageNodeRuleProvider getExistingMortgageNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setExistingMortgageNodeModule(ExistingMortgageNodeModule module);

        ExistingMortgageNodeComponent build();
    }
}
